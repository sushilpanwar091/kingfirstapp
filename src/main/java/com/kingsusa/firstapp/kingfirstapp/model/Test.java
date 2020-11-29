package com.kingsusa.firstapp.kingfirstapp.model;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
public static void main(String[] args) {
	Employee em=new Employee("1","Ankur");
	Employee em1=new Employee("1","Ankur");
	Map m=new HashMap();
	m.put(em, em.getName());
	m.put(em1, em1.getName());
	System.out.println(em.hashCode()+"----"+em1.hashCode());
	System.out.println(em.equals(em1));
	System.out.println(m.get(em));
	System.out.println(m.get(em1));
	m.forEach((k,v)->System.out.println(k));
	
}
}
