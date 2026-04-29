 public class RecursionQ1 {
    static String value[] = {"zero", "one", "two", "three","four","five","six","seven","eight","nine"};
    public static void main(String args[]) {
        int number = 2019;

        if (number==0){
            System.out.println("Zero");
        }
       
        englishConversion(number);


    }

    public static void englishConversion(int number) {
        
        if (number == 0){
            return;
        }
        englishConversion(number / 10);
        System.out.print(value[number % 10]+" ");
    }
}


// public class RecursionQ1{
//     Array to store English words for digits 0-9
//     static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

//     public static void main(String[] args) {
//         int number = 202;
//         printNumberInWords(number);
//     }

//     Wrapper method to handle negative numbers
//     public static void printNumberInWords(int number) {
//         if (number < 0) {
//             System.out.print("negative ");
//             Convert to positive for processing
//             number = -number; 
//         }
//         printDigits(number);
//     }

//     Recursive method to print digits in English
//     public static void printDigits(int number) {
//         if (number == 0) {
//             return;
//         }
        
//         Recursive call to process the next digit
//         printDigits(number / 10);

//         Print the corresponding word for the last digit
//         System.out.print(digits[number % 10] + " ");
//     }
// }
