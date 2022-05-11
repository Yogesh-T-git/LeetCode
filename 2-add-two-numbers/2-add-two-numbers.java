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

import java.math.BigInteger;

class Solution {
    
    public static ListNode reverse(ListNode list){
        if(list.next == null) return list;
        ListNode nextlist = reverse(list.next);
        list.next.next = list;
        list.next = null;
        return nextlist;
    }
    
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String num1 = "", num2 = "";
        
        
        if(l1 == null && l2 == null){
            return l1;
        }else if(l1 == null && l2 != null) {
            return l2;
        }else if(l1 != null && l2 ==null) {
            return l1;
        }else {
            
            ListNode temp = l1, temp2 = l2;
            while(temp!=null){
                num1 = num1 + temp.val;
                temp = temp.next;
            }
            while(temp2!=null){
                num2 = num2 + temp2.val;
                temp2 = temp2.next;
            }
        
            num1 = new StringBuilder(num1).reverse().toString();
            num2 = new StringBuilder(num2).reverse().toString();
            BigInteger b = new BigInteger(num1);
            BigInteger b2 = new BigInteger(num2);
            BigInteger c = b.add(b2);
            String result = c.toString();
        
            int i=0, j=1;
            ListNode next = null, current = new ListNode(Integer.parseInt(result.substring(i++,j++)), null);
            ListNode head = current;
        
            int len = result.length();
            while(len-1 !=0){
            next = new ListNode(Integer.parseInt(result.substring(i++,j++)),null);
            current.next = next;
            current = current.next;
                len--;
            }
        
            return reverse(head);
            
            
        }
        
        
    }
}