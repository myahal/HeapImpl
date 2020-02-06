package com.hoge;

public class Main {

    public static void main(String[] args) {
        HeapImpl heap = new HeapImpl();
        heap.push(10);
        heap.push(5);
        heap.push(7);
        heap.push(2);
        heap.push(1);
        heap.push(20);
        heap.push(15);
        heap.print();
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
    }
}
