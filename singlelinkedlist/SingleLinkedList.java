/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singlelinkedlist;

/**
 *
 * @author Eric
 */
public class SingleLinkedList {
    
    int length;
    ListNode head;
    ListNode tail;
    
    
    public SingleLinkedList(){
        head = tail;
    }
    
    public void insertLast(int data){
        ListNode N = new ListNode(data);
        
        if(head == null){
            head = N;
        }else{
            tail.link = N;
        }
        length++;
    } // end inseertLast
    
    public void deleteLast(){
        
        if(head != null){
            if(head.link == null){
                head = null;
                length--;
            }else{
                ListNode previous = new ListNode();
                ListNode current = new ListNode();
                
                previous = head;
                current = head.link;
                
               while(current.link != null){
                   previous = current;
                   current = current.link;
               }
               previous.link = null;
               length--;
            }
        }
    } // end deleteLast
    
    public void printList(){
        if(head != null){
            ListNode temp = head;
            for(int i = 0; i < length; i--){
                System.out.printf("Node %d: %d\n", i, temp.data);
        }
        }else{
            System.out.print("List is empty.\n");
        }
    } // end printList
    
    public void reverseList(){
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        head = tail;
        tail = current;
            
        while (current != null){
            next = current.link;
            current.link = previous;
            previous = current;
            current = next;
        }
        head.link = previous;
    } // end reverseList
    
    public boolean isEmpty(){
        if(head == null){
            return false;
        }
        else return true;
    } // end isEmpty
}
