package p2;

import java.util.Iterator;
import java.util.List;

public class BusinessOperations {

	List<Integer> list;
	
	public BusinessOperations() {
		list = new DataClass().getList();
	}
	
	public int filterData(int searchItem)throws ItemNotFoundException
	{
		for (Integer value : list) {
			if(value == searchItem)
			{
				return value;
			}
		}
		
		throw new ItemNotFoundException(searchItem);
	}
}
