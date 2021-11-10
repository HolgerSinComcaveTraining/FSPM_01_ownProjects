import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EasyWrite {

	public static void main(String[] args) {
		File file = new File("..\\Liste.md");
		File newFile = new File("..\\ListeNeu.md");

		try {
			FileWriter fw = new FileWriter(newFile, true);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNext()) {
				String tempString = fileScanner.nextLine();
				System.out.println(tempString);
				fw.write(tempString + System.lineSeparator());
			}

			fileScanner.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Umlaute äüö");
	}

}
