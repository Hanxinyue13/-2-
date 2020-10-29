package school;

public class Xx {
		public static void main(String args[]){
			System.out.println("                         教师信息");
			Teacher tea1 = new Teacher();
			tea1.setid(1111111);
			tea1.setTname("刘伟明");
			tea1.setTsex("男");
			tea1.setTcouse("高等数学");
			tea1.show();
			Teacher tea2 = new Teacher();
			tea2.setid(2222222);
			tea2.setTname("魏薇");
			tea2.setTsex("女");
			tea2.setTcouse("离散数学");
			tea2.show();
			Teacher tea3 = new Teacher();
			tea3.setid(3333333);
			tea3.setTname("赵国庆");
			tea3.setTsex("男");
			tea3.setTcouse("计算机网络");
			tea3.show();
			System.out.println("                         学生信息");
			Student stu1 = new Student();
			stu1.setid(2020322113);
			stu1.setSname("韩欣玥");
			stu1.setSsex("女");
			stu1.setScouse("离散数学");
			stu1.setTk("计算机网络、体育、中国传统文化");
			stu1.show();
			Student stu2 = new Student();
			stu2.setid(2020322114);
			stu2.setSname("刘冬蕊");
			stu2.setSsex("女");
			stu2.setScouse("高等数学");
			stu2.setTk("体育、中国传统文化");
			stu2.show();
			Student stu3 = new Student();
			stu3.setid(2020322112);
			stu3.setSname("公海旭");
			stu3.setSsex("男");
			stu3.setScouse("计算机网络");
			stu3.setTk("体育、中国传统文化");
			stu3.show();
			System.out.println("                         课程信息");
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
			Xk c3 = new Xk();
			c3.setKid(333333);
			c3.setKname("计算机网络技术");
			c3.setKadd("实603");
			c3.setKtime("11:40~12:30");
			c3.show();
	}

}
