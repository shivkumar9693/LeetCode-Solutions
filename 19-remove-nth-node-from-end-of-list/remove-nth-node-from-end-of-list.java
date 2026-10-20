/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int rem=size-n;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode res=dummy;
        while(rem>0){
            res=res.next;
            rem--;
        }

        res.next=res.next.next;
        return dummy.next;
    }
}