import java.util.Scanner;
public class BranchStatment02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������ɼ���");
		int score=in.nextInt();
		int judge=score/60;
		switch(judge){
			case 1:System.out.println("�ɼ��ϸ�");break;
			case 0:System.out.println("�ɼ����ϸ�");break;
			default:System.out.println("�������ɶ�صĳɼ�������");break;
		}
	}
}	


class BranchStatment03{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�����������Ǽ��£�");
		int mon=in.nextInt();
		switch(mon){
			case 3:
			case 4:
			case 5:{
				System.out.println("�����Ǵ�����");
				break;
			}
			case 6:
			case 7:
			case 8:{
				System.out.println("�������ļ���");
				break;
			}
			case 9:
			case 10:
			case 11:{
				System.out.println("�������＾��");
				break;
			}
			case 12:
			case 1:
			case 2:{
				System.out.println("�����Ƕ�����");
				break;
			}
			default:{
				System.out.println("���벻�Ϸ�������");
			}
		}
	}
}