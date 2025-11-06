public class MethodParameter{
	public static void main(String[] args){
		A a=new A();
		int arr[]={1,2,3};
		a.text100(arr);
		System.out.println("main的数组输出为：");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+"\t");
		}
		Person p=new Person();
		p.name="Ben";
		p.age=16;
		B b=new B();
		b.text200(p);
		System.out.println("mian中的age为："+p.age);
	}
}
class Person{
	String name;
	int age;
}

class A{
	public void text100(int[] arr){
		arr[0]=100;
		System.out.print("类中的数组输出为："+"\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}

class B{
	public void text200(Person p){
		p.age=200;
		System.out.println("类中的age为："+p.age);
	}
}