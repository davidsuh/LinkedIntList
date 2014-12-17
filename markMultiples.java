// Write a method called markMultiples that takes an
// integer n as a parameter and that adds nodes to a linked list of integers to
// indicate where the multiples of n occur.

public void markMultiples(int n) {
   if (n < 1) {
      throw new IllegalArgumentException();
   }
   if (front != null) {
      ListNode curr = front;
      if (curr.data % n == 0) {
         front = new ListNode(0, curr);
      }
      while (curr.next != null) {
         if (curr.next.data % n == 0) {
            curr.next = new ListNode(0, curr.next);
            curr = curr.next;
         }
         curr = curr.next;
      }
   }
}