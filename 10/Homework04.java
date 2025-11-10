public class Homework04{
	public static void main(String[] args){
		Circle cc=new Circle(1);
	}
}

class Circle{
	int r;
	public Circle(int r){
		this.r=r;
		c(r);
		s(r);
	}
	public void c(int x){
		//double c=2*3.14*x;原本写的
		//但Math.PI可以直接代表Π
		double c=2*Math.PI*x;
		System.out.println(c);
	}
	public void s(int x){
		double s=Math.PI*x*x;
		System.out.println(s);
	}
} 