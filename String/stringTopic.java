import java.util.*;
public class stringTopic {
    //function to print letters of string

    // public static void printLetters(String name) {
    //     int j=name.length();
    //     for(int i=0 ;i<j; i++) {
    //         System.out.print(name.charAt(i)+" ");
    //     }
    // }

public static boolean isPalindrome(String str) {
    int j= str.length();
    for(int i=0; i<+j/2; i++) {
        if(str.charAt(i)!=str.charAt(j-i-1))
        return false;
    }
    return true;
}

    //main function introduction
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //printing letters of given name

        // System.out.print("What is you full Name: ");
        // String name= sc.nextLine();
        // System.out.println("Hello "+name+"\nLetters of given name are as folllows: ");
        // printLetters(name);

        //palindrome check
        System.out.println("Enter String to check for Palindrome: ");
        String str = sc.next();
        System.out.println(isPalindrome(str));
        sc.close();
    }
}
