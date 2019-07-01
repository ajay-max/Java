class A
{

	 A()
	{
		System.out.println("Hello World Inside Class A");
	}
}

class B extends A
{

B()
{
System.out.println("Hello World Inside Class B");
}
}


class Sub
{

	  public static void main(String[] args) {
	  B obj=new  B();
		
	}
}