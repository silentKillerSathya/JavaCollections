package stack;
import java.util.Arrays;

class MyStack<T>
{
  T[] elements;
  int lengthOfStack;
 
   @SuppressWarnings("unchecked")
   MyStack(){
      elements = (T[]) new Object[0];
      lengthOfStack=0;
   }
 
   void push(T elm){
      elements = Arrays.copyOf (elements, lengthOfStack+1);
      elements[lengthOfStack]=elm;
      lengthOfStack+=1;
      System.out.println(Arrays.toString(elements));
    }
 
    void pop(){
      elements = Arrays.copyOf (elements, lengthOfStack-1);
      lengthOfStack-=1;
      System.out.println(Arrays.toString(elements));
    }
 
    void get(int index){
      System.out.println(elements[index]);
    }
}

