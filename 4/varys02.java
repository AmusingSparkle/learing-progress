public class varys02{
	public static void main(String[] args){
		char text='a';
		System.out.println(text);
		System.out.println((int)text);
		System.out.println(text+10);
		System.out.println((int)(text+10));
		boolean t= true;
		if(t==true){
			System.out.println("����ֵֻ��true��false,�Ҳ�����0��1����");
		}
		//byte x=255;//�����Զ�ת��ֻ������ʧ���ȵ�����ת��
		char x1='a';
		short x2=12;
		byte x3=23;
		//short x=x1+x2+x3;//����Ϊint������Ӧ����int����
		int x=x1+x2+x3;
		
		System.out.println(x);
		String s="ICanDoIt";
		System.out.println(s.charAt(0));
		String t1="213";
		double t2=Double.parseDouble(t1);
		System.out.println(t2);
	}
}