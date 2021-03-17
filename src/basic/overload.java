package basic;

public class overload {
	 void disp(int a)
	{
		System.out.println(a);
	}
	 void disp(char c)
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		overload a=new overload();
		a.disp(10);
		a.disp('c');
		// TODO Auto-generated method stub

	}

}
