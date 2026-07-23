package p2;

import java.util.ArrayList;
import java.util.List;

public class DataClass {
	
	List<Integer> list = new ArrayList<>();
	List<String> techName = new ArrayList<>(); // java , python , salesforce , react , angular
	
	
	public DataClass() {
		list.add(78);
		list.add(965);
		list.add(8);
		list.add(80);
		list.add(37);
		list.add(137);
		
	}

	public List<Integer> getList() {
		return list;
	}
	
	
	

}
