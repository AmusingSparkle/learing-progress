public class StatmentExp03{
	public static void main(String[] args){
		//题目：输出1~100不能被5整除的的数，每行输出5个
		//思路分析：1.先输出1~100，并选出不能被5整除的数
		//		   2.控制循环5次就跳出换行
		int i=0;
		int count=0;
		for(i=1;i<=100;i++){
			if(i%5!=0){
				System.out.print(i+" ");
				count++;
			}
			if(count%5==0){
				System.out.println();
			}
		}
	}
}