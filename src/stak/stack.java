package stak;
public class stack {
 
   private int maxsize;
    private long[]arraystack; 
    private int top;
    public stack (int x){ 
        maxsize = x;
        arraystack = new long[maxsize];
        top = -1;
    }
    
    public void push(int j){
        arraystack[++top] = j ;
    }
 
    public long pop()
    {
       
        return arraystack[top--];
    }
   
    public boolean kosong()
    {
      return top == -1   ;  
    }
  
    public boolean penuh()
    {
          return top == maxsize-1; 
    }
}
    

