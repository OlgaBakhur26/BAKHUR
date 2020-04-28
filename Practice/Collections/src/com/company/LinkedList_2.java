package com.company;

import java.util.Arrays;

public class LinkedList_2 {
    private Node head;
    private int size; // по умолчанию 0


    public void add(int value){
        // если это первое добавление в список
        if(head == null){
            this.head = new Node(value);
        }else{
            Node temp = head;

            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));

        }
        size++;
    }

    public int get(int index){
        int currentIndex = 0;
        Node temp = head;

        while(temp != null){
            if(currentIndex == index){
                return temp.getValue();
            }
            temp = temp.getNext();
            currentIndex++;
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index){
        if (index == 0){
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = head;

        while(temp != null){
            if((currentIndex + 1) == index){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else{
                temp = temp.getNext();
                currentIndex++;
            }

        }
    }

    public String toString(){
        int[] result = new int[size];

        int ind = 0;
        Node temp = head;
        while(temp != null){
            result[ind++] = temp.getValue();
            temp = temp.getNext();

        }
        return Arrays.toString(result);

    }


    // Внутри класса создаем вложенный статический класс Node (узел)
    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedList_2 linkedList_2 = new LinkedList_2();
        linkedList_2.add(1);
        linkedList_2.add(2);
        linkedList_2.add(10);

        System.out.println(linkedList_2);
        System.out.println(linkedList_2.get(0));
        System.out.println(linkedList_2.get(1));
        System.out.println(linkedList_2.get(2));

        linkedList_2.remove(1);
        System.out.println(linkedList_2);

    }

}
