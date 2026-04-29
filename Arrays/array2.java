public class array2 {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i]= marks[i]+1;
        }
    }                                            //program to conclude array operation as reference by default
    public static void main(String args []) {
        int marks[] = {97, 95, 93};
        update(marks);
        System.out.print("Updated marks:");
        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
