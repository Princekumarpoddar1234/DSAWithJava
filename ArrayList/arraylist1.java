import java.util.ArrayList;
public class arraylist1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(0);
        System.out.println(list);
        list.add(1,23);
        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains(8));
        list.set(2,77);
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
