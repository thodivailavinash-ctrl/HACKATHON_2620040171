import java.util.Scanner;
public class Hackathon2  {
    static class Student{
    String name;
    int rollNumber;
    int marks;
    String courseName;
    int courseCredits;
    Student(String name, int rollNumber, int marks, String courseName, int courseCredits){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    void calculateFee(){
        System.out.println("The fee for the course is:"  + (courseCredits * 1500));
    }
    boolean checkEligibilty(){
        if(marks >= 50){
            return true;
        }
        else{
            return false;
        }
    }
    void calculateScholarship(){
        if(marks >= 85 && marks <= 100){
            System.out.println("The scholarship amount is: " + (courseCredits*1500 * 0.2));
        }
        else if(marks > 70 && marks < 85){
            System.out.println("The scholarship amount is: " + (courseCredits * 1500 * 0.1));
        }
        else
            System.out.println("No Scholarship");
        }
        void calculateFinalFee(){
            if(checkEligibilty()){
                if(marks >= 85 && marks <= 100){
                    System.out.println("The final fee is: " + ( courseCredits * 1500 - (1500 * 0.2)));
                }
                else if(marks > 70 && marks < 85){
                    System.out.println("The final fee is: " + (courseCredits * 1500 - (1500 * 0.1)));
                }
                else{
                    System.out.println("The final fee is: " + (courseCredits * 1500));
                }
            }    
        }
        void displaydetails(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the student: ");
            name = sc.nextLine();
            System.out.println("Enter the roll number of the student: ");
            rollNumber = sc.nextInt();
            System.out.println("Enter the marks of the student: ");
            marks = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter the course name: ");
            courseName = sc.nextLine();
            System.out.println("Enter the course credits: ");
            courseCredits = sc.nextInt();

            calculateFee();
        if(checkEligibilty()){
            System.out.println("The student is eligible for the course");
            calculateScholarship();
            calculateFinalFee();
        }
        else{
            System.out.println("The student is not eligible for the course");

        }
    }



    public static void main(String[] args) {
        Student s1 = new Student("John", 101, 90, "Java Programming", 3);
        s1.displaydetails();
    }
   }
 }

