interface pen{//using interface
	void write();
	void fill();
}
interface pencil{
	void write();
	void sharpen();
}
class Student implements pen,pencil{
	
	public void displayStudent() {
		System.out.println("Student is writing ");
		
	}
	public void sharpen() {
		//System.out.println("This is sharpen method! ");
		
	}
	public void write() {
		//System.out.println("This is write method! ");
		
	}
	public void fill() {
		//System.out.println("This is fill method! ");
		
	}
}
public class Q_3 {

	public static void main(String[] args) {
		Student st=new Student();
		st.displayStudent();
		//st.write();
		//st.fill();
		//st.sharpen();
		

	}

}
