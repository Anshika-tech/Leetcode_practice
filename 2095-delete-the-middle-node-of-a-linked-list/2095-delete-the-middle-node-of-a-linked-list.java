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
        if(head==null||head.next==null){
            head=null;
        }
       ListNode t=head;
        int l=0;
        while(t!=null){
            l++;
            t=t.next;
        }
        ListNode t1=head;
     for(int i=0;i<l;i++){
         if(i==(l/2)-1){
             t1.next=t1.next.next;
             break;
         }
        t1=t1.next;
     }
        return head;
    }
}