public class VarParameterExercise{
	public static void main(String[] args){
		Score s=new Score();
		s.sum("Ben",115,135.5,134.5,90,95.5,97);
		s.sum("Ben",115,135.5,134.5,90);
	}
}
class Score{
	public void sum(String s,double...scores){
		double sum=0.0;
		for(int i=0;i<scores.length;i++){
			sum=sum+scores[i];
		}
		System.out.println(s+"你"+scores.length+"门学科的分数是："+sum);
	}as
}