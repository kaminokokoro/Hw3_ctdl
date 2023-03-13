package Hw3_21000143.ex4;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.addBot(6);
        list.addBot(3);
        list.removeBot();
        list.removeTop();
        list.remove(3);
        list.isContain(4);
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Get 0: " + list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
