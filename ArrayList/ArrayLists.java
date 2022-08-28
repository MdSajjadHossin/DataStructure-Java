import java.util.*;

class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add element
        list.add(4);
        list.add(5);
        list.add(10);

        // System.out.println(list);

        //get operation

        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1, 3);
        System.out.println(list);

        //set element
        list.set(0, 1);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //counting size
        int size = list.size();
        System.out.println(size);

        //loops in ArrayList
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sortting in AyyarList
        Collections.sort(list);
        System.out.println(list);



    }
}