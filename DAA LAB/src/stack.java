//Program 1b

import java.util.Scanner;

public class stack{
  int element, maxsize, top;
  int[] st;

  public stack(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the stack: ");
    maxsize = sc.nextInt();

    st = new int[maxsize];
    top = -1;
  }

  public int push(int element){
    try{
      st[top+1] = element;
      top++;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    return 0;
  }

  public int pop(){
    if(top==-1){
      System.out.println("Stack Underflow");
      return 0;
    }

    System.out.println("Popped element: " + st[top--]);
    return 0;
  }

  public int display(){
    int i;
    if(top==-1){
      System.out.println("No elements to display!");
      return 0;
    }

    System.out.println("The stack elements are: ");
    for(i=0; i<=top; i++)
      System.out.println(st[i]);

    return 0;
  }
}
  

