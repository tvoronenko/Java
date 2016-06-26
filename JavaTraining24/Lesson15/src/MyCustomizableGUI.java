import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyCustomizableGUI {
	private String[] colorList = {"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow", "Black"};
	private String[] fontList = {"Arial", "Times New Roman", "Helvetica"};
	private String[] fontSizeList = {"12", "18", "25", "40", "64"};
	
MyCustomizableGUI () {
				
				UserPreferences userPrefs = new UserPreferences();
				userPrefs.setColor(colorList[2]);
				userPrefs.setFont(fontList[1]);
				userPrefs.setFontSize(Integer.parseInt(fontSizeList[0])) ;
				
				try (FileOutputStream fileOut = new FileOutputStream("preferences.ser");
					 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);){
					
					objectOut.writeObject(userPrefs);
					
				} catch (IOException ioe) {
					System.out.println("I/O error: " + ioe.getMessage());
				}


	}

	public static void main(String[] args) {
		MyCustomizableGUI custGUI = new MyCustomizableGUI();
		UserPreferences savedPrefs;
		
		try (FileInputStream	 fileIn = new FileInputStream ("preferences.ser");
			 ObjectInputStream objectIn = new ObjectInputStream (fileIn);) {
				
			savedPrefs = (UserPreferences) objectIn.readObject();	
			System.out.println(savedPrefs);
			
			
		} catch (FileNotFoundException noFile) {
			// load default font and color
			
			
		} catch (ClassNotFoundException noPrefs) {
			noPrefs.printStackTrace();
		} catch (IOException e) {
			 System.out.println("I/O Error: " + e.getMessage());
		}

	}

}
