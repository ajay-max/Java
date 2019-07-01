abstract class Employee{

	String name;
	int age;
	int salary;

	   abstract String getName();
	abstract int getSal();
	abstract int getAge();
	
	Employee(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}

class Abstract extends Employee
{
	 public static void main(String[] args) {
		Abstract obj=new Abstract("Ajay",12,1200);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSal());


	}

	Abstract(String name,int age,int salary)
	{
		super(name,age,salary);
	}

	public int getSal()
	{
		return salary;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

}