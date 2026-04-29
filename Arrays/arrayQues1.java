public class arrayQues1 {
    public static boolean countNum(int num[]) {
        for(int i=0; i<num.length; i++)
        {
            int flag =0;
            for(int j=0; j<num.length; j++)
            {
                if (num[i] == num[j])
                flag++;
            }
            if (flag ==2){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int num[] = {1,2,3,4};
        System.out.println(countNum(num));
    }
}
