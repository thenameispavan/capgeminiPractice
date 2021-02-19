package com;

public class FileProgram {

	public static void main(String[] args) {
		CopyDataThread cpy= new CopyDataThread("E://source.txt", "E://target.txt");
		cpy.start();

	}

}
