// Write a method called bubble that performs one
// pass of the bubble sort algorithm on a list of integers, returning true if
// any changes were made and returning false otherwise.  As Wikipedia
// describes, bubble sort "works by repeatedly stepping through the list to be
// sorted, comparing each pair of adjacent items and swapping them if they are
// in the wrong order.  The pass through the list is repeated until no swaps
// are needed, which indicates that the list is sorted."

public boolean bubble() {
   boolean bubble = false;
   if (front != null && front.next != null) {
      ListNode curr = front;
      ListNode hold = curr.next;
      if (hold.data < curr.data) {
         curr.next = curr.next.next;
         hold.next = curr;
         front = hold;
         bubble = true;
      }
      while (curr != null && curr.next != null) {
         if (curr.data > curr.next.data) {
            hold.next = hold.next.next;
            curr.next = hold.next.next;
            hold.next.next = curr;
            bubble = true;
         } else {
            curr = curr.next;
         }
         hold = hold.next;
      }
   }
   return bubble;
}