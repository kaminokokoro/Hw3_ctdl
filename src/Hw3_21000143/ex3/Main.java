package Hw3_21000143.ex3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListInterface<Integer> list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.set(0, 11);
        list.remove(8);
        System.out.println("list is contain 8:" + list.isContain(8));
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Get 0: " + list.get(0));
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
