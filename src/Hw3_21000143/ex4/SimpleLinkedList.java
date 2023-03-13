package Hw3_21000143.ex4;

public class SimpleLinkedList<T> {


    class Node {
        T data;
        Node next;
    }

    public int indexOf(T data) {
        Node node = top;
        int index = 0;
        while (node != null) {
            if (node.data.equals(data)) {
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;

    }
    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        // Thêm phần tử vào đầu danh sách
        Node node = new Node();
        node.data = data;
        node.next = top;
        top = node;
        if (bot == null) {
            bot = top;
        }
        n++;

    }
    public void addBot(T data) {
        // Thêm phần tử vào cuối danh sách
        Node node = new Node();
        node.data = data;
        if (bot == null) {
            bot = node;
            top = node;
        } else {
            bot.next = node;
            bot = node;
        }
        n++;
    }
    public T get(int i) {
        // Lấy phần tử ở vị trí thứ i
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        Node node = top;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        return node.data;

    }
    public void set(int i, T data){
        // Gán giá trị ở vị trí i bằng data
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        Node node = top;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        node.data = data;

    }
    public boolean isContain(T data) {
        // Kiểm tra trong danh sách có chứa phần tử data hay không?
        Node node = top;
        while (node != null) {
            if (node.data.equals(data)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public int size() {
        // Trả lại thông tin số phần tử có trong danh sách
        return n;

    }
    public boolean isEmpty() {
        // Kiểm tra danh sách có rỗng hay không?

        return n == 0;
    }
    public T removeTop() {
        // Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó
        if (top == null) {
            throw new IndexOutOfBoundsException();
        }
        T data = top.data;
        top = top.next;
        n--;
        return data;
    }
    public T removeBot() {

        // Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó
        if (bot == null) {
            throw new IndexOutOfBoundsException();
        }
        T data = bot.data;
        Node node = top;
        while (node.next != bot) {
            node = node.next;
        }
        node.next = null;
        bot = node;
        n--;
        return data;
    }
    public void remove(T data) {
        // Xóa tất cả các phần tử có giá trị bằng data
        Node node = top;
        while (node != null) {
            if (node.data.equals(data)) {
                if (node == top) {
                    top = top.next;
                } else {
                    Node node1 = top;
                    while (node1.next != node) {
                        node1 = node1.next;
                    }
                    node1.next = node.next;
                }
                n--;
            }
            node = node.next;
        }
    }
}
