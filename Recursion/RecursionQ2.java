public class RecursionQ2 {
    public static void main(String args[]) {
        String str = "Hello";
        System.out.println(length(str));
    }

    public static int length(String str){
        if (str.length()==0){
            return 0;
        }

        return 1+ length(str.substring(1));
    }
}
