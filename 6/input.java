import java.util.Scanner;

public class input{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������༶��");
		String yourclass=in.next();
		System.out.println("��İ༶��"+yourclass);
	


		System.out.println("����������������");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int max=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(max);
	}
}