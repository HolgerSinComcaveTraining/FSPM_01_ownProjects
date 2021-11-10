import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EasyRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\hsin128\\Desktop\\Workbench\\WB_FSPM\\FSPM_01_ownProjects\\Liste.md");
		try {
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNext()) {
				System.out.println(fileScanner.nextLine());
			}
			
			fileScanner.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
