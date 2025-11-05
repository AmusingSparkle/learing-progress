import java.util.*;
public class ClassLearning{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Pupil Ben=new Pupil();
		Ben.name="Ben";
		Ben.age=8;
		Ben.speak();
		Ben.selIntro();
		int a=10,b=3;
		double[] ret=Ben.calculation(a,b);
		System.out.println(Arrays.toString(ret));
	}
}

class Pupil{
	String name;
	int age;
	public void speak(){
		System.out.println("我是"+name);
	}
	public void selIntro(){
		System.out.println("我会四则运算：");
	}
	public double[] calculation(int x,int y){
		double[] calReturn=new double[4];
		calReturn[0]=x+y;
		calReturn[1]=x-y;
		calReturn[2]=x*y;
		calReturn[3]=x/y;
		return calReturn;

			}
}