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
			System.out.println("�γ̺ţ�"+Kid+"  �γ����ƣ�"+Kname+"  �Ͽεص㣺"+add+"  �Ͽ�ʱ�䣺"+time);
		}
	}
	class drop extends Ke{
		
	}

