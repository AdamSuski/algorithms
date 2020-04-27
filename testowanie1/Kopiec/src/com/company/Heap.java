package com.company;

import com.company.interfaces.HeapInterface;

public class Heap implements HeapInterface {

    private Node[] nodes;
    private int currentSize;
    private int maxSize;

    public Heap(int maxSize){
        this.currentSize = 0;
        this.maxSize = maxSize;
        nodes = new Node[maxSize];
    }

    @Override
    public void put(Comparable item) {
        if(nodes.length >= maxSize)
            return;
        Node node = new Node(item);
        
    }

    @Override
    public Comparable pop() {
        Node node = new Node();
        return (Comparable) node;
    }
}
