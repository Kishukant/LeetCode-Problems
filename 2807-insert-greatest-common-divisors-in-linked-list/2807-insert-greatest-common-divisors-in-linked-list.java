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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current=head;
        if(head==null||head.next==null){
            return head;
        }
        while(current!=null&&current.next!=null){
            int gcdval=gcd(current.val,current.next.val);
            ListNode gcdNode=new ListNode(gcdval,current.next);
            current.next=gcdNode;
            current=gcdNode.next;
        }
        return head;

    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}