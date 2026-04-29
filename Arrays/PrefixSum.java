// import java.util.*;
// public class PrefixSum {
//     public static void Prefix(int numbers[]) {
//         int currsum = 0;
//         int Maxsum = Integer.MIN_VALUE;
//         int Prefix[] = new int[numbers.length];

//         Prefix[0] = numbers[0];
//         for (int i = 1; i < numbers.length; i++) {
           
//             Prefix[i] = Prefix[i - 1] + numbers[i];
//         }

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
           
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 currsum = (start == 0) ? Prefix[end]: Prefix[end] - Prefix[start - 1];
//             }

//             if (Maxsum < currsum) {
//                 Maxsum = currsum;
//             }
       
//         }
//         System.out.println("Maximumn sum is :" + Maxsum);
       
//     }   
   
//     }
// public static void main(String args[]) {
//     int numbers[] = { 1, -2, 6, -1, 3 };
//     Prefix(numbers);
// }

// import java.util.*;
public class PrefixSum {

    public static void Prefix(int numbers[]) {
        int currsum = 0;
        int Maxsum = Integer.MIN_VALUE;
        int Prefix[] = new int[numbers.length];

        
        Prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            Prefix[i] = Prefix[i - 1] + numbers[i];
        }

        
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                
                currsum = (start == 0) ? Prefix[end] : Prefix[end] - Prefix[start - 1];
                
                if (Maxsum < currsum) {
                    Maxsum = currsum;
                }
            }
        }

        
        System.out.println("Maximum sum is: " + Maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        Prefix(numbers);
    }
}
