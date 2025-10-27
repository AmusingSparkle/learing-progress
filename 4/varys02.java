public class varys02{
	public static void main(String[] args){
		char text='a';
		System.out.println(text);
		System.out.println((int)text);
		System.out.println(text+10);
		System.out.println((int)(text+10));
		boolean t= true;
		if(t==true){
			System.out.println("布尔值只有true和false,且不能用0和1代替");
		}
		//byte x=255;//报错，自动转换只允许不损失精度的隐形转换
		char x1='a';
		short x2=12;
		byte x3=23;
		//short x=x1+x2+x3;//升格为int，所以应该用int接受
		int x=x1+x2+x3;
		
		System.out.println(x);
		String s="ICanDoIt";
		System.out.println(s.charAt(0));
		String t1="213";
		double t2=Double.parseDouble(t1);
		System.out.println(t2);
	}
}