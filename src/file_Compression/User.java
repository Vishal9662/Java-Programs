package file_Compression;

import java.io.Serializable;

public class User implements Serializable{

// SerialVersionUID is used to ensure that during deserialization the same class (that was used during serialize process) is loaded.

	
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toStirng() {
		return "Id:- "+id+", Name:- "+name;
	}
}
