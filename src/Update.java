import java.util.Scanner;

public class Update {
	
	public static void options() {
		String[] options = {
			"<< Chose the number >>",
			"1.First commit",
			"2.push an existing repository from the command line",
			"3.check short cut key for terminal"					
		};
		for(int i= 0; i < options.length; i++) {
			System.out.println(options[i]);
		}
	}
	
	public static void firstCommit() {
		String[] firstCommit = {
				" << create a new repository on the command linet >>",
				"",
				"echo \"# your repositry name\" >> README.md",
				"git init",
				"git add README.md",
				"git commit -m \"first commit\"",
				"git remote add origin git@github.com:your repositry URL",
				"git push -u origin master",
				"",
		};
		for(int i= 0; i < firstCommit.length; i++) {
			System.out.println(firstCommit[i]);
		}
		
	}
	public static void update() {
		String[] updateTheFile = {
				"<< push an existing repository from the command line >>",
				"",
				"git remote add origin git@github.com:your repositry URL",
				"git push -u origin master"	
				};
			
				
				for(int i= 0; i < updateTheFile.length; i++) {
					System.out.println(updateTheFile[i]);
				}
			}
	public static void executeProcedure() {
		String[] procedure = {
				"<< Command to execute a JAVA file on terminal >>",
				"",
				"$ javac filename.java",
				"$ java filename"	
				};		
				for(int i= 0; i < procedure.length; i++) {
					System.out.println(procedure[i]);
				}
			}
	

	public static void main(String[] args) {
			int run = 0;
			Scanner myObj = new Scanner(System.in);

			
		while(run == 0) {
			options();
			int input = myObj.nextInt();
			
			switch(input) {
			case 1:
				firstCommit();
				break;
			case 2:
				update();
				break;
			case 3:
				executeProcedure();	
				
			}
			System.out.println("continue or finish? 0.continue 1.finish");
			int input1 = myObj.nextInt();
			run = input1;
		}
		System.out.println("Have a nice git!");
			
		}
	}
	
			
			
		
		
		
		
	


