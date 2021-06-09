import java.util.Scanner;

public class student{
  String name, usn, branch;
  int contact;
  public void getInfo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name, usn, branch, contact no: ");
    name = sc.nextLine();
    usn = sc.nextLine();
    branch = sc.nextLine();
    contact = sc.nextInt();
  }

  public void dispInfo(){
    System.out.println("Name: " + name);
    System.out.println("USN: " + usn);
    System.out.println("Branch: " + branch);
    System.out.println("Contact: " + contact);
  }

  public static void main(String[] args){
    int n, i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students: ");
    n = sc.nextInt();

    student[] s = new student[n];

    for(i=0; i<n; i++){
      s[i] = new student();
      s[i].getInfo();
    }
    for(i=0; i<n; i++){
      System.out.println("\n\nStudents " + (i+1) + " Details: ");
      s[i].dispInfo();
    }
  }
}