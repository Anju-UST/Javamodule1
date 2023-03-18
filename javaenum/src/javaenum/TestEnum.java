package javaenum;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is"+ today.getName());
		
		switch(today)
		{
		case MONDAY:
			System.out.println("work work little more");
			break;
		case TUESDAY:
			System.out.println("work hard");
			break;
		case WEDNESDAY:
			System.out.println("work more");
			break;
		case THURSDAY:
			System.out.println("work work more weekend around");
			break;
		case FRIDAY:
			System.out.println("try little more");
			break;
		case SATURDAY:
			System.out.println("GREAT");
			break;
		case SUNDAY:
			System.out.println("sucess");
			break;
		}
		

	}

}
