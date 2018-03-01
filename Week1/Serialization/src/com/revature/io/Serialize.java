package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	
	
	public static void main(String[] args) {
		
		Planets pluto = new Planets(2, 9, "Pluto", 1048);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myPlanet.dat"))){
			
			oos.writeObject(pluto);
			System.out.println("Done");
			System.out.println(pluto);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myPlanet.dat"))){
			
			Planets newPlanet = (Planets) ois.readObject();
			
			System.out.println("Found: " + newPlanet);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
