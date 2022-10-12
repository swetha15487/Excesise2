package Exercise1;

import java.util.Comparator;

public class MyClass  implements Comparator<ItemClass>{


	public int compare(ItemClass o1, ItemClass o2) {
		
		return (int)(o2.getPrice()-o1.getPrice());
	}

}
