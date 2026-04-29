public class array2DQuestion1 {
    public static void count(int array[][]) {
        int flag=0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++) {
                if(array[i][j]==7) {
                    flag++;
                }
            }
        }
        System.out.println("Number of 7's="+flag);
    }
    public static void main(String args[]) {
        int array[][] = {{4,7,8},
                         {8,8,7}};
        count(array);
    }
}
