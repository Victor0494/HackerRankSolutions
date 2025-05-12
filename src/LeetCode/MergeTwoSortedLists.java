package LeetCode;

public class MergeTwoSortedLists {

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

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" → ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1.val == 0 && list1.next == null) return list2;
        if(list2.val == 0 && list2.next == null) return list1;

        ListNode result;

        if(list1.val <= list2.val) {
            result = new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            result = new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }

        printList(result);

        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        mergeTwoLists(list1, list2);

    }
}
