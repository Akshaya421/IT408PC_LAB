import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

public class SetDemo{
	public static void main(String[] args){
		HashSet<String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		set.add("Orange");
		set.add("Blue");
		set.add("Green");
		set.add("Cyan");
		set.add("Yellow");
		ArrayList<String> list = new ArrayList<>();
		list.addAll(set);
		list.remove(3);
		Collections.sort(list);
		set.clear();
		set.addAll(list);
		Iterator<String> i = set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		set.clear();
		System.out.println(set.isEmpty());
	}
}
