public class MemberInnerClass{
	private int data=40;

	class InnerClass{
		void display(){
			System.out.println("Data value:"+data);
		}
	}


	public static void main(String args[]){
		MemberInnerClass obj=new MemberInnerClass();
		MemberInnerClass.InnerClass inn=obj.new InnerClass();
		inn.display();
	}
}
