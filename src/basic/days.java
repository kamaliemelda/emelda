package basic;

public class days {

	public static void main(String[] args) {
		String a="monday";
		switch(a)
		{
		case "mon":
		case "tue":
		case "wed":
		case "thu":
		case "fri":
			System.out.println("working day");
			break;
		case "sat":
		case "sun":
				System.out.println("holiday");
			break;
			default:
				System.out.println("invalid data");
		}
		
		// TODO Auto-generated method stub

	}

}
