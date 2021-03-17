package basic;

public class bingbang {

	public static void main(String[] args) {
		int a=1 ;
		if(a%3==0 && a%5==0)
		{
			System.out.println("bing bang");
		}else if(a%3==0)
		{
			System.out.println("bing");
		}
		else if(a%5==0)
		{
			System.out.println("bang");
		}
		else
		{
			System.out.println(a);
		}
		// TODO Auto-generated method stub

	}

}
