import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int arr[]=new int[20];
		int a=0;
		int temp=0;
		System.out.println("要创建多大的数组（不超过20）：");
		a=in.nextInt();
		System.out.println("请输入"+a+"个数：");
		for(int i=0;i<a;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("排序后的数组为：");
		for(int m=0;m<a-1;m++){
			boolean evul=false;
			for(int n=0;n<a-1-m;n++){
				if(arr[n]>arr[n+1]){
					temp=arr[n];
					arr[n]=arr[n+1];
					arr[n+1]=temp;
					evul=true;
				}
			}
			if(!evul){
				System.out.println("原数组不需要排序。");
				break;
			}
		}
		for(int b=0;b<a;b++){
			System.out.print(arr[b]+" ");
		}
	}
} 