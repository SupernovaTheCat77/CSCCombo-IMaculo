import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		
		Student student1 = new Student();
		student1.setName("Jim Smith");
		student1.setAddress("1234 Rosewood Ln");
		student1.setpNumber("123 456 7890");
		student1.setEmail("jsmith@student.edu");
		student1.setStatus("sophomore");
		people.add(student1);
		
		Student student2 = new Student();
		student2.setName("Emily Robertson");
		student2.setAddress("9876 Stuart Dr");
		student2.setpNumber("098 765 4321");
		student2.setEmail("erobertson@student.edu");
		student2.setStatus("senior");
		people.add(student2);
		
		Faculty faculty1 = new Faculty();
		faculty1.setName("Rebecca Johnson");
		faculty1.setAddress("7294 Appleseed Rd");
		faculty1.setpNumber("827 045 2941");
		faculty1.setEmail("rjohnson@faculty.edu");
		faculty1.setOffice("MA214");
		faculty1.setSalary(36000);
		faculty1.setDateHired("01/27/2003");
		faculty1.setOfficeHours("Mon-Fri, 10:00 AM - 3:00 PM");
		faculty1.setRank("senior");
		people.add(faculty1);
		
		Faculty faculty2 = new Faculty();
		faculty2.setName("Gabe Brown");
		faculty2.setAddress("8392 Maple Dr");
		faculty2.setpNumber("641 044 3927");
		faculty2.setEmail("gbrown@faculty.edu");
		faculty2.setOffice("BP119");
		faculty2.setSalary(24000);
		faculty2.setDateHired("07/23/2021");
		faculty2.setOfficeHours("Thur-Fri, 9:00 AM - 6:00 PM");
		faculty2.setRank("junior");
		people.add(faculty2);
		
		Staff staff1 = new Staff();
		staff1.setName("Mikaela Richards");
		staff1.setAddress("9332 College Ave");
		staff1.setpNumber("882 012 0441");
		staff1.setEmail("mrichards@staff.edu");
		staff1.setOffice("MA134");
		staff1.setSalary(40000);
		staff1.setDateHired("02/29/2016");
		staff1.setTitle("doctor");
		people.add(staff1);
		
		Staff staff2 = new Staff();
		staff2.setName("Alex Baker");
		staff2.setAddress("2106 Princeton Rd");
		staff2.setpNumber("746 294 1920");
		staff2.setEmail("abaker@staff.edu");
		staff2.setOffice("BP224");
		staff2.setSalary(38000);
		staff2.setDateHired("11/03/1996");
		staff2.setTitle("professer");
		people.add(staff2);
		
		for (int i = 0; i < people.size(); i++) {
			printPerson(people.get(i));
		}
	}
	
	public static void printPerson(Person person) {
		System.out.println(person.toString());
		System.out.println();
	}

}
