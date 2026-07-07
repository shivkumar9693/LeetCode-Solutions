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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f=list1;
         ListNode s=list2;
        
          ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
          while(f!=null && s!=null)
          {
            if(f.val<=s.val){
                ans.next=f;
               
                f=f.next;
            }
            else{
                ans.next=s;
               
                s=s.next;
            }
             ans=ans.next;
          }
          while(f!=null){
            ans.next=f;
            ans=ans.next;
            f=f.next;
          }
            while(s!=null){
            ans.next=s;
            ans=ans.next;
            s=s.next;
          }

          return dummy.next;

    }
}