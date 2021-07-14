import java.util.Scanner;
import java.util.StringTokenizer;

class details{
  String name, dateOfBirth;

  void readData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the customer name: ");
    name = sc.next();
    System.out.println("Enter date of birth in dd/mm/yyyy format: ");
    dateOfBirth = sc.next();
    sc.close();
  }

  void display(){
    StringTokenizer st = new StringTokenizer(dateOfBirth,"/");
    System.out.println("The details of customer are: ");
    System.out.print("<Name,DD,MM,YYYY> " + name);
    while(st.hasMoreTokens()){
      System.out.print(","+st.nextToken());
    }
  }
}

public class customer{
  public static void main(String[] args){
    details c = new details();
    c.readData();
    c.display();
  }
}