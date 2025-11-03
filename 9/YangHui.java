public class YangHui{
	public static void main(String[] args){
		//打印杨辉三角
		//创建一个二维数组，第一行一个，第二行两个，第三行三个...
		//先死后活，先整一个10行的
		int arr[][]=new int [10][];
		for(int i=0;i<arr.length;i++){
			arr[i]=new int[i+1];
			for(int j=0;j<arr[i].length;j++){
				if(j==0||j==arr[i].length-1){
					arr[i][j]=1;
				}
				else{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
			}
		}
		for(int p=0;p<arr.length;p++){
			for(int q=0;q<arr[p].length;q++){
				System.out.print(arr[p][q]+" ");
			}
			System.out.print("\n");
		}
	}
}