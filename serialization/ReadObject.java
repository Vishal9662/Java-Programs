package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try {
			FileInputStream fis=new FileInputStream(new File("D:\\Object.txt"));
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			User res=(User) ois.readObject();
			User res1=(User) ois.readObject();
			User res2=(User) ois.readObject();
			User res3=(User) ois.readObject();
//			User res4=(User) ois.readObject();	//If you read extra object which is not present then it will throw exception...

			
			
			System.out.println("Data in file:-> "+res);
			System.out.println("Data in file:-> "+res1);
			System.out.println("Data in file:-> "+res2);
			System.out.println("Data in file:-> "+res3);


			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
