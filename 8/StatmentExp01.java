public class StatmentExp01{
	public static void main(String[] args){
		double money=100000.0;
		double cost=0.0;//其实可以不用这个变量
		int count=0;
		while(money>1000){
			count++;
			if(money>50000){
				cost=money*0.05;//money*=0.95
				money=money-cost;
			}
			else{
				cost=1000;
				money=money-cost;
			}
		}
		System.out.println(count);
	}
}