public class Solution3 {


    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5, 6};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);

        ListNode res = removeElements(listNode, 6);
        System.out.println(res);
    }

}
