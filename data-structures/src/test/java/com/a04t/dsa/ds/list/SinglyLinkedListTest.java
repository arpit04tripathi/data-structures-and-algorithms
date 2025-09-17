package com.a04t.dsa.ds.list;

import com.a04t.dsa.common.list.SLLNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    SLLNode<Integer> node40 = new SLLNode<>(40);
    SinglyLinkedList<Integer> emptyList = new SinglyLinkedList<>();
    SinglyLinkedList<Integer> singleElementList = new SinglyLinkedList<>(node40);
    SinglyLinkedList<Integer> fiveElementsList = new SinglyLinkedList<>();

    @Test
    void size() {
        assertEquals(0, emptyList.size());
        assertEquals(1, singleElementList.size());
//        assertEquals(5, fiveElementsList.size());
    }
}