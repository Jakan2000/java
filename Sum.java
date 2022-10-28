import java.util.Scanner;
class Sum
{
 public static void main(String[]args)
 {
  System.out.println("-----Welcome-----");
  Scanner scan_obj=new Scanner(System.in);
  while(true)
  {
  System.out.println("Enter 2 to add two numbers");
  System.out.println("Enter 3 to add three numbers");
  System.out.println("Enter 4 to add four numbers");
  int a=scan_obj.nextInt();

  if(a==2)
  {
   System.out.println("Enter 2 values");
   int b=scan_obj.nextInt(); int c=scan_obj.nextInt();
   add(b,c);
  }
  else if(a==3)
  {
   System.out.println("Enter 3 values");
   int d=scan_obj.nextInt(); int e=scan_obj.nextInt(); int f=scan_obj.nextInt();
   add(d,e,f);
  }
  else if(a==4)
  {
   System.out.println("Enter 4 values");
   int g=scan_obj.nextInt(); int h=scan_obj.nextInt(); int i=scan_obj.nextInt(); int j=scan_obj.nextInt();
   add(g,h,i,j);
  }
  else
  {
   System.out.println("Invalid choice...!!!");
  }
  System.out.println("Press 1 to continue");
  System.out.println("Press any other number to stop");
  int x=scan_obj.nextInt();
  if(x!=1)
  {
   System.out.println("-----Thank You-----");
   break;
  }
 }
 } 
 public static void add(int b,int c)
 {
  int sum=b+c;
  System.out.println("The sum of "+b+" and "+c+" is "+sum);
 }
 public static void add(int d,int e,int f)
 {
  int sum=d+e+f;
  System.out.println("The sum of "+d+" and "+e+" and "+f+" is "+sum);
 }
 public static void add(int g,int h,int i,int j)
 {
  int sum=g+h+i+j;
  System.out.println("The sum of "+g+" and "+h+" and "+i+" and "+j+" is "+sum);
 }
}