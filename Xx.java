package school;

public class Xx {
		public static void main(String args[]){
			System.out.println("��ʦ��Ϣ");
			Teacher tea1 = new Teacher();
			tea1.setid(1111111);
			tea1.setTname("��ΰ��");
			tea1.setTsex("��");
			tea1.setTcouse("�ߵ���ѧ");
			tea1.show();
			System.out.println("ѧ����Ϣ");
			Student stu1 = new Student();
			stu1.setid(2020322113);
			stu1.setSname("�����h");
			stu1.setSsex("Ů");
			stu1.setScouse("��ɢ��ѧ");
			stu1.show();
			System.out.println("�γ���Ϣ");
			Xk c1 = new Xk();
			c1.setKid(111111);
			c1.setKname("�ߵ���ѧ");
			c1.setKadd("��103");
			c1.setKtime("7:40~9:30");
			c1.show();
			Xk c2 = new Xk();
			c2.setKid(222222);
			c2.setKname("��ɢ��ѧ");
			c2.setKadd("��300");
			c2.setKtime("9:40~11:30");
			c2.show();
	}

}
