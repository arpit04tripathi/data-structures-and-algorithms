package com.a04t.dsa.ds.list;

import com.a04t.dsa.common.list.SLLNode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SinglyLinkedList<T> {

    SLLNode<T> head;
    int length;

    /* ======================================
    * Helper Methods
    * ====================================== */

    public SinglyLinkedList(SLLNode<T> head) {
        this.head = head;
        this.length = 1;
    }

    public int size() {
        return this.length;
    }

    private boolean isEmptyList() {
        return head == null;
    }

    private boolean isLastNode(SLLNode<T> node) {
        return node.getNext() == null;
    }

    /* ======================================
     * Get Node
     * ====================================== */

    public SLLNode<T> getLastNode() {
        if (isEmptyList()) return null;
        SLLNode<T> lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

}
