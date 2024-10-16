import java.util.*;//package for Scanner class 
class Student 
{
    int rollno;
    String name;
    void get_stud_info() 
    {
        Scanner sc = new Scanner(System.in);//this method is present in the java.util package
        System.out.println("Enter Student Roll No:");
        rollno = sc.nextInt();
        System.out.println("Enter Student Name:");
        name = sc.next();
    }

    void disp_stud_info() 
    {
        System.out.println("Student ROll No=>" + rollno);
        System.out.println("Student Name=>" + name);
    }
}

class Test extends Student 
{
    int marks1, marks2;
    void get_stud_marks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Test-1 Marks:");
        marks1 = sc.nextInt();
        System.out.println("Enter Student Test-2 Marks:");
        marks2 = sc.nextInt();
    }

    void disp_stud_marks() 
    {
        System.out.println("Test-1 Marks=>" + marks1);
        System.out.println("Test-2 Marks=>" + marks2);
    }
}

class Result extends Test 
{
    int total_marks;
    void get_total_marks() 
    {
        total_marks = marks1 + marks2;
    }
    void disp_total_marks() 
    {
        System.out.println("Total Marks:" + total_marks);
    }
}
class MultilevelInheritanceDemo 
{
    public static void main(String args[]) 
    {
        Result t1 = new Result();
        t1.get_stud_info();
        t1.get_stud_marks();
        t1.get_total_marks();

        System.out.println("*******STUDENT INFORMATION SYSTEM********");
        t1.disp_stud_info();
        t1.disp_stud_marks();
        t1.disp_total_marks();
    }
}