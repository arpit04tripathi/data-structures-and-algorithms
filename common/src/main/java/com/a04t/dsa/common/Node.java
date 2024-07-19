package com.a04t.dsa.common;

import lombok.Data;

@Data
public class Node {
    final String data;
    Node next;

    Node(String data) {
        this.data = data;
    }
}
