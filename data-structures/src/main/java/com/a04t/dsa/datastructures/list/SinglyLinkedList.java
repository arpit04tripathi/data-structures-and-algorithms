package com.a04t.dsa.datastructures.list;

import com.a04t.dsa.common.list.SLLNode;
import lombok.Data;

@Data
public class SinglyLinkedList<T> {

    SLLNode<T> head;
    int length;

    public SinglyLinkedList(SLLNode<T> head) {
        this.head = head;
    }

    public int size() {
        return this.length;
    }

    public SLLNode<T> getLastNode() {
        if (head == null) return null;
        SLLNode<T> lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

    public void addAtStart(T data) {
        SLLNode<T> newNode = new SLLNode<>(data);
        if (size() > 0) {
            newNode.setNext(head);
        }
        head = newNode;
        length++;
    }

    public void addAtEnd(T data) {
        SLLNode<T> newNode = new SLLNode<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        getLastNode().setNext(newNode);
    }
}
