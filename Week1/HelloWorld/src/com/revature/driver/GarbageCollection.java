package com.revature.driver;

import com.revature.pojo.Anything;

public class GarbageCollection {
	
	public static void main(String[] args){
		
		for(int i = 0; i < 1000000000; i++){
			
			new Anything("" + i);
			
			if(i%100==0){System.gc();}
			
		}
		
	}

}
