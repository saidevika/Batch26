package jrout.tutorial.corejava.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	File file = new File("/Users/jrout/git/batch26/CoreJava/src/testing/Testing.txt");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		FileExample fe = new FileExample();
//		fe.createFile();
//		fe.writeContentToFile();
		fe.readContentFromFile();
	}

	/**
	 * Creates a new File if it does not exist
	 */
	private void createFile() {
		try {
			boolean newFile = false;

			System.out.println("Is the file exist ? " + file.exists()); // look
																		// for a
																		// real
			System.out.println(file.canExecute());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
//			
			if (!file.exists()) {
				newFile = file.createNewFile(); // maybe create a file!
			}
			System.out.println("Has a new File been created ? " + newFile); // already
																			// there?
			System.out.println("Is the File Exists nows ? " + file.exists()); // look
																				// again
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write some content to the file
	 * 
	 * @throws IOException
	 */
	private void writeContentToFile() {
		FileWriter fw = null;
		try {
			int a = 10;
			fw = new FileWriter(file);
			fw.write("Good Morning\nfolks\nHow u doing...");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void readContentFromFile() throws IOException {
		char[] bagArray = new char[50];
		FileReader fr = null;
		int size;
		fr = new FileReader(file);
		size = fr.read(bagArray); // read the content of file into the char array
		System.out.println(size + " "); // how many bytes read

		for (char c : bagArray)
			System.out.print(c);
		
		if(fr != null){
			try{
				fr.close();	
			}catch(Exception exp){}
		}
	}
}