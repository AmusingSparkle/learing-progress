public class Homework06{
	public static void main(String[] args){
		Circle c=new Circle(3);
		PassObject p=new PassObject();
		System.out.println("Radius\tArea");
		p.printAreas(c,5);
	}
}

class Circle{
	double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double findArea(int x){
		return Math.PI*radius*radius;
	}
}

class PassObject{
	public void printAreas(Circle c,int times){
		for(int i=1;i<=times;i++){
			double ret=c.findArea(i);
			System.out.print(i+"\t"+ret);
		}
	}
}
