import java.util.*;
class Student{
    
    private String StudentID,name,course;
    private int age;
    private int []marks = new int[5];

            
    Student(String id,String name, int a, String c, int m[])
    {
        this.StudentID = id ;
        this.name = name;
        this.course = c;
        this.age = a;
        for(int i=0;i<5;i++)
          marks[i]=m[i];
    }
    void calculateTotalMarks(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum = sum + marks[i];
        } 
    }
    void calculateGrade(){
        int sum=0;
 	for(int i=0;i<5;i++){
            sum = sum + marks[i];
    }

        if (sum >=90)
            System.out.println("GRADE A");
        else if(sum>=75 && sum<90)
            System.out.println("GRADE B");
        else if (sum>=60 && sum<75)
            System.out.println("GRADEcC");
        else if (sum >=40 && sum < 60)
            System.out.println("GRADE D");
        else 
            System.out.println("FAIL");
    }

   void displayDetails()
        {
       
        System.out.println("age:"+age);
        }
    }




    class Main{
        public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    int marks[]=new int[5];
    System.out.println("Enter your id");
    String id = sc.nextLine();
    System.out.println("Enter your name");
    String name = sc.nextLine();
    System.out.println("Enter your age");
    int age = sc.nextInt();
    System.out.println("Enter your course");
    String course = sc.nextLine();
    System.out.println("Enter the Marks of Five Subject");
    for(int i = 0; i<5;i++){
        marks[i] = sc.nextInt();
    }

    Student s1=new Student(id,name,age,course,marks);
	s1.calculateTotalMarks();
	s1.calculateGrade();
    s1.displayDetails();
        }
    }