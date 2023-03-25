package linkedList;

class Node<T>
{
   T data;
   Node<T> nextNode;
 
   Node(T data, Node<T> nextNode){
       this.data = data;
       this.nextNode = nextNode;
   }
 
}
