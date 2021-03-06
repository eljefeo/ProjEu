
public class Problem1 extends ProblemImpl {
	
	public static void main(String[] args){
		new Problem1().runProblem();
	}

	@Override
	public void problem(){
		//Summation of all multiples of 3 or 5 less than 1000
		int total = 0;
		for(int i = 0; i < 1000; i++){
			if(i % 3 == 0 || i % 5 == 0){
				total += i;
			}
		}
		System.out.println("Sum of all multiples of 3 or 5 less than 1000 : " + total);
	}
	
}
