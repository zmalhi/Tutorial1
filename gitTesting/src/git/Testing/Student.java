package git.Testing;

public class Student {
	
	public Student(int id, int name){
		this.id = id;
		this.name = name;
	}
	
	
	int id;
	int name;

	public int getId(){
		return id;
	}
	public int getName(){
		return name;
	}
}
