package com.a04t.dsa.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testConstructor() {
        Node node = new Node("25");
        assertEquals("25", node.getData());
        assertNull(node.getNext());
    }
}