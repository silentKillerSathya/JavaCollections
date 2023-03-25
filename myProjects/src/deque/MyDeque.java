package deque;
import java.util.Collection;

public interface MyDeque<E> {

	boolean isEmpty();
	boolean containsAll(Collection<?> c);
	boolean removeAll(Collection<?> c);
	boolean retainAll(Collection<?> c);
	void clear();
	E getFirst();
	E getLast();
	void addFirst(E e);
	void push(E e);
	E pop();
	void addLast(E e);
	E removeFirst();
	E removeLast();
	boolean removeFirstOccurrence(Object o);
	boolean removeLastOccurrence(Object o);
	boolean add(E e);
	E remove();
	boolean remove(Object o);
	boolean addAll(Collection<? extends E> c);
	boolean contains(Object o);
	int size();
//	Iterator<E> iterator();
//	Iterator<E> descendingIterator();
}
