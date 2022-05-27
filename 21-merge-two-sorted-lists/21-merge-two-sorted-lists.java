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
      
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
        
        /*
        
        #############Iterative method
        
        ListNode temp = list1, temp2 = list2, result = new ListNode();
        if(temp == null && temp2 == null) return list2;
        if(temp == null) return list2;
        if(temp2 == null) return list1;
        list2 = result;
    
        while(temp!=null && temp2!=null){
            if(temp.val < temp2.val){
                result.next = temp;
                temp = temp.next;
                result = result.next;
            }else{
                result.next = temp2;
                temp2 = temp2.next;
                result = result.next;
            }
             
        }
        if(temp==null){
            result.next = temp2;
            return list2.next;
        }else if(temp2 == null){
            result.next = temp;
            return list2.next;
        }else return list2.next;
        
        */
        
        
        
    }
}