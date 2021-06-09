import java.util.Scanner;

class staff{
  String staffId, Name;
  int contact;
  float salary;

  staff(String id, String sName, int pNo, float sal){
    staffId = id;
    Name = sName;
    contact = pNo;
    salary = sal;
  }

  public void dispInfo(){
    System.out.println("Staff details are: ");
    System.out.println("Staff ID: " + staffId);
    System.out.println("Staff Name: " + Name);
    System.out.println("Staff Contact: " + contact);
    System.out.println("Staff Salary: " + salary);
  }
}

class TStaff extends staff{
  String dept;
  int nop;

  TStaff(String id, String sName, int pNo, float sal, String branch, int num){
    super(id, sName, pNo, sal);
    dept = branch;
    nop = num;
  }

  public void dispInfo(){
    super.dispInfo();
    System.out.println("Department: " + dept);
    System.out.println("No. of publication: " + nop);
  }
}

class TechStaff extends staff{
  String skills;
  
  TechStaff(String id, String sName, int pNo, float sal, String TSkills){
    super(id, sName, pNo, sal);
    skills = TSkills;
  }

  public void dispInfo(){
    super.dispInfo();

    System.out.println("Skills: " + skills);
  }
}

class ContractStaff extends staff{
  float TPeriod;

  ContractStaff(String id, String sName, int pNo, float sal, float period){
    super(id, sName, pNo, sal);
    TPeriod = period;
  }

  public void dispInfo(){
    super.dispInfo();

    System.out.println("Period: " + TPeriod);
  }
}

class staffdetails{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String id, sName, branch, TSkills; 
    int pNo, num; 
    float sal, period;

    System.out.println("Enter number of staffs: ");
    int n = sc.nextInt();
    
    System.out.println("Enter details for teaching staff: ");
    TStaff[] T = new TStaff[n];

    for(int i=0; i<n; i++){
      System.out.println("Enter id: ");
      id = sc.next();
      System.out.println("Enter name: ");
      sName = sc.next();
      System.out.println("Enter contact number: ");
      pNo = sc.nextInt();
      System.out.println("Enter salary: ");
      sal = sc.nextFloat();
      System.out.println("Enter branch: ");
      branch = sc.next();
      System.out.println("Enter no of publication: ");
      num = sc.nextInt();

      T[i] = new TStaff(id, sName, pNo, sal, branch, num);
    }

    System.out.println("Enter details for technical staff: ");
    TechStaff[] TE = new TechStaff[n];

    for(int i=0; i<n; i++){
      System.out.println("Enter id: ");
      id = sc.next();
      System.out.println("Enter name: ");
      sName = sc.next();
      System.out.println("Enter contact number: ");
      pNo = sc.nextInt();
      System.out.println("Enter salary: ");
      sal = sc.nextFloat();
      System.out.println("Enter skills: ");
      TSkills = sc.next();

      TE[i] = new TechStaff(id, sName, pNo, sal, TSkills);
    }

    System.out.println("Enter details for contract staff: ");
    ContractStaff[] CS = new ContractStaff[n];

    for(int i=0; i<n; i++){
      System.out.println("Enter id: ");
      id = sc.next();
      System.out.println("Enter name: ");
      sName = sc.next();
      System.out.println("Enter contact number: ");
      pNo = sc.nextInt();
      System.out.println("Enter salary: ");
      sal = sc.nextFloat();
      System.out.println("Enter years: ");
      period = sc.nextFloat();

      CS[i] = new ContractStaff(id, sName, pNo, sal, period);
    }

    for(int i=0; i<n; i++){
      T[i].dispInfo();
      TE[i].dispInfo();
      CS[i].dispInfo();    }
  }
}