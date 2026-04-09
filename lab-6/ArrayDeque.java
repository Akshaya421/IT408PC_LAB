import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;
public class QDemo{
	public static void main(String[] args){
		Queue<String> q = new ArrayDeque<>();
		Queue<String> p ;
		System.out.println(q.isEmpty());
			q.add("Orange");
			q.add("Blue");
			q.add("Red");
			q.add("Yellow");
			q.add("Green");
			List<String> list = new ArrayList<>();
			for(String s: q)
			list.add(s);
			list.remove(3);
			Collections.sort(list);
			q.clear();
			for(String s: list)
			q.add(s);
			Iterator<String> i = q.iterator();
			while(i.hasNext()){
				System.out.println(i.next());
			}
			System.out.println(q.peek());
			q.clear();
			if (q.isEmpty())
				System.out.println("My ArrayDeque is Empty");
	}
}
