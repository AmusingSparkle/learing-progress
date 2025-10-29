import java.util.Scanner;

public class input{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入班级：");
		String yourclass=in.next();
		System.out.println("你的班级是"+yourclass);
	


		System.out.println("请输入三个整数：");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int max=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(max);
	}
}