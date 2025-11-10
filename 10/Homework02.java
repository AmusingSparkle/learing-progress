public class Homework02{
	public static void main(String[] args){
		F f=new F();
		String[] arr={"小米","vivo","oppo","华为","荣耀","苹果"};
		int index=f.find(arr,"小米");
		if(index!=-1){
			System.out.println("您要查找的字符串在第"+index+1+"个");
		}
		else{
			System.out.println("要查找的字符串不存在");
		}
	}
}

class F{
	public int find(String[] arr,String s){
		for(int i=0;i<arr.length;i++){
			if(s.equals(arr[i])){
				return i;
			}
		}
		return -1;
	}
}