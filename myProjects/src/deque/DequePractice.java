package deque;
import java.util.ArrayList;

public class DequePractice {
	
	public static void main(String[] args) {
		
		MyDeque<String> dq = new MyArrayDeque<>();
        dq.add("sathya");
        dq.add("tawfiq");
        dq.add("abitha");
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        System.out.println(dq);
        System.out.println(dq.addAll(list));
        System.out.println(dq);    
	}
}
