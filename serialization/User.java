package serialization;

import java.io.Serializable;

public class User implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	 String name;
	 
	 public User(int id, String name) {
		 this.id=id;
		 this.name=name;
	}

	 @Override
	public String toString() {
		 return "Id->"+id+" ,Name-> "+name;
	 }
	
}
