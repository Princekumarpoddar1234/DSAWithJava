public class string3 {
    public static void SubString(String str, int si, int ei) {
        String substr="";
        for(int i=si; i<ei; i++) {
            substr+=str.charAt(i);
        }
        System.out.print("using logic: ");
        for(int i=0; i<substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
    }

    public static void main(String args[]) {
        String str="HELLO WORLD";
        SubString(str,0,5);
        System.out.println("\nUsing default function: "+str.substring(0,5));
    }
}
