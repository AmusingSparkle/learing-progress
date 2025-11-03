import java.util.Scanner;
public class ArraySub{
	public static void main(String[] args){
		//题目要求：根据用户需求实现数组元素减少
		//第一步：创建数组
		int arr[]={0,1,2,3,4,5,6,7,8,9};
		//第二步：用转换数组实现元素减少并输出
		// int arr1[]=new int[arr.length-1];
		// for(int i=0;i<arr1.length;i++){
		// 	arr1[i]=arr[i];
		// }
		// arr=arr1;
		// for(int j=0;j<arr.length;j++){
		// 	System.out.println(arr[j]);
		// }
		//第三步判断用户输入
		// boolean flag=true;
		// Scanner in=new Scanner(System.in);
		// do{
		// 	int arr1[]=new int[arr.length-1];
		// 	for(int i=0;i<arr1.length;i++){
		// 		arr1[i]=arr[i];
		// 	}
		// 	arr=arr1;
		// 	for(int j=0;j<arr.length;j++){
		// 		System.out.println(arr[j]);
		// 	}
		// 	System.out.println("是否要继续缩小数组(y/n):");
		// 	char userOpt=in.next().charAt(0);
			
		// 	if(userOpt!='y'){
		// 		flag=false;
		// 	}
		// }while(flag);
		//第四步：保证代码的鲁棒性
		boolean flag=true;
		Scanner in=new Scanner(System.in);
		do{
			if(arr.length==0){
				break;
			}
			int arr1[]=new int[arr.length-1];
			for(int i=0;i<arr1.length;i++){
				arr1[i]=arr[i];
			}
			arr=arr1;
			for(int j=0;j<arr.length;j++){
				System.out.println(arr[j]);
			}
			System.out.println("是否要继续缩小数组(y/n):");
			char userOpt=in.next().charAt(0);
			
			if(userOpt!='y'){
				flag=false;
			}
		}while(flag);

	}
}