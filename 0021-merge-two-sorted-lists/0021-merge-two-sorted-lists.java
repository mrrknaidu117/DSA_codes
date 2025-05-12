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

        ListNode prehead = new ListNode();
        ListNode current = prehead;

        while(list1 != null && list2 != null){
            int val1 = list1.val;
            int val2 = list2.val;
            if (val1 <= val2){
                current.next = new ListNode(val1);
                list1 = list1.next;
            }else{
                current.next = new ListNode(val2);
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 == null ? list2 : list1;
        return prehead.next;
        
    }
}