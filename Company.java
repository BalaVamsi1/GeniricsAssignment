package Genirics;

import java.util.HashSet;

public class Company {

	public static void main(String[] args) {
		HashSet <Employee> h = new HashSet <>();
		h.add(new Employee ("BALA VAMSI",123,20000,"Development"));
		h.add(new Employee ("VARAM",456,20000,"Development"));
		h.add(new Employee ("CHINNU",789,20000,"Development"));
		Company.printHashSet(h);
	}

	private static void printHashSet(HashSet<Employee> h) {
		for(Employee temp:h) {
			System.out.println(temp);
			
		}
		
	}

}