package queue;

class QueuePractice
{
 public static void main(String args[]){
	 
  MyQueue<Integer> obj = new MyQueue<Integer>();
  obj.enqueue(2);
  obj.enqueue(7);
  obj.enqueue(20);
  obj.enqueue(12);
  obj.dequeue();
  obj.dequeue();
 }
}

