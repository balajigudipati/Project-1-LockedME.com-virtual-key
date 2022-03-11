package company_Lockers_Pvt.Ltd;

import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class LockedMe_com {
	
	private static Scanner sc;
	private static Scanner sc1;
	
	
	public static void main(String[] args) {
		
		// Code to Display Welcome Screen to LOcked.com
		
		 System.out.println("\t"+"\t"+":::WELCOME::");
		 System.out.println("\t"+"\t"+"   ::TO::");
		 System.out.println("\t"+"      "+"::LockedME.com::");
		 
		 System.out.println(" ");
		 
		 // Developer Detail
		 
		 System.out.println("\t"+":Develepor Detail:");
		 System.out.println("DEVELOPER NAME:- BALAJI GUDIPATI");
		 System.out.println("GMAIL ID:- balajigudipati1991@gmail.com");
		 System.out.println("\n");
		 
		 //instruction
		 System.out.println("::INSTRUCTION::");
		 System.out.println("While creating File in in Business-level operations make sure that EnableLUA value to 0 (turn if off)");
		 System.out.println("1.Press keys “Windows Key + R”, type regedit");
		 System.out.println("2.Locate HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Policies\\System\\EnableLUA");
		 System.out.println("3.Update the EnableLUA value to 0 (turn if off)");
		 System.out.println("4.Restart Windows.");
		 
		 System.out.println("\n");
		 
		 while(true) {
			 
			 System.out.println("::::::::::::::::::::::::::::::::: "); 
			 System.out.println("Please choose the below option:-");
			 System.out.println("\t"+ "1.Retrieve the files in Ascending including folders Order");
			 System.out.println("\t"+ "2.Business-level operations ");
			 System.out.println("\t"+ "3.Exit Application");
			 
			 
			// User input
			 sc=new Scanner(System.in);
			 System.out.println("Enter your choise::");
			 
			 // Accepts user input
			 int Choise=sc.nextInt();
			 switch(Choise) {
			 
			 case 1: System.out.println("Retrieve the files in Ascending including folders Order:");
			 File dir = new File("C:\\");
			    if(dir.isDirectory())
			    {
			      // Fetching the list from the directory
			      File[] files = dir.listFiles();

			      System.out.println("All the files including folders:-");
			      System.out.println("--------------------------------");
			      
			      //Lists only files since we have applied file filter
			      for(File file:files)
			      {
			        System.out.println(file.getName());
			      }
			    }
			      break;
			 case 2: System.out.println("Business-level operations");
			 			BusinessLevelOperations();

			 			break;
			 case 3: System.out.println("Exiting the application...");
				System.exit(0);
				
			default : System.out.println("Incorrect input!!! Please re-enter choice from our menu"); 
			 } // Switch closes here
		 
		 } // while closes here
	}// main()closes here.
	
	public static void BusinessLevelOperations(){
	
		sc1=new Scanner(System.in);
		while(true) {
		System.out.println("==========================================");
		System.out.println("\n");
		System.out.println("\t"+"::WELCOME TO Business-level operations::");
		System.out.println("\t"+"::LockeddMe.com_Business-level operations::");
		System.out.println("");
		System.out.println("Please choose below option:");
		System.out.println("1.To create a Directory");
		System.out.println("2.To create a File");
		System.out.println("3.To Delete a File");
		System.out.println("4.To Search file ");
		System.out.println("5.Exit from Business Level Opration(Back to Main Menu)");
		
		System.out.println("");
		System.out.println("Enter your choise::");
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1: System.out.println("::TO CREATE DIRECTORY::");
			System.out.println("Please Enter the directory name to create:");
			String directoryName=sc1.next();
			File file=new File("C:\\"+directoryName);
			file.mkdir();
				System.out.println("Directory created:"+ file.getName());
				//check if created directory exists
				if(file.isDirectory()){
					System.out.println("It is directory");
				}else{
					System.out.println("Not a directory");
				}
			break;
		case 2:System.out.println("::TO CREATE FILE::");
		System.out.println("Please Enter File Name To Create:");
		String mycreatingFile=sc1.next();
			
			try {
			      File myObj = new File("C:\\"+mycreatingFile);
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			
			break;
		case 3:System.out.println("::TO DELETE A FILE::");
			
		System.out.println("Please Enter the File name to delete:");
		String deletingFile=sc1.next();
			File fileDelete=new File("C:\\"+deletingFile);
			if(fileDelete.delete()) {
				System.out.println("Deleted file="+ fileDelete.getName());
				System.out.println("Successfully Deleted.");
			}else {
				System.out.println("FNF(File Not Found)");
				
			}
			break;
		case 4:	System.out.println("::TO SEARCH A FILE::");
		
		//String searchFiling;
		//System.out.println("Please specify the path where to search file:");
		//searchFiling=sc.next();
		
		System.out.println("Please Enter File Name To Search: ");
		String FileName=sc.next();

		
			// Create an object of the File class
			// Replace the file path with path of the directory
			File Directory = new File("C:\\");

			// store all names with same name
			// with/without extension
			String[] flist = Directory.list();
			int flag = 0;
			if (flist==null){
				System.out.println("Empty directory.");
			}
			else {
				
				// Linear search in the array
				for (int i = 0; i < flist.length; i++) {
					String filename = flist[i];
					if (filename.equalsIgnoreCase(FileName)) {
						System.out.println(filename + " found");
						flag = 1;
					}
					
				}
				
			}
			if (flag == 0) {
			System.out.println("File Not Found");
			}	
			
			
	
		break;
		case 5: System.out.println("Existed from Business level Oprations");
			//System.exit(0);
		//Runtime.getRuntime().exit(0);
		return;
		default : System.out.println("Incorrect input!!! Please re-enter choice from our menu");
		}//switch statement
		
		}
	
	}//BusinessLevelOptration methods closes here

	

}//class closes here