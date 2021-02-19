package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("E://Data.txt");
			BufferedReader br=new BufferedReader(fr);
			String str="";
			while((str=br.readLine())!=null) {
				System.out.println(str.substring(0,str.length()/3));
			}
//			int a=0;
//			while((a=fr.read())!=-1) {
//				
//				System.out.print((char)a);
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
