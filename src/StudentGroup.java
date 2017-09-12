import java.util.Date;
import java.lang.String;
import java.io.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
                 
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
           try{           
            if(students==null)
           throws IllegalArgumentException;
            else{
            int i;
                 
                 for(i=0;i<students.length();i++)
                 Student[i]=sc.next();
            }
           }
            catch(IllegalArgumentException iae)
              System.out.println(iae);
                 
                 
                  
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
               try{
              if(index<0 || index>students.length())
               throws IllegalArgumentException;
               else
                System.out.println(Student[index]);
                }
               catch(IllegalArgumentException iae)
              System.out.println(iae);
              
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
                 
                  try{
                  if(student==null || index<0 || index>students.length())
                  throws IllegalArgumentEception;
                  else
                   {
                    
                  Student[index]=student;
                      }
                    }
               
                  catch(IllegalArgumentException iae)
                  System.out.println(iae);
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
                  try{           
            if(student==null)
           throws IllegalArgumentException;
            else{
            
             int i;
            for(i=0;i<=Student.length();i++)
                Student[i+1]=Student[i];
             Student[0]=student;
            }
           }
            catch(IllegalArgumentException iae)
              System.out.println(iae);
             
        
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
         try{           
            if(student==null)
           throws IllegalArgumentException;
            else{
          
             Student[Student.length()]=student;
            }
           }
            catch(IllegalArgumentException iae)
              System.out.println(iae);
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
                 try{           
            if(students==null || index<0 || index>=students.length() || student==null)
           throws IllegalArgumentException;
            else{
            
             int i;
            for(i=index;i<=Student.length();i++)
                Student[i+1]=Student[i];
             Student[index]=student;
            }
           }
            catch(IllegalArgumentException iae)
              System.out.println(iae);
             
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
              try{
                  if(index<0 || index>=students.length())
                  throws IllegalArgumentEception;
                  else
                   {
                    int i;
                     for(i=index;i<=Student.length();i++)
                        Student[i]=Student[i+1];
                      }
                    }
               
                  catch(IllegalArgumentException iae)
                  System.out.println(iae);
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
