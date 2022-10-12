package Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		List<ItemClass> list = new ArrayList<ItemClass>();

		list.add(new ItemClass(222, "Keyboard", 400, "Hp"));
		list.add(new ItemClass(333, "Laptop", 45000, "Hp"));
		list.add(new ItemClass(444, "Mouse", 500, "Dell"));
		list.add(new ItemClass(555, "car", 456770, "Tata"));
		System.out.println("\n Starts With T\n");
		list.stream().filter(findT -> findT.getBrand().startsWith("T")).forEach(findT -> {

			System.out.println(findT);
		});
		System.out.println("\n Highest price:\n");

		Collections.sort(list, new MyClass());

		System.out.println(list);

	}

}
