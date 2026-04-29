public class string2 {
    public static void main(String args[]) {
        String s1= "Venus";
        //String s2="Venus";
        String s3= new String("Venus");
        if (s1.equals(s3)) {
            System.out.println("s1 equal to s2");
        }

        else {
            System.out.println("s1 is not equal to s3");
        }
    }
}