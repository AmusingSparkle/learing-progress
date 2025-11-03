import java.util.Scanner;
public class ArrayReversal{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int arr[]=new int[10];
		
		System.out.println("请输入十个数字：");
		for(int i=0;i<10;i++){
			arr[i]=in.nextInt();
		}
		for(int j=0;j<(arr.length-1)/2;j++){
			int temp=0;
			temp=arr[j];
			arr[j]=arr[9-j];
			arr[9-j]=temp;	
		}
		for(int m=0;m<arr.length;m++){
			System.out.print(arr[m]+"\t");
		}
		
	}
}
class ArrayReversal02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		
		System.out.println("请输入十个数字：");
		for(int i=0;i<10;i++){
			arr[i]=input.nextInt();
		}
		int arr1[]=new int[10];
		for(int m=9;m>=0;m--){
			arr1[9-m]=arr[m];
		}
		arr=arr1;
		for(int j=0;j<10;j++){
			System.out.println(arr[j]+"\t");
		}
	}
}