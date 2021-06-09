import java.util.Scanner;

public class stackop{
  static int option;

  public static void main(String[] args){
    @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
    stack obj = new stack();

    while(true){
      System.out.println("\n1. PUSH \n2. POP \n3. DISPLAY \n4. EXIT \nEnter your choice: ");
      option = sc.nextInt();

      switch(option)
      {
        case 1: System.out.println("Enter the element: ");
                obj.element = sc.nextInt();
                obj.push(obj.element);
                break;
        case 2: obj.pop();
                break;
        case 3: obj.display();
                break;
        case 4: System.exit(0);
                break;
        default: System.out.println("Invalid input. Enter value between 1 and 4.");
      }
    }
  }
}