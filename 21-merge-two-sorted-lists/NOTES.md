Iterative method : see the first accepted solution.
​
class Solution {
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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