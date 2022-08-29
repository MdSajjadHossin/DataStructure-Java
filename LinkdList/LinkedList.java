import java.util.*;


class LinkdList{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();


        //addition first
        list.addFirst("a");
        list.addFirst("b");

        System.out.println(list);

        //addition last
        list.addLast("e");
        list.addLast("f");

        System.out.println(list);

    }
}