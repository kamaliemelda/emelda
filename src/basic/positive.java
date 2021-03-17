package basic;

public class positive {

	public static void main(String[] args) {
		int a=0;
		if(a%2==0 && a>0)
		{
			System.out.println("positive even");
		}if(a%2==0 && a<0)
		{
			System.out.println("negative even");
		}else if(a%2==1 && a<0) {
			System.out.println("negative odd");
		}else if(a%2==1 && a>0)
		{
			System.out.println("positive odd");
		}else {
			System.out.println("zero");
		}
		
		
		
		}
		// TODO Auto-generated method stub

	

}
