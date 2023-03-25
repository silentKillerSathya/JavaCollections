package linkedList;

class LinkedListPractice
{
   public static void main(String[] args){
      LinkedList<Integer> linkedList = new LinkedList<Integer>();
      linkedList.insertData(10);
      linkedList.insertData(20);
      linkedList.insertData(30);
      linkedList.insertData(40);
      linkedList.insertData(50);
  
      System.out.println(linkedList);
      System.out.println(linkedList.deleteData(0));
      System.out.println(linkedList);
      System.out.println(linkedList.deleteElement(40));
      System.out.println(linkedList);
   }
 
}

