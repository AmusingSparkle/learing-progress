public class ArithmeticOperator{
	public static void main(String[] args){
		int ret1=10/4;
		double ret2=10.0/4;
		double ret3=10/4;
		System.out.println(ret1);
		System.out.println(ret2);
		System.out.println(ret3);

		int r1=10%3;
		int r2=10%(-3);
		int r3=(-10)%3;
		int r4=(-10)%(-3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

		int i=10;
		i=i++;
		i=++i;
		System.out.println(i);
	}
}