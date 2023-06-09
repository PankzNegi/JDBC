import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pankz.app.Student;
import com.pankz.app.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
	System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("Press 1 to ADD students");
		System.out.println("Press 2 to DELETE student");
		System.out.println("Press 3 to DISPLAY student");
		System.out.println("Press 4 to EXIT");
		int choice=Integer.parseInt(br.readLine());
		if(choice==1)
		{
			//add student
			System.out.println("Enter Username :");
			String name=br.readLine();
			System.out.println("Enter user phone");
			String phone=br.readLine();
			System.out.println("Enter user city");
			String city=br.readLine();
			//Create student object to store student
			Student st=new Student(name,phone,city);
			boolean answer=StudentDao.insertStudentToDB(st);
			if(answer)
			{
				System.out.println("Student is added");
			}
			else
			{
				System.out.println("Something went wrong");
			}
			
			System.out.println(st);
			//Now we have to store this st(student info) in database 
		} else if(choice==2)
		{
			//delete student
			System.out.println("Enter Student id to delete");
			int userId=Integer.parseInt(br.readLine());
			boolean f=StudentDao.deleteStudent(userId);
			if(f)
			{
				System.out.println("Deleted...");
			}
				else
				{
					System.out.println("Something went wrong");
				}
			
		} else if(choice==3)
		{
			//display student
			StudentDao.showAllStudents();
		}
		else if(choice==4)
		{
			//exit
			break;
		}
		else
		{
			
		}
	}
	System.out.println("Thankyou for using application");
	System.out.println("See you soon!!!!");

	}

}
