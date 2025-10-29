public class TernaryOperator{
	public static void main(String[] args){
		int a=10;
		int b=50;
		int ret=a>b?a:b;
		System.out.println(ret);

		// int err=a>b?1.1:5.6;//±¨´í
		int x=50;
		int y=100;
		int r2=a>b?y++:x++;
		System.out.println(r2);
		System.out.println(x);
		System.out.println(y);
	}

}