package File_Compression;

import java.io.Serializable;

public class User implements Serializable{

	int id;
	String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "id:- "+id+" name:- "+name;
	}
}
