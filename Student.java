package overLoading;

public class Student {
	public void getstudentinfo() {
		String name="Fathima";
		int age=12;
		int grade=7;
		System.out.println("Student First Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Grade : "+grade);
	}
	public void getstudentinfo(int id,String name) {
		System.out.println("Student Name: "+name);
		System.out.println("Student Id : "+id);
	}
	public void getstudentinfo(String email,long phone) {
		System.out.println("Student Email : "+email);
		System.out.println("Phone : "+phone);
	}
	public static void main(String[] args) {
		Student std=new Student();
		std.getstudentinfo();
		std.getstudentinfo(123,"Zahra");
		std.getstudentinfo("fathi.zahra@gmail.com", 1234567890L);
	}

}
