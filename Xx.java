package school;

public class Xx {
		public static void main(String args[]){
			System.out.println("教师信息");
			Teacher tea1 = new Teacher();
			tea1.setid(1111111);
			tea1.setTname("刘伟明");
			tea1.setTsex("男");
			tea1.setTcouse("高等数学");
			tea1.show();
			System.out.println("学生信息");
			Student stu1 = new Student();
			stu1.setid(2020322113);
			stu1.setSname("韩欣玥");
			stu1.setSsex("女");
			stu1.setScouse("离散数学");
			stu1.show();
			System.out.println("课程信息");
			Xk c1 = new Xk();
			c1.setKid(111111);
			c1.setKname("高等数学");
			c1.setKadd("教103");
			c1.setKtime("7:40~9:30");
			c1.show();
			Xk c2 = new Xk();
			c2.setKid(222222);
			c2.setKname("离散数学");
			c2.setKadd("教300");
			c2.setKtime("9:40~11:30");
			c2.show();
	}

}
