public class ThisExercise{
	public static void main(String[] args){
		Person p1=new Person("Ben",16);
		Person p2=new Person("Jack",18);
		System.out.println(p1.toCompare(p2));
	}
}

class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean toCompare(Person p){
		return this.name.equals(p.name)&&this.age==p.age;
	}
}