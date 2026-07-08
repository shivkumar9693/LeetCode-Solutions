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
    public void reorderList(ListNode head) {
       ListNode l1=head;
      ListNode firstEnd = mid(head);
ListNode l2 = rev(firstEnd.next);
firstEnd.next = null;
ListNode temp=null;
       while(l1!=null && l2!=null){

        temp=l1.next;
        l1.next=l2;
        l1=temp;

        temp=l2.next;
        l2.next=l1;
        l2=temp;


       } 
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode rev(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr
            ;
            curr=next;
        }
        return prev;
    }
}