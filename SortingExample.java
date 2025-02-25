import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors; 

public class SortingExample {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		ArrayList<Department> dlist=new ArrayList<>();
		dlist.add(new Department("California","Physics"));
		dlist.add(new Department("UK","Maths"));
		dlist.add(new Department("US","Bio"));
		list.add(new Employee(1L,"Abin",20.0,60,dlist.get(0)));
		list.add(new Employee(1L,"Abin",20.9,80,dlist.get(1)));
		list.add(new Employee(1L,"Abin",20.9,30,dlist.get(2)));
		Map<Department, List<Employee> >map =
				list.stream().collect(Collectors.groupingBy(Employee::department));
}
class 
class Employee{
	Long id;
	String name;
	Double salary;
	Integer age;
	Department department;
	public Employee(Long id, String name, Double salary, Integer age, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.department = department;
	}
	
}
class Department{
	String location;
	String name;
	public Department(String location, String name) {
		super();
		this.location = location;
		this.name = name;
	}
}