public class varys01{
	public static void main(String[] args){
		System.out.println("Hello"+100+3);
		System.out.println(100+3+"Hello");
		byte i=127;
		System.out.println(i);
		System.out.println(i+1);
		double d1=0.123;
		double d2=.123;
		double d3=1.23e-1;
		double d4=1.23e+2;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		double d=1.234567890123456789;
		double f=1.234567890123456789;
		System.out.println(d);
		System.out.println(f);
		double text=2.5/2;
		System.out.println(text);
		if(text==1.25){
		System.out.println("Yes");
		}
		else{
		System.out.println("double算出来会有精度问题");
		}
		if(Math.abs(1.25-text)<0.0001)
		{
			System.out.println("可以看精度是否在某一范围来判断相等");
		}




	}
}