package Genirics;

public class Employee {
	String name;
	int id;
	double sal;
	String departments;
	public Employee(String name, int id, double sal, String departments) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", departments=" + departments + "]";
	}
		

}