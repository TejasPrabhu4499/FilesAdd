package com.aurinpro.test;

import com.aurinpro.model.Boy;
import com.aurinpro.model.Kid;
import com.aurinpro.model.Man;

public class InheritaceTest {
public static void main(String[] args) {
}
	
public static void case2() 
		{
		Boy boy=new Boy();
		boy.eats();
		boy.reads();
		
		Kid kid=new Kid();
		kid.eats();
		kid.plays();
	}

	public static void case1() {
		Man man = new Boy();
		man.plays();
		man.eats();
	}

}
