public class OverLoadExercise{
	public static void main(String[] args){
		Method n=new Method();
		int i=n.m(2);
		double j=n.m(0.001,0.01);
		System.out.println("第一个的结果为："+i);
		System.out.println("第二个的结果为："+j);
		n.m("I learn the overload!");
	}
}
class Method{
	public int m(int x){
		return x*x;
	}
	public double m(double x,double y){
		return (x>y?x:y);
	}
	public void m(String s){
		System.out.println(s);
	}
}