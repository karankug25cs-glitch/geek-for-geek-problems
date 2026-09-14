/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        Node temp = head;
        Node prev = head;
        // code here
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        int f = (c-k) + 1;
        if(k > c) return -1;
        temp = head;
        while(temp != null){
            f--;
            if(f == 0) break;
            prev = temp ;
            temp = temp.next;
        }
        prev.next = temp.next;
        return temp.data;
    }
}