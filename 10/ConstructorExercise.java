public class ConstructorExercise{
	public static void main(String[] args){
		Person p1=new Person();
		Person p2=new Person("Ben",12);
		Person p3=new Person("Jack",18);
		System.out.println(p1.age);
		System.out.println(p2.name+"的年龄为："+p2.age);
		System.out.println(p3.name+"的年龄为："+p3.age);
	}
}
class Person{
	String name;
	int age;
	Person(){
		age=18;
	}
	Person(String pname,int page){
		name=pname;
		age=page;
	}
}
