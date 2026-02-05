package com.a04t.dsa.common.list;

import lombok.Data;

@Data
public class SLLNode<T> {

    final T data;
    SLLNode<T> next;

    public  SLLNode(T data) {
        this.data = data;
    }
}
