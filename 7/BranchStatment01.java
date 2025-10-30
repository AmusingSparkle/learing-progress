import java.util.Scanner;
public class BranchStatment01{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入月份：");
		int month=in.nextInt();
		System.out.println("请输入年龄：");
		int age=in.nextInt();
		int cost=0;
		if(month>0&&month<13){
			if(month>=4&&month<=10){
				if(age>=18&&age<=60){
					cost=60;
				}
				else if(age<18&&age>0){
					cost=30;
				}
				else if(age>60&&age<150){
					cost=20;
				}
				else{
					System.out.println("年龄不正确！");
				}
			}
			else {
				if(age>=18&&age<=60){
					cost=40;
				}
				else{
					cost=20;
				}
			}
		}
		System.out.println("您的票价为："+cost);
	}
}