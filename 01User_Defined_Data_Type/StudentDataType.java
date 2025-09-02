class Student {
    String name;
    String fname;
    int roll;
    
    Student(String name, String fname, int roll) {
        this.name = name;
        this.fname = fname;
        this.roll = roll;
    }
}
public class StudentDataType
{
	public static void main(String[] args) {
	    
		Student s1 = new Student("Ram","Akash",1);
		Student s2 = new Student("Sham","Ashak",2);
		Student s3 = new Student("Mridu","Paban",3);
		
		Student[] stu = {s1, s2, s3};
		
		System.out.println("S1 name : " + stu[0].name);
		System.out.println("S3 name : " + stu[2].name);
	}
}