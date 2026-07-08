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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }

        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
     

        for(int i=0;i<left-1;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode lHead=curr;
        ListNode eHead=prev;
        prev=null;
        ListNode next;
        for(int i=0;i<right-left+1 && curr!=null;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        if(eHead!=null){
           eHead.next= prev;
        }
        if(curr!=null){
            lHead.next=curr;
        }else{
            lHead.next=null;
        }
        return dummy.next;

    }
}