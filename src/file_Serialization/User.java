package file_Serialization;

import java.io.Serializable;

public class User implements Serializable {
	
// SerialVersionUID is used to ensure that during deserialization the same class (that was used during serialize process) is loaded.
	 
	private static final long serialVersionUID = 1L;
	
	
	int id;
	String name;

	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Id is :-"+id+", Name is :-"+name;
	}

}
