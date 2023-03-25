package stack;

class StackPractice {
	
 public static void main(String args[]){
	 
  MyStack<Integer> obj = new MyStack<Integer>();
  obj.push(10);
  obj.push(56);
  obj.push(9);
  obj.push(7);
  obj.push(45);
  obj.pop();
  obj.pop();
  obj.get(2);
  obj.get(0);
 }
}

