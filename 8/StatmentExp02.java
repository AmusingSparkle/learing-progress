import java.util.Scanner;
public class StatmentExp02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int num=in.nextInt();
		if(100<=num&&num<=999){
			int units=num%10;
			int tens=(num/10)%10;
			int hundreds=num/100;
			if(units*units*units+tens*tens*tens+hundreds*hundreds*hundreds==num){
				System.out.println("这是一个水仙花数！");
			}
			else{
				System.out.println("这不是一个水仙花数！");
			}
		
		}
		else{
			System.out.println("输入的不是一个三位数！");
		}
	}
}