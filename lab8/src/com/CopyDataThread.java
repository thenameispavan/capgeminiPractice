package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {

	String file1;
	String file2;
	public CopyDataThread(String file1, String file2) {
		super();
		this.file1 = file1;
		this.file2 = file2;
	}
	public void run() {
		try {
			FileReader fr= new FileReader(file1);
			FileWriter fw= new FileWriter(file2,true);
			int a=0;
			int counter=0;
			while((a=fr.read())!=-1) {
				fw.write((char)a);
				fw.flush();
				counter++;
				if(counter==10) {
					System.out.println("10 characters copied");
					Thread.sleep(5000);
					counter=0;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
