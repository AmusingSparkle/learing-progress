public class HanoiTower{
	public static void main(String[] args){
		T t=new T();
		t.tower(10,'A','B','C');
	}
}
class T{
	public void tower(int num,char a,char b,char c){
		//有后往前推，只剩最后一个时就直接有a->c,这也是递归的最终条件
		if(num==1){
			System.out.println(a+"->"+c);
		}
		//再向前推，当不止一个的时候，就当成两个，最底下的和最后的
		else{
			//要移动最底下的就要将上面的移动到b
			tower(num-1,a,c,b);
			//移动完之后将最后一个由a移动到c
			System.out.println(a+"->"+c);
			//最后将b上的移动到c
			tower(num-1,b,a,c);
		}
	}
}