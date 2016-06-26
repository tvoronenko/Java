import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadZip {

	public static void main(String[] args) {
		ZipEntry ze = null;
		try(FileInputStream myFile = new FileInputStream("Lesson14.zip");
			BufferedInputStream buff = new BufferedInputStream(myFile);
			ZipInputStream zipFile = new ZipInputStream(buff);){
			while((ze = zipFile.getNextEntry()) != null){
				System.out.println(ze.getName());
				zipFile.closeEntry();
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

}
