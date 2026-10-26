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
    public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
         ListNode dummy =new ListNode(0);
         ListNode curr=dummy;

         for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
         }

         while(!pq.isEmpty()){
            ListNode currNode=pq.poll();

            curr.next=currNode;
            curr=curr.next;
            if(currNode.next!=null){
                pq.add(currNode.next);
            }
         }
         return dummy.next;
    }
}