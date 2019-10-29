
public class Update {

	public static void main(String[] args) {
		
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
		
		String[] updateTheFile = {
		"<< push an existing repository from the command line >>",
		"",
		"git remote add origin git@github.com:your repositry URL",
		"git push -u origin master"		
		};
	
		for(int i= 0; i < firstCommit.length; i++) {
			System.out.println(firstCommit[i]);
		}
		
		for(int i= 0; i < updateTheFile.length; i++) {
			System.out.println(updateTheFile[i]);
		}

	}

}
