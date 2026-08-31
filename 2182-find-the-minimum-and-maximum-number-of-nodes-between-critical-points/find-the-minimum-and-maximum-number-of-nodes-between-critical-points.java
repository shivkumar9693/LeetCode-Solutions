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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
          int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;

        int first = -1;
        int prevCritical = -1;

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;

        while (curr.next != null) {

            ListNode next = curr.next;

      
            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

 
                if (first == -1) {
                    first = index;
                }

         
                if (prevCritical != -1) {
                    minDistance = Math.min(
                        minDistance,
                        index - prevCritical
                    );

                    maxDistance = index - first;
                }

                prevCritical = index;
            }

            prev = curr;
            curr = next;
            index++;
        }

        if (maxDistance == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{minDistance, maxDistance};
    }
}