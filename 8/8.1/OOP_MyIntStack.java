public class OOP_MyIntStack {
    public static void main(String[] args) {
       MyIntStack stack = new MyIntStack(5);  // Initial capacity 5
 
       // Pushing elements
       System.out.println("Pushing elements...");
       for (int i = 1; i <= 10; i++) {
          stack.push(i);
          System.out.println("Pushed: " + i);
       }
 
       // Peeking the top element
       System.out.println("Top element: " + stack.peek());
 
       // Popping elements
       System.out.println("Popping elements...");
       while (!stack.isEmpty()) {
          System.out.println("Popped: " + stack.pop());
       }
 
       // Trying to pop from an empty stack (should throw an exception)
       try {
          stack.pop();
       } catch (IllegalStateException e) {
          System.out.println("Exception: " + e.getMessage());
       }
    }
 }
 