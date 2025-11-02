public class StatmentExp06{
	public static void main(String[] args){
		int sum=0;
		int allSum=0;
		for(int i=1;i<=100;i++){
			for(int j=1;j<=i;j++){
				sum+=j;
			}
			allSum+=sum;
		}
		System.out.println(allSum);
	}
}