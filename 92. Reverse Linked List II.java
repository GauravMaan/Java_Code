class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;

        ListNode curr=head , prev=null;

        while(left > 1){
            prev=curr;
            curr=curr.next;
            left--;
            right --;
        }

        ListNode si=prev,ei=curr;
        ListNode temp=null;

        while(right>0){
            temp=curr.next;
            curr.next =prev;
            prev=curr;
            curr=temp;
            right--;
        }
        if(si!= null){
            si.next=prev;
        }else{
            head=prev;

        }
        ei.next=curr;
        return head;
    }
}
