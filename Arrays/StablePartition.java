import java.util.*;
public class StablePartition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            boolean possible =false;
            for(int i=0; i<n-2; i++){
                if(a[i]+a[i+1]>a[i+2]){
                    possible=true;
                    break;
                }
            }
            System.out.println(possible? "YES":"NO");
        }
        sc.close();
    }
}
