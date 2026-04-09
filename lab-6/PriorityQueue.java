import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class First{
	public static void main(String[] args){
		Queue<String> pq = new PriorityQueue<>();
		SortedSet<String> ss=new TreeSet<>();
		System.out.println(pq.isEmpty());
		pq.offer("Orange");
		pq.offer("Brown");
		pq.offer("Blue");
		pq.offer("Apple");
		pq.offer("Red");
		pq.offer("Green");
		List<String> list = new ArrayList<>();
		list.addAll(pq);
		list.remove(3);
		ss.addAll(list);
		pq.clear();
		pq.addAll(ss);
		System.out.println(pq.peek());
		Iterator<String> i = pq.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		pq.clear();
		System.out.println(pq.isEmpty());
	}
}
