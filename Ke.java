package school;

public class Ke {
		int Kid;
		String Kname;
		String add;
		String time;
	}
	class Xk extends Ke{
		String b;
		Xk(){
		}
		public int setKid(int Kid){
			this.Kid=Kid;
			return Kid;
		}
		public String setKname(String Kname){
			this.Kname=Kname;
			return Kname;
		}
		public String setKadd(String add){
			this.add=add;
			return add;
		}
		public String setKtime(String time){
			this.time=time;
			return time;
		}
		void show(){
			System.out.println("课程号："+Kid+"  课程名称："+Kname+"  上课地点："+add+"  上课时间："+time);
		}
	}
	class drop extends Ke{
		
	}

