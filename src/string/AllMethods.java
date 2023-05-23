package string;

public class AllMethods {

	public static void main(String[] args) {
		System.out.println("--------------> The Examples for All Methods <------------------\n");
		
		String name="Vishaaal";
		int count=0;
		
		//-------------------------- charAt() Method --------------------------------------
		System.out.println("--------------> Demo Of charAt() Method <------------------");

		char ch=name.charAt(0);	//Returns the char of given index, It count from 0
		System.out.println(ch);
		
		char c=name.charAt(name.length()-1);	// For find last char of String
		System.out.println(c);
		
		// For display positions of All Characters..
		for(int i=0;i<=name.length()-1;i++) {
			System.out.println("On Position : "+i+" The Char is: "+name.charAt(i));
		}
		System.out.println();
		
		// The frequency of Character, charAt() method is case sensitive, It will count only same case char..
		for(int i=0;i<=name.length()-1;i++) {
			if(name.charAt(i) == 'a') {
				count++;
			}
		}
		
		System.out.println("The frequency of 'A' is : "+count);
		
		//-------------------------- substring() Method - It returns part of string --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of substring() Method <-------------------");
		String sb="Vishal Gohil";
		System.out.println(sb.substring(1,5));	// beginIndex is inclusive-means, that index is countable and endIndex is exclusive-means, that index is not countable..
		System.out.println(sb.substring(7));	//It displaying string from given index..
		
		//-------------------------- contains() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of contains() Method <-------------------");
		System.out.println(name.contains("a"));	//If given char is present then it will give true or else false.. 
		System.out.println(name.contains("o"));
		System.out.println(name.contains("V"));
		
		
		//-------------------------- endsWith() & startsWith() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of endsWith() & startsWith() Method <-------------------");
		System.out.println("endsWith() Demo");
		System.out.println(name.endsWith("l"));		//If String is ending with given char then it will give true or else false..
		System.out.println(name.endsWith("L"));
		
		System.out.println();
		System.out.println("startsWith() Demo");
		System.out.println(name.startsWith("V"));	//If String is starting with given char then it will give true or else false..
		System.out.println(name.startsWith("h", 3)); //If given char is present on given index then it will give true or else false..	
		
		//-------------------------- format() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of format() Method <-------------------");
		String str="This is a String";
		String s=String.format("The String is : %s",str); // this method same as scanf() & printf() method in C.
		System.out.println(s);
		
		
		//-------------------------- getBytes() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of getBytes() Method <-------------------");
		String b="Str";
		byte[] b1=b.getBytes();	//It returns the ASCII value of each Character..
		for(int i=0;i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		
		String ss=new String(b1);  // (If we want) Returns the String Back....
		System.out.println(ss);
		
		
		//-------------------------- getChars() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of getChars() Method <-------------------");
		String getchar="Hello, How r u";
		char[] c1=new char[10];
		getchar.getChars(0, 6, c1, 0);  //int beginIndex: The index from where copying of characters is started.
										//int endIndex: The index which is next to the last character that is getting copied. (exclusive)
										//Char[] destination: The char array where characters from the string that invokes the getChars() method is getting copied.
										//int dstEndIndex: It shows the position in the destination array from where the characters from the string will be pushed.
		System.out.println(c1);
		
		
		//-------------------------- indexOf() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of indexOf() Method <-------------------");
		String io="Demo Of Method";
		System.out.println(io.indexOf("M"));	//It will return the index position of given characters..
		
		//-------------------------- join() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of join() Method <-------------------");
		String join=String.join(" - ","Hello","Vishal"," How are you");	//It will join the strings with given delimiter, The
		System.out.println(join);
		
		
		//-------------------------- lastIndexOf() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of lastIndexOf() Method <-------------------");	
		String last="This is a String a";
		int i=last.lastIndexOf("a");	// It will returns the index position of given char, but it return last char of string.If there is same char then it will take last char.(exclusive)
		System.out.println(i);
		
		int j=last.lastIndexOf("is");
		System.out.println(j);
		
		
		//-------------------------- replace() & replaceAll() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of replace() & replaceAll() Method <-------------------");
		String r="Vishal Java Developer";
		String sr=r.replace("a", "@");	//It will replace the char of given char.
		System.out.println(sr);
		
		
		//-------------------------- split() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of split() Method <-------------------");
		String st="This is a String";
//		String words[]=st.split("\\s");
		String words[] = st.split("i");	//It will cut the string from given char and returns the array of strings..
		for(String w:words) {
			System.out.print(w+"\n");
		}
		
		
		//-------------------------- toCharArray() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of toCharArray() Method <-------------------");
		String strch="Vishal";
		char cs[]=strch.toCharArray();	//It converts the string into char array, and returns the char array
		System.out.println("The length of String Array : "+cs.length);
		for(int k=0;k<cs.length;k++) {
			System.out.println(cs[k]);
		}
		
		//-------------------------- toLowerCase() & toUpperCase() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of toLowerCase() & toUpperCase() Method <-------------------");
		String to="VishAL";
		System.out.println(to.toLowerCase());	//Converts the whole string into lower case
		System.out.println(to.toUpperCase());	//Converts the whole string into Upper case
		
		
		//-------------------------- intern() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of intern() Method <-------------------");
		String s1="String1";
		String s2="String1";
		String s3=new String("String1");
		String s4=s3.intern();	//It will create a exact copy of string object and store it in String constant pool.	
		
		System.out.println(s1 == s2);	// true bcz it both stored in constant pool so both reference point to same object
		System.out.println(s1 == s3);	//false bcz it both stored in non constant pool so it refers different object
		System.out.println(s1==s4); 	//true bcz due to intern method. 
		System.out.println();
				
		
		//-------------------------- valueOf() Method --------------------------------------
		System.out.println();
		System.out.println("--------------> Demo Of valueOf() Method <-------------------");
		int a=10;
		float f=10.55f;
		char cha[]= {'v','i','s','h'};
		
		String sbl=String.valueOf(a); //It will convert int value into string value..
		String sbl1=String.valueOf(f);	//It will convert float value into string value..
		String sbl2=String.valueOf(cha);	//It will convert char array value into string value..
		
		System.out.println(sbl+20);	//with valueOf method..
		System.out.println(a+20);	// without valueOf method..
		
		System.out.println(sbl1+f);	//with valuOf method..
		System.out.println(f+20);	//without valueOf method..
		
		System.out.println(sbl2+'v');
		System.out.println(cha);
	
		

		
	}
}


/*
 ----- > Some Extra Methods... <-----
 trim() -> It removes all spaces from begin and end.
 length() -> It will returns the length of String array. 
  
 */
