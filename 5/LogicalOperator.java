public class LogicalOperator{
	public static void main(String[] args){
			int x=9;
			int y=9;
			if(x++==10&&y++==10)
				x=100;
			System.out.println(x);
			System.out.println(y);

			x=9;
			y=9;
			if(x++==10&y++==10)
				x=100;
			System.out.println(x);
			System.out.println(y);


			x=9;
			y=9;
			if(++x==10|y++==10)
				x=100;
			System.out.println(x);
			System.out.println(y);


			x=9;
			y=9;
			if(++x==10||y++==10)
				x=100;
			System.out.println(x);
			System.out.println(y);



	}
}