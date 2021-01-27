package git.Testing;

public class Student {
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	int id;
	String name;

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
}
