import java.util.*;


class LinkdList{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();


        //addition first
        list.addFirst("b");
        list.addFirst("c");

        System.out.println(list);

        //addition last
        list.addFirst("a");
        list.addLast("e");

        System.out.println(list);

        //size
        System.out.println(list.size());

        //iterating in linked list
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }System.out.print("NULL");

        //remove
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
}