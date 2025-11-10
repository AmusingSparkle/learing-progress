public class Homework05{
	public static void main(String[] args){
		int x=10;
		int y=0;
		Cale c=new Cale(x,y);
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		if(c.div()==-1){
			System.out.println("被除数不能为零！");
		}else{
			System.out.println(c.div());				
		}
	}
}

class Cale{
	int x;
	int y;
	public Cale(int x, int y){
		this.x=x;
		this.y=y;
	}
	public int add(){
		return x+y;
	}
	public int sub(){
		return x-y;
	}
	public int mul(){
		return x*y;
	}
	public double div(){
		if(y==0){
			
			return -1.0;
		}
		else{
			return (double)x/y;
		}
	}
}