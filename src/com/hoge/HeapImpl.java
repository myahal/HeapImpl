package com.hoge;

import java.util.ArrayList;

public class HeapImpl {
    private ArrayList<Integer> list = new ArrayList<>();

    public void push(int element) {
        int n = list.size();
        list.add(element);
        while(n != 0) {
            int parent = (n - 1)/2;
            if (list.get(parent) < list.get(n)) {
                int tmp = list.get(parent);
                list.set(parent, element);
                list.set(n, tmp);
            }
            n = parent;
        }
    }

    public int pop() {
        int ret = list.get(0);
        int n = list.size() - 1;
        list.set(0, list.get(n));
        list.remove(n);
        n = 0;
        for(int i = n * 2 + 1 ; i < list.size(); i = n * 2 + 1) {
            int j = i + 1;
            int index = i;
            if (j < list.size() && list.get(i) < list.get(j)) {
                index = j;
            }
            if (list.get(n) < list.get(index)) {
                int tmp = list.get(n);
                list.set(n, list.get(index));
                list.set(index, tmp);
            }
            n = index;
        }
        return ret;
    }

    public void print() {
        for(int v: list) {
            System.out.print(v + ", ");
        }
        System.out.println();
    }
}
