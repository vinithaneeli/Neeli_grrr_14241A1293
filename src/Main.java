import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
                StudentGroup ob;
                Scanner sc=new Scanner(System.in);
                 
                 String Student[]=new String[n];
                 ob.setStudents(Student); 
                  System.out.println("enter the index");
                   int in=sc.nextInt();
                  ob.getStudent(in);
                  System.out.println("enter the string");
                  String st=sc.next();
                    System.out.println("enter the index");
                   int in1=sc.nextInt();
                  ob.setStudent(st,in1);
                   System.out.println("enter the string which you want to insert at the beginning");
                  String st1=sc.next();
                  ob.addFirst(st1);
                    System.out.println("enter the string which you want to insert at the last");
                  String st2=sc.next();
                  ob.addLast(st2);
                    System.out.println("enter the index");
                   int in2=sc.nextInt();
                     System.out.println("enter the string to be inserted");
                String st3=sc.nextInt();
                    ob.add(st3,in2);
              System.out.println("enter the index where you want to delete the element");
             int in3=sc.nextInt();
                    ob.remove(in3);
                      
                  
               


		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
