public class Maze{
	public static void main(String[] args){
		//第一步：利用二维数组生成迷宫，0->没走过的路，1->障碍，2->走过但走得通，3->走过但走不通
		int[][] miGong=new int[8][8];
		//生成边界
		for(int i=0;i<8;i++){
			miGong[0][i]=1;
			miGong[7][i]=1;
		}
		for(int j=0;j<8;j++){
			miGong[j][0]=1;
			miGong[j][7]=1;
		}
		//生成障碍
		miGong[3][1]=1;
		miGong[3][2]=1;
		//打印地图
		for(int m=0;m<miGong.length;m++){
			for(int n=0;n<miGong[m].length;n++){
				System.out.print(miGong[m][n]+" ");
			}
			System.out.println();
		}
		//分割线
		System.out.println("============下面是走迷宫的结果===========");
		//调用策略走迷宫
		Escape e=new Escape();
		if(e.Strategy(miGong,1,1)){//成功就再打印迷宫
			for(int p=0;p<miGong.length;p++){
				for(int q=0;q<miGong[p].length;q++){
					System.out.print(miGong[p][q]+" ");
				}
				System.out.println();
			}
		}
		else{//失败也打印，观察怎么走的
			System.out.println("迷宫是死路！");
			for(int m=0;m<miGong.length;m++){
				for(int n=0;n<miGong[m].length;n++){
					System.out.print(miGong[m][n]+" ");
				}
				System.out.println();
			}
		}
	}
}



class Escape{
	public boolean Strategy(int[][] miGong,int x,int y){
		//策略为下->右->上->左
		if(miGong[6][6]==2){    //到了终点
			return true;
		}
		else{                   //没到终点就先标记，再按计划进行        
			if(miGong[x][y]==0){
				miGong[x][y]=2; //标记
				if(Strategy(miGong,x+1,y)){
					return true;
				}
				else if(Strategy(miGong,x,y+1)){
					return true;
				}
				else if(Strategy(miGong,x-1,y)){
					return true;
				}
				else if(Strategy(miGong,x,y-1)){
					return true;
				}
				else{
					miGong[x][y]=3;
					return false;
				}
			}
			else{
				return false;
			}
		}
	} 
}