import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(5);
        list.add(6);

        
        mainlist.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(5);
        list2.add(7);

        mainlist.add(list2);
        System.out.println(mainlist);

        for(int i=0; i<mainlist.size(); i++) {
            ArrayList<Integer> currList = mainlist.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
