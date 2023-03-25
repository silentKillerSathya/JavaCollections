package queue;

import java.util.Arrays;

class MyQueue<T>
{
 T[] elements;
 int lengthOfQueue;
 
 @SuppressWarnings("unchecked")
 MyQueue(){
  elements = (T[]) new Object[0];
  lengthOfQueue=0;
 }

 void enqueue(T elm){
  elements=Arrays.copyOf(elements, lengthOfQueue+1);
  elements[lengthOfQueue]=elm;
  lengthOfQueue+=1;
  System.out.println(Arrays.toString(elements));
 }
 
 @SuppressWarnings("unchecked")
 void dequeue(){ 
  if(elements.length>0){
   elements=Arrays.copyOfRange(elements,1,lengthOfQueue);
   lengthOfQueue-=1;
   System.out.println(Arrays.toString(elements));
  }
  else{
   elements = (T[]) new Object[0];
  }
 }
}
