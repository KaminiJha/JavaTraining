class Student{
private int rollNo;
private String name;
 Student()
 {
    rollNo=0;
    name="New Student";
 }
 Student(int rollNo)
 {
    this.rollNo=rollNo;
 }
 Student(String name)
 {
    this.name=name;
 }
 Student(int rollNo,String name)
 {
    this.name=name;
    this.rollNo=rollNo;
 }
 public void display()
 {
     System.out.println("Name is "+this.name+" and roll no is "+this.rollNo);
 }
 public int getRollNo()
 {
     return this.rollNo;
 }
 public String getName()
 {
     return this.name;
 }
 public void setRollNo(int newRollNo)
 {
     this.rollNo=newRollNo;
     System.out.println("RollNO updated successfully");
 }
 public void setName(String newName)
 {
     this.name=newName;
     System.out.println("Name updated successfully");
 }
}

public class Task1 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(12);
        Student s3=new Student("Kamini");
        Student s4=new Student(14,"Xyz");
        // System.out.println(s1.rollNo);->error bcz rollNo is private
        //set name in s1
        s1.setName("ABC");
        //set rollno in s2
        s2.setRollNo(15);
        //get rollno from s3
        System.out.println(s3.getRollNo());
        //get name from s4
        System.out.println(s4.getName());
        //display
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
