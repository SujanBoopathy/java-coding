class Student{
	private int id;
	private String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display(){
		System.out.println(id+" "+name);
	}
}


public class Main{
	public static void main(String args[]){
		Student obj=new Student(123,"sujan");
		obj.display();
	}
}

