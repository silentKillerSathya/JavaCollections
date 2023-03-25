package deque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayDeque<E> implements MyDeque<E>{
	
	public E[] elements;
	int size;

	@SuppressWarnings("unchecked")
	public MyArrayDeque() {
		elements = (E[])new Object[0];
		size = 0;
	}

	public boolean isEmpty() {
		return size==0;
	}

	@SuppressWarnings("unchecked")
	public boolean containsAll(Collection<?> c) {
		for(Object obj : c) {
			boolean isExist = false;
			for(E elm : elements) {
				if(((E)obj).equals(elm)) {
					isExist = true;
				}
			}
			if(!isExist) {
				return isExist;
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean removeAll(Collection<?> c) {
		boolean result = false;
		for(Object obj : c) {
			for(E elm : elements) {
				if(((E)obj).equals(elm)) {
					System.out.println(obj+" "+elm);
					result = removeFirstOccurrence((E)obj);
				}
			}
		}
		return result;
	}

	public boolean retainAll(Collection<?> c) {
		boolean result = false;
		   for(E elm : elements) {
				if(!c.contains(elm)) {
				   result = removeFirstOccurrence(elm);
		        }
		   }
		return result;
	}

	@SuppressWarnings("unchecked")
	public void clear() {
		E[] empty = (E[])new Object[0];	
		elements = empty;
		size = 0;
	}

	@SuppressWarnings("unchecked")
	public void addFirst(E e) {
		if(e==null) {
			throw new NullPointerException();
		}
	   E[] resultArray = (E[])new Object[size+1];
	   resultArray[0] = e;
	   for(int i=0; i<size; i++) {
		   resultArray[i+1] = elements[i];
	   }
	   elements = resultArray;
	   size += 1;
	}

	public void addLast(E e) {
		if(e==null) {
			throw new NullPointerException();
		}
		elements = Arrays.copyOf(elements, size+1);
		elements[size] = e;
		size += 1;
	}

	@SuppressWarnings("unchecked")
	public E removeFirst() {
		E[] resultArray = (E[])new Object[size-1];
		E answer = elements[0];
		for(int i=0; i<size-1; i++) {
			resultArray[i] = elements[i+1];
		}
		elements = resultArray;
		size -= 1;
		return answer;
	}

	@SuppressWarnings("unchecked")
	public E removeLast() {
		E[] resultArray = (E[])new Object[size-1];
		E answer = elements[size-1];
		for(int i=0; i<size-1; i++) {
			resultArray[i] = elements[i];
		}
		elements = resultArray;
		size -= 1;
		return answer;
	}

	public E getFirst() {
		if(size==0) {
			throw new NoSuchElementException();
		}
		return elements[0];
	}

	public E getLast() {
		if(size==0) {
			throw new NoSuchElementException();
		}
		return elements[size-1];
	}

	@SuppressWarnings("unchecked")
	public boolean removeFirstOccurrence(Object o) {
		E[] resultArray = null;
		int index = -1;
		for(int i=0; i<size; i++) {
			if(elements[i].equals((E)o)) {
				index = i;
				break;
			}
		}
		if(index!=-1) {			
			E[] arr1 = Arrays.copyOfRange(elements, 0, index);
			E[] arr2 = Arrays.copyOfRange(elements, index+1, size);
			resultArray = (E[])new Object[size-1];
			for(int i=0; i<size-1; i++) {
				if(i<index) {
					resultArray[i] = arr1[i];
				}
				else {
					resultArray[i] = arr2[i-index];
				}			
			}
			elements = resultArray;
			size -= 1;
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public boolean removeLastOccurrence(Object o) {
		E[] resultArray = null;
		int index = -1;
		for(int i=size-1; i>=0; i--) {
			if(elements[i].equals((E)o)) {
				index = i;
				break;
			}
		}
		if(index!=-1) {			
			E[] arr1 = Arrays.copyOfRange(elements, 0, index);
			E[] arr2 = Arrays.copyOfRange(elements, index+1, size);
			resultArray = (E[])new Object[size-1];
			for(int i=0; i<size-1; i++) {
				if(i<index) {
					resultArray[i] = arr1[i];
				}
				else {
					resultArray[i] = arr2[i-index];
				}			
			}
			elements = resultArray;
			size -= 1;
			return true;
		}
		return false;
	}

	public boolean add(E e) {
		addLast(e);
		return true;
	}

	public E remove() {		
		return removeFirst();
	}
	
	public void push(E e) {
		addFirst(e);
	}

	public E pop() {
		return removeFirst();
	}
	
	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public boolean contains(Object o) {
		for(int i=0; i<size; i++) {
			if(elements[i].equals((E)o)) {
				return true;
			}
		}
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		for(E elm : c) {
			addLast(elm);
		}
		return true;
	}

	public boolean remove(Object o) {
		return removeFirstOccurrence(o);
	}

	public Iterator<E> iterator() {	
		return null;
	}
//
//	public Iterator<E> descendingIterator() {
//		return null;
//	}
//	
//	public String toString() {
//		return Arrays.toString(elements);
//	}


}
