import java.util.Scanner;
public class ArrayHomework01{
	public static void main(String[] args){
		//要求：已知有一个升序的数组，现在插入一个元素，使其仍是升序
		//1.创建一个升序数组：
		int arr[]={1,2,3,5,7,8};
		//2.插入一个元素：
		Scanner in=new Scanner(System.in);
		System.out.println("请输入要插入的整数：");
		int input=in.nextInt();
		//3.数组扩容，并将其排到数组的最后一个
		int arr1[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++){
			arr1[i]=arr[i];
		}
		arr1[arr1.length-1]=input;
		arr=arr1;
		// //试验输出是否正确
		// for(int j=0;j<arr.length;j++){
		// 	System.out.print(arr[j]+" ");
		// }
		//4.判断是否为升序,如果不是，就冒泡排序，其实这里可以不要冒泡排序的，但我想练练。
		int temp=0;
		if(arr[arr.length-1]<arr[arr.length-2]){
			for(int n=0;n<arr.length-1;n++){
				for(int m=0;m<arr.length-1-n;m++){
					if(arr[m]>arr[m+1]){
						temp=arr[m];
						arr[m]=arr[m+1];
						arr[m+1]=temp;
					}
				}
			}
			System.out.print("插入后的数组为：");
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]+" ");
			}
		}
		else{
			System.out.print("插入后的数组为：");
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]+" ");
			}
		}
	}
}