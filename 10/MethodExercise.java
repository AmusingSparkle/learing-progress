import java.util.*;
public class MethodExercise{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a=in.nextInt();
		AA text=new AA();
		if(text.isOdd(a)){
			System.out.println("这是一个奇数。");
		}
		else{
			System.out.println("这是一个偶数。");
		}
	}
}
class AA{
	public boolean isOdd(int x){
		if(x%2==0){
			return false;
		}
		else{
			return true;
		}
	}
}