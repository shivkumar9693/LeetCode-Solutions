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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode mid=midNode(head);

        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return merge(left,right);
    }
    //find mid
    public ListNode midNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode midPrev=null;
        while(fast!=null && fast.next!=null){
            midPrev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        midPrev.next=null;
        return slow;
    }
    //merge two list
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(l1!=null && l2!=null){

            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }

        while(l1!=null){
            curr.next=l1;
            l1=l1.next;
            curr=curr.next;
        }
         while(l2!=null){
            curr.next=l2;
            l2=l2.next;
            curr=curr.next;
        }
        return dummy.next;
    }
}