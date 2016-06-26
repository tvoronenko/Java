import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReader {

	public static void main(String[] args) {
		String nextLIne;
		URL url = null;
		URLConnection urlConn = null;
		
		try{
			url = new URL("www.google.com");
			urlConn = url.openConnection();
			
			
		}catch (IOException ieo){
			ieo.printStackTrace();
			
		}
		
		try (InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream(), "UTF8");
				BufferedReader buff = new BufferedReader(inStream);){
			
			while(true){
				nextLIne = buff.readLine();
				if(nextLIne !=null){
					System.out.println(nextLIne);
				}
				else{
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
