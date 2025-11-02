public class StatmentExp05{
	public static void main(String[] args){
		double sum=0.0;
		for(double i=1.0;i<=100.0;i=i+1.0){
			if(i%2==1){
				sum=sum+1/i;
			}
			else{
				sum=sum-1/i;
			}
		}
		System.out.println(sum);
	}
}