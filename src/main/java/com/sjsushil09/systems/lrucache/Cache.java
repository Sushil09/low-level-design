package com.sjsushil09.systems.lrucache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private int size;

    Map<Integer,Integer> map;

    public Cache(int size) {
        this.size = size;
        this.map = new HashMap<>(size);
    }


    static class Node{
        Node next;
        Node prev;
        int key;

        int value;
    }
}


