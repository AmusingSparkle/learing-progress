public class Homework03{
	public static void main(String[] args){
		int[] arr={0,1,2,3,4,5,6};
		A03 a=new A03();
		System.out.println("=======原数组为=========");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int[] coarr=a.copyArr(arr);
		System.out.println("========复制的数组为========");
		for(int j=0;j<coarr.length;j++){
			System.out.print(coarr[j]+" ");
		}
	}
}

class A03{
	public int[] copyArr(int[] arr){
		int[] coarr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			coarr[i]=arr[i];
		}
		return coarr;
	}
}