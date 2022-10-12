public class MemberInnerClass{
	private int data=40;

	class InnerClass{
		void display(){
			System.out.println("Data value is :"+data);
		}
	}


	public static void main(String args[]){
		MemberInnerClass object=new MemberInnerClass();
		MemberInnerClass.InnerClass innerClassObject=object.new InnerClass();
		innerClassObject.display();
	}
}
