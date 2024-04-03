package demoaaaaaa;

import java.io.*;
import java.util.*;

class filePro {
	int id;
	String name;
	float GPA;

	void input() throws IOException {
		File f = new File("C:\\test.txt");
		FileWriter fw = new FileWriter(f);
		Scanner objsc = new Scanner(System.in);
		try {
			for(int i = 0; i < 3; i++) {
				System.out.println("Sinh vien thu: "+i);
				System.out.println("id: ");
				this.id = objsc.nextInt();
				objsc.nextLine();
				System.out.println("name: ");
				this.name = objsc.nextLine();
				System.out.println("GPA: ");
				this.GPA = objsc.nextFloat();
				fw.write(this.id + "."+this.name+" "+this.GPA+"\n");
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fw.close();

	}
	void output() throws IOException {
		FileReader fr = new FileReader ("C:\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		try {
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		fr.close();
		br.close();
	}

}


public class FP {

	public static void main(String[] args) throws IOException  {
		filePro f = new filePro();
		f.input();
		f.output();

	}

}
