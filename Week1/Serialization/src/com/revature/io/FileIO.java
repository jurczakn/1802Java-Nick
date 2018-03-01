package com.revature.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		FileWriter fw;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("test1.txt");
			bw = new BufferedWriter(fw);
			bw.write("This is a simple text document writen in java");
			bw.newLine();
			bw.write("This should be on the second line");
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(bw != null)bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter("test2.txt", true))){
			
			bw2.write("This is my Second text document writen in java");
			bw2.newLine();
			bw2.write("This should be on the second line");
			System.out.println("Done!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			System.out.println("finally");
			
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("test1.txt"))){
			
			String s = null;
			
			while((s=br.readLine()) != null){
				
				System.out.println(s);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
