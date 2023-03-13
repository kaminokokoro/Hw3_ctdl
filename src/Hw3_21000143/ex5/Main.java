package Hw3_21000143.ex5;

import Hw3_21000143.ex4.SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList<WordCount> list = new SimpleLinkedList<>();
        String str="Tạo đối tượng là WordCount gồm 2 thuộc tính là word và count. Đối tượng " +
                "WordCount nạp chồng phương thức equals(Object o) để có thể sử dụng phương " +
                "thức isContain đã xây dựng ở các cấu trúc dữ liệu trên, hoặc có thể sử dụng phương " +
                "thức indexOf của các đối tượng cài đặt giao diện List";
        String[] wor= str.split("[ ,.()0-9]+");
        for (int i = 0; i < wor.length; i++) {
            WordCount wordCount = new WordCount(wor[i], 1);
            if (list.isContain(wordCount)) {
                list.get(list.indexOf(wordCount)).addCount();
            } else {
                list.addBot(wordCount);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
