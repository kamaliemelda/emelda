package basic;

public class A {
	 int x=5;
	static int y=10;
	void m1()
	{
		y=x;
	}
	void m2()
	{
		x++;
	}

	public static void main(String[] args) {
		A a1=new A();
				A a2=new A();
				A a3=new A();
				a2.m1();
				a3.m2();
				a1.y++;
				a1.m1();
				a2.m2();
		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(a3.x);
		System.out.println(A.y);
		// TODO Auto-generated method stub

	}

}
