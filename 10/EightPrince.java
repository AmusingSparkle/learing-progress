public class EightPrince{
	public void main(String[] args){

	}
}
class E{
	public boolean put(int[] arr,int i){//i是数组下标，val是数组的值
	//最后的条件判断
		for(val=0;val<7;val++){
			for(int j=0;j<i;j++){
				if(arr[j]==val||Math.abs(i-val)==Math.abs(j-arr[j]))
					return false;
				else{
					arr[i]=val;
					return true;					
				}

			}
		}
		//当前递归判断完之后开始判断下一个
		if(put(arr,i+1))
	}
}	

