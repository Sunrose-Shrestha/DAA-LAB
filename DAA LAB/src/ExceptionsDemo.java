import java.util.Scanner;

class ExceptionsDemo{
  public static void main(String[] args){
    int a, b, result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value for a and b: ");
    a = sc.nextInt();
    b = sc.nextInt();

    try{
      result = a/b;
      System.out.println("The result of division is: " + result);
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}