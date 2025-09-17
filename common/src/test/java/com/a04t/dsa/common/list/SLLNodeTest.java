package com.a04t.dsa.common.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SLLNodeTest {

    @Test
    void constructor() {
        SLLNode<String> stringNode = new SLLNode<>("25");
        assertEquals("25", stringNode.getData());
        assertNull(stringNode.getNext());

        SLLNode<Integer> intNode = new SLLNode<>(25);
        assertEquals(25, intNode.getData());
        assertNull(intNode.getNext());
    }

}