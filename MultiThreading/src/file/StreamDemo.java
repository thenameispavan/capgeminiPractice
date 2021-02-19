package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {

	public static void main(String[] args) {
		byte b[]= new byte[60000000];
		FileInputStream fis;
		try {
			fis = new FileInputStream("E://A.mp3");
			fis.read(b);
			FileOutputStream fos= new FileOutputStream("E://new.mp3");
			fos.write(b,1000000,1000000);
			fos.flush();
			fos.close();
			System.out.println("done!");
			System.out.println(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
