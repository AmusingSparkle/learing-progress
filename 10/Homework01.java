public class Homework01{
	public static void main(String[] args){
		M m=new M();
		double arr[]={0.01,0.123123,0.132412,1.34144,1234.41234,524.245};
		System.out.println("当前数组的最大值为："+m.max(arr));
	}
}

class M{
	public double max(double[] arr){
		double max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	
}