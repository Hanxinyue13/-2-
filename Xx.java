package school;

public class Xx {
		public static void main(String args[]){
			System.out.println("                         ��ʦ��Ϣ");
			Teacher tea1 = new Teacher();
			tea1.setid(1111111);
			tea1.setTname("��ΰ��");
			tea1.setTsex("��");
			tea1.setTcouse("�ߵ���ѧ");
			tea1.show();
			Teacher tea2 = new Teacher();
			tea2.setid(2222222);
			tea2.setTname("κޱ");
			tea2.setTsex("Ů");
			tea2.setTcouse("��ɢ��ѧ");
			tea2.show();
			Teacher tea3 = new Teacher();
			tea3.setid(3333333);
			tea3.setTname("�Թ���");
			tea3.setTsex("��");
			tea3.setTcouse("���������");
			tea3.show();
			System.out.println("                         ѧ����Ϣ");
			Student stu1 = new Student();
			stu1.setid(2020322113);
			stu1.setSname("�����h");
			stu1.setSsex("Ů");
			stu1.setScouse("��ɢ��ѧ");
			stu1.setTk("��������硢�������й���ͳ�Ļ�");
			stu1.show();
			Student stu2 = new Student();
			stu2.setid(2020322114);
			stu2.setSname("������");
			stu2.setSsex("Ů");
			stu2.setScouse("�ߵ���ѧ");
			stu2.setTk("�������й���ͳ�Ļ�");
			stu2.show();
			Student stu3 = new Student();
			stu3.setid(2020322112);
			stu3.setSname("������");
			stu3.setSsex("��");
			stu3.setScouse("���������");
			stu3.setTk("�������й���ͳ�Ļ�");
			stu3.show();
			System.out.println("                         �γ���Ϣ");
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
			Xk c3 = new Xk();
			c3.setKid(333333);
			c3.setKname("��������缼��");
			c3.setKadd("ʵ603");
			c3.setKtime("11:40~12:30");
			c3.show();
	}

}
