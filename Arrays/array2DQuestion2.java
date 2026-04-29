public class array2DQuestion2 {
    public static void arrayNumberSum(int num[][]) {
        int sum=0;
        for(int j=0; j<num[0].length; j++) {
            sum+=num[1][j];
        }
        System.out.println("Sum="+sum);
    }
    public static void main(String args[]) {
        int num[][] ={{1,4,9},
                      {11,4,3},
                      {2,2,3}};

        arrayNumberSum(num);
    }
}
