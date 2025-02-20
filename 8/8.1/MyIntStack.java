public class MyIntStack {
    private int[] contents;
    private int tos;  // Top of the stack
 
    // Constructor with initial capacity
    public MyIntStack(int capacity) {
       contents = new int[capacity];
       tos = -1;
    }
 
    // Push method with dynamic resizing
    public boolean push(int element) {
       if (isFull()) {
          expandCapacity();  // Expand capacity if full
       }
       contents[++tos] = element;
       return true;
    }
 
    // Pop method
    public int pop() {
       if (isEmpty()) {
          throw new IllegalStateException("Stack is empty! Cannot pop.");
       }
       return contents[tos--];
    }
 
    // Peek method
    public int peek() {
       if (isEmpty()) {
          throw new IllegalStateException("Stack is empty! Cannot peek.");
       }
       return contents[tos];
    }
 
    // Check if stack is empty
    public boolean isEmpty() {
       return tos < 0;
    }
 
    // Check if stack is full
    public boolean isFull() {
       return tos == contents.length - 1;
    }
 
    // Private method to double the capacity
    private void expandCapacity() {
       int newSize = contents.length * 2;
       int[] newContents = new int[newSize];
       System.arraycopy(contents, 0, newContents, 0, contents.length);
       contents = newContents;
    }
 }
 