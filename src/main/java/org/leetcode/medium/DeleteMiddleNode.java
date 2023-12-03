package org.leetcode.medium;

public class DeleteMiddleNode {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode7 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(7,
                                        new ListNode(1,
                                                new ListNode(2,
                                                        new ListNode(6, null)))))));
        deleteMiddle(listNode7);

        ListNode listNode4 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, null))));
        deleteMiddle(listNode4);

        ListNode listNode2 = new ListNode(2,
                new ListNode(1, null));
        deleteMiddle(listNode2);

        ListNode listNode1 = new ListNode(1, null);
        deleteMiddle(listNode1);

        deleteMiddle(null);
    }

    public static ListNode deleteMiddle(ListNode head) {
        if(head == null){
            return null;
        }
        int pos = 0;
        ListNode current = head;
        while (current.next != null) {
            pos++;
            current = current.next;
        }
        int middle;
        if (pos % 2 == 0) {
            middle = pos / 2;
        } else {
            middle = pos / 2 + 1;
        }
        current = head;
        pos = 0;
        ListNode prev = null;
        while (pos < middle) {
            prev = current;
            current = current.next;
            pos++;
        }
        if(prev == null) {
            return null;
        }
        prev.next = current.next;
        return head;
    }
}
