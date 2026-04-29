// The problem is to implement a flood fill algorithm, which is commonly used in graphics applications to fill a contiguous area with a specific color.
// The algorithm starts from a given pixel (sr, sc) in a 2D image and changes the color of that pixel and all connected pixels of the same original color to a new specified color.
// The algorithm uses a depth-first search (DFS) approach to traverse the connected pixels and change their colors.
// The function `floodFill` takes the image, starting pixel coordinates, and the new color as inputs and returns the modified image.
// The helper function `helper` performs the DFS traversal and color change, ensuring that it only processes pixels that are within bounds, not already visited, and have the original color.
// The algorithm is useful for tasks like paint bucket tools in image editing software, where users can fill areas with a new color.
// The code is structured to handle the flood fill operation recursively, marking pixels as visited to avoid processing them multiple times.

public class graph19 {
    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol){
        if(sr<0 || sc<0 || sr>image.length || sc>image[0].length || vis[sr][sc] || image[sr][sc]!=orgCol){
            return;
        }

        //left
        helper(image, sr, sc-1, color, vis, orgCol);

        //right
        helper(image, sr, sc+1, color, vis, orgCol);

        //up
        helper(image, sr-1, sc, color, vis, orgCol);

        //down
        helper(image, sr+1, sc, color, vis, orgCol);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public static void main(String[] args){
        //create code for here
        // Example usage of the flood fill algorithm

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;
        int[][] result = floodFill(image, sr, sc, newColor);

        // Print the result to verify the flood fill
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
