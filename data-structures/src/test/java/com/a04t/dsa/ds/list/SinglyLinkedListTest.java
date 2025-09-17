package com.a04t.dsa.ds.list;

import com.a04t.dsa.common.list.SLLNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    SLLNode<Integer> node40 = new SLLNode<>(40);
    SinglyLinkedList<Integer> emptyList = new SinglyLinkedList<>();
    SinglyLinkedList<Integer> singleElementList = new SinglyLinkedList<>(node40);
    SinglyLinkedList<Integer> fiveElementsList = new SinglyLinkedList<>();

    @BeforeEach
    void beforeEach() {
        // 5 --> 10 --> 15 --> 20 --> 30 --> null
        fiveElementsList.insertAtEnd(5);
        fiveElementsList.insertAtEnd(10);
        fiveElementsList.insertAtEnd(15);
        fiveElementsList.insertAtEnd(20);
        fiveElementsList.insertAtEnd(30);
    }

    @Test
    void size() {
        assertEquals(0, emptyList.size());
        assertEquals(1, singleElementList.size());
        assertEquals(5, fiveElementsList.size());
    }

    @Test
    void getHead() {
        assertEquals(null, emptyList.getHead());
        assertEquals(node40, singleElementList.getHead());
        assertEquals(5, fiveElementsList.getHead().getData());
    }

    @Test
    void getLastNodeTest() {
        assertNull(emptyList.getLastNode(), "getLastNode should be null");
        emptyList.debugPrint();

        singleElementList.insertAt(1, node40.getData());
        assertEquals(node40, singleElementList.getLastNode(), "getLastNode should be 40");
        singleElementList.debugPrint();

        fiveElementsList.insertAtStart(2);
        assertEquals(new SLLNode<>(30), fiveElementsList.getLastNode(), "getLastNode should be 30");
        fiveElementsList.debugPrint();
    }

    @Test
    void getNodeAtTest() {
        // empty : null
        emptyList.debugPrint();
        assertNull(emptyList.getNodeAt(0), "getNodeAt should be null");

        // when only one node : 5 --> 10 --> null
        assertNull(singleElementList.getNodeAt(2), "getNodeAt should be null");
        assertEquals(new SLLNode<>(10), fiveElementsList.getNodeAt(1), "getNodeAt should be 10");

        // when more nodes : 5 --> 10 --> 20 --> null
//        node = new SLLNode<>(20);
//        list.insertAtStart(5);
//        list.insertAtEnd(node.getData());
//        assertEquals(node, list.getLastNode(), "getLastNode should be 20");
//        list.debugPrint();
    }
}