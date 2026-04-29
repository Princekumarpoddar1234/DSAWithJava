public class string4 {
    public static void largestString(String fruits[]) {
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0) {
                largest=fruits[i];
            }
        }

        for(int i=0; i<largest.length(); i++) {
            System.out.print(largest.charAt(i));
        }
    }

    public static void main(String args[]) {
        String fruits[] = {"apple","mango","banana"};
        largestString(fruits);
    }
}
