import java.util.Scanner;
public class BranchStatment02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score=in.nextInt();
		int judge=score/60;
		switch(judge){
			case 1:System.out.println("成绩合格！");break;
			case 0:System.out.println("成绩不合格！");break;
			default:System.out.println("输入的是啥必的成绩！！！");break;
		}
	}
}	


class BranchStatment03{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入现在是几月：");
		int mon=in.nextInt();
		switch(mon){
			case 3:
			case 4:
			case 5:{
				System.out.println("现在是春季！");
				break;
			}
			case 6:
			case 7:
			case 8:{
				System.out.println("现在是夏季！");
				break;
			}
			case 9:
			case 10:
			case 11:{
				System.out.println("现在是秋季！");
				break;
			}
			case 12:
			case 1:
			case 2:{
				System.out.println("现在是冬季！");
				break;
			}
			default:{
				System.out.println("输入不合法！！！");
			}
		}
	}
}