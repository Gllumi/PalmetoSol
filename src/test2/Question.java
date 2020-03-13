package test2;


import java.util.*;



public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		Set set = new HashSet();
		PriorityQueue queue = new PriorityQueue();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		set.add('a');
		set.add('b');
		set.add('c');
		
		queue.add("A");
		queue.add("B");
		queue.add("C");
		Map map = new HashMap();
		map.put("List",list);
		map.put("Set", set);
		map.put("Queue", queue);
		
		System.out.println(map);
	}

}
