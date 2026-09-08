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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null|| head.next==null)return null;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int mid=size/2;
        ListNode curr=head;
        while(mid>1){
            curr=curr.next;
            mid--;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
     
        return head;

    }
}