package school;

public class People {
	int id;
	String name;
	String sex;
	String course;
}
class Teacher extends People{
	Teacher(){
	}
	public int setid(int id){
		this.id = id;
		return id;
	}
	public String setTname(String name){
		this.name=name;
		return this.name;
	}
	public String setTsex(String sex){
		this.sex=sex;
		return this.sex;
	}
	public String setTcouse(String course){
		this.course=course;
		return course;
	}
	void show(){
		
		System.out.println("教职工号："+id+"  教师姓名："+name+"  性别:"+sex+"  授课："+course);
	}
}
class Student extends People{
	Student(){
	}
	public int setid(int id){
		this.id = id;
		return id;
	}
	public String setSname(String name){
		this.name=name;
		return this.name;
	}
	public String setSsex(String sex){
		this.sex=sex;
		return this.sex;
	}
	public String setScouse(String course){
		this.course=course;
		return course;
	}
	public String setTk(String tk){
		this.tk=tk;
		return tk;
	}
	void show(){
		System.out.println("学生号："+id+"  学生姓名："+name+"  性别:"+sex+"  选课："+course);
	}
}


