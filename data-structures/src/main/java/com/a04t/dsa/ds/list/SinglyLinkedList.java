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

    public SLLNode<T> getNodeAt(int index) {
        if (isEmptyList() || (index >= size())) {
            return null;
        }
        SLLNode<T> selectedNode = head;
        for (int i = 0; i < index; i++) {
            selectedNode = selectedNode.getNext();
        }
        return selectedNode;
    }

    /* ======================================
     * Insert Node
     * ====================================== */

    public void insertAtStart(T data) {
        SLLNode<T> newNode = new SLLNode<>(data);
        if (!isEmptyList()) {
            newNode.setNext(head);
        }
        head = newNode;
        length++;
    }

    public void insertAtEnd(T data) {
        SLLNode<T> newNode = new SLLNode<>(data);
        if (isEmptyList()) {
            head = newNode;
            length++;
            return;
        }
        getLastNode().setNext(newNode);
        length++;
    }

    public void insertAt(int index, T data) {
        if (index == 0) {
            insertAtStart(data);
        } else if (index >= size()) {
            insertAtEnd(data);
        } else {
            SLLNode<T> newNode = new SLLNode<>(data);
            SLLNode<T> previousNode = getNodeAt(index - 1);
            newNode.setNext(previousNode.getNext());
            previousNode.setNext(newNode);
        }
        length++;
    }

    /* ======================================
     * Delete Node
     * ====================================== */

    public void deleteAtStart() {
        if (!isEmptyList()) {
            head = head.getNext();
            length--;
        }
    }

    public void deleteAtEnd() {
        if (size() <= 1) {
            deleteAtStart();
        } else {
            int lastIndex = size() - 1;
            SLLNode<T> secondLastNode = getNodeAt(lastIndex - 1);
            secondLastNode.setNext(null);
            length--;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            deleteAtStart();
        } else if (index >= size() - 1) {
            deleteAtEnd();
        } else {
            SLLNode<T> previousNode = getNodeAt(index - 1);
            SLLNode<T> nodeAtIndex = previousNode.getNext();
            previousNode.setNext(nodeAtIndex.getNext());
            length--;
        }
    }

    /* ======================================
     * Reverse the List
     * ====================================== */

    public void reverseTheListIterative() {
        if (size() <= 1) {
            return;
        }
        SLLNode<T> previousNode = null;
        SLLNode<T> currentNode = head;
        SLLNode<T> nextNode = currentNode.getNext();
        while (!isLastNode(currentNode)) {
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = currentNode.getNext();
        }
        currentNode.setNext(previousNode);
        head = currentNode;
    }

    public void reverseTheListRecursive() {
        if (size() <= 1) {
            return;
        }
        reverseTheListRecursive(head);
    }

    private void reverseTheListRecursive(SLLNode<T> currentNode) {
        // terminating the recursion when last node reached
        if (isLastNode(currentNode)) {
            // last node will be the head for reversed list
            head = currentNode;
            return;
        }

        // reverse the list from next node
        reverseTheListRecursive(currentNode.getNext());

        // reverse the pointers for current node
        SLLNode<T> nextNode = currentNode.getNext();
        nextNode.setNext(currentNode);
        currentNode.setNext(null);
    }

    /* ======================================
     * Print the List
     * ====================================== */

    // 1 --> 2 --> 3 --> 4 --> null
    public void print() {
        SLLNode<T> currentNode = head;
        StringBuilder sb = new StringBuilder();
        while (currentNode != null) {
            sb.append(currentNode.getData()).append(" --> ");
            currentNode = currentNode.getNext();
        }
        sb.append("null");
        System.out.println(sb.toString());
    }

    // 1 --> 2 --> 3 --> 4 --> null
    public void printForwardRecursive(SLLNode<T> currentNode) {
        if (currentNode == null) {
            System.out.print("null");
            return;
        }

        System.out.printf("%s --> ", currentNode.getData().toString());
        printForwardRecursive(currentNode.getNext());
    }

    // null --> 4 --> 3 --> 2 --> 1
    public void printReverseRecursive(SLLNode<T> currentNode) {
        if (currentNode == null) {
            System.out.print("null");
            return;
        }

        printReverseRecursive(currentNode.getNext());
        System.out.printf(" --> %s", currentNode.getData().toString());
    }

    public void debugPrint() {
        System.out.println("=============================================");
        print();
        printForwardRecursive(head);
        System.out.println();
        printReverseRecursive(head);
        System.out.println("\n=============================================");
    }
}
