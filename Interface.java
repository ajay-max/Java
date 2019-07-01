interface calculator{

	int add(int a,int b);
	int  sub(int a,int b);
	float div(float a,float b);
	int mul(int a,int b);
}

class Interface implements calculator
{
	 public static void main(String[] args) {

		Interface obj=new Interface();
		System.out.println(+obj.add(10,4));
			System.out.println(+obj.sub(10,4));
				System.out.println(+obj.mul(10,4));
					System.out.println(+obj.div(10,4));
	}

public	int add(int a ,int b)
	{
       return(a+b) ;
	}

public	 int sub(int a ,int b)
	{
      return(a-b) ;
	}

	public int mul(int a ,int b)
	{
       return(a*b) ;
	}

	public float div(float a ,float b)
	{
       return(a/b) ;
	}
}