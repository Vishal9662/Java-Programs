package string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ConcatString {
	
	public static void main(String[] args) {
		
		String st="Vishal";
		st.concat(" Gohil");
		System.out.println(st); // It will not change String bz String is immutable class
		
		StringBuffer sbt=new StringBuffer("Vishal");
		sbt.append(" Gohil");
		System.out.println(sbt); // It will change the String bcz StringBuffer is mutable class
		
		
		//-------------------------------- Concatenation By + Operator ----------------------------------------------------
		String s="Vishal"+" Gohil"+" By + Operator";
		System.out.println(s);	// Compiler use append method like this ---> String s=(new StringBuilder()).append("Vishal").append(" Gohil).toString();  
		System.out.println();
		
		
		//-------------------------------- Concatenation By concat() method ----------------------------------------------------
		String s1="Vishal";
		String s2=" Gohil";
		String s4=" By concat() method";
		
		String s3=s1.concat(s2).concat(s4);
		System.out.println(s3);
		System.out.println();
		
		
		//-------------------------------- Concatenation By StringBuilder Class ----------------------------------------------------
		StringBuilder sb1= new StringBuilder("Vishal");
		StringBuilder sb2= new StringBuilder(" Gohil");
		StringBuilder sb4= new StringBuilder(" By String Builder Class");

		StringBuilder sb3=sb1.append(sb2).append(sb4);
		System.out.println(sb3);
		System.out.println();

		
		//-------------------------------- Concatenation By String.join method ----------------------------------------------------
		String s5 = new String("Vishal");
		String s6 = new String("Gohil");
		String s7 = new String("By String.join method");
		String sj= String.join(" - ",s5, s6,s7);
		System.out.println(sj);
		System.out.println();
		
		
		//-------------------------------- Concatenation By StringJoiner Class ----------------------------------------------------
		StringJoiner sj1=new StringJoiner(" - ");
		sj1.add("Vishal");
		sj1.add("Gohil");
		sj1.add("By StringJoiner Class");
		System.out.println(sj1);
		System.out.println();
		
		
		//-------------------------------- Concatenation By Collectors.joining() method ----------------------------------------------------
		List<String> list=Arrays.asList("Vishal","Gohil","By Collectors.joining() method");
		String str=list.stream().collect(Collectors.joining(" "));
		System.out.println(str);
		
		
	}

}
