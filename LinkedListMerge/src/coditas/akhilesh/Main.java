package coditas.akhilesh;

import java.util.*;

public class Main {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list1 = ListInput();
        List<Integer> list2 = ListInput();
        list1.addAll(list2);
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list1.toString());
    }

    public static LinkedList<Integer> ListInput(){
        LinkedList<Integer> lst = new LinkedList<>();
        System.out.print("Enter length of LinkedList: ");
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            lst.add(scan.nextInt());
        }
        return lst;
    }


}
