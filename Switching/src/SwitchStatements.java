
public class SwitchStatements {
	
	public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			switch(i) {
//			case 1:
//				System.out.println("one");
//				break;
//			case 2:
//				System.out.println("two");
//				break;
//			default:
//				System.out.println("number");
//				break;
//			}
//			if (i == 4) {
//				break;
//			}
//		}
//		
//		int num = 0;
//		while(true) {
//			System.out.println("Before " + num);
//			if (num == 3) {
//				break;
//				//continue;
//			}
//			if (num == 7) {
//				break;
//			}
//			System.out.println("After " + num);
//			num++;
//		}
//		
//		String food = "strawberry";
//		switch (food) {
//		case "apple":
//		case "banana":
//		case "tomato":
//			System.out.println("Fruits!");
//			break;
//		case "carrot":
//		case "peas":
//		case "broccoli":
//			System.out.println("Veggies!");
//			break;
//		default:
//			System.out.println("Not a fruit or a veggie");
//		}
//		
		Day day = Day.WEDNESDAY;
		int numLetters = switch (day) {
			case MONDAY:
			case FRIDAY:
			case SUNDAY:
				//System.out.println(6);
				yield 6;
			case TUESDAY:
				//System.out.println(7);
				yield 7;
			case THURSDAY:
			case SATURDAY:
				//System.out.println(8);
				yield 8;
			case WEDNESDAY:
				//System.out.println(9);
				yield 9;
			default:
				throw new IllegalStateException("Invalid day: " + day);
		};
		System.out.println(numLetters);
		
		day = Day.FRIDAY;
		System.out.println( "Number of letters in " + day + " = " +
			switch (day) {
				case MONDAY, FRIDAY, SUNDAY -> 6;
				case TUESDAY -> 7;
				case THURSDAY -> 8;
				case WEDNESDAY -> 9;
				default -> throw new IllegalStateException("Invalid day: " + day);
				});
		
	}

}
