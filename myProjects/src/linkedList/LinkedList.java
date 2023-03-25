package linkedList;

class LinkedList<T>
{
   Node<T> head;

   @SuppressWarnings({ "unchecked", "rawtypes" })
   void insertData(T elm){
       Node<T> node= new Node(elm, null);
  
       if(head==null){
          head = node;
       }
       else{
          Node<T> currentNode = head;
          while (currentNode.nextNode != null){
              currentNode = currentNode.nextNode; 
          }
          currentNode.nextNode = node;
       }  
    }
 
    T deleteData(int index){
        Node<T> currentNode = head;
        Node<T> prevNode = null;
 
        for(int i=0; i<index; i++){
           if(currentNode != null && currentNode.nextNode != null){
                prevNode = currentNode;
                currentNode = currentNode.nextNode;
           }  
        }
        Node<T> connect = currentNode.nextNode;
  
        if(index==0){
            T ans = currentNode.data;
            currentNode.nextNode = null;
            head=connect;
            return ans;	  
        }
        prevNode.nextNode = connect;
        currentNode.nextNode = null;
        return currentNode.data;   
    }
  
    T deleteElement(T elm){
       Node<T> currentNode = head;
       int index=0;
       while(currentNode.data!=elm){ 
         index++; 
         currentNode=currentNode.nextNode; 
       }
       return deleteData(index);
     }
  
    public String toString(){
       StringBuffer elements = new StringBuffer();
       Node<T> currentNode = head;
   
       while(currentNode.nextNode != null){
           elements.append(currentNode.data).append(", ");
           currentNode = currentNode.nextNode;
       } 
       elements.append(currentNode.data);
       return elements.toString();
    }  
}

