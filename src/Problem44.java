
public class Problem44 extends ProblemImpl { // takes 6 sec

	public static void main(String[] args) {
		Problem p = new Problem44();
		p.runProblem();
	} 
	
	public void problem(){// cant find 2 pents that are nex to eachother that work... trying to find pents that are 2 away, then 3 away etc..
		//1, 5, 12, 22, 35, 51, 70, 92, 117, 145, ...
		int max = 1000000; // we will just assume we can do this under a million. If we cant we just keep upping it until we find it, we will eventually. we could just do a while I guess..
		for(int howFarApart=1; howFarApart < 10000; howFarApart++){
			long dif = Util.getPentagonalNumber(howFarApart);
			for(int i=1; i < max; i++){
				dif += (3*howFarApart);
				if(Util.isPentagonalNumber(dif)){
					long p1 = Util.getPentagonalNumber(i);
					long p2 = Util.getPentagonalNumber(i+howFarApart);
					if(Util.isPentagonalNumber(p1+p2)){
						System.out.println("Found 2 pents that add and sub to other pents : p1:" + p1 + " p2:" + p2 + " diff:" +dif + " sum:"  + (p1+p2) +  " howfarapart:"+howFarApart + " i:"+i);
						// we start with the smallest distance we can between the pentagonal numbers.
						// so we check all numbers next to each other (1 away) under max (1 million)
						// if we dont find anything, we start checking numbers that are 2 away, 3 away etc.. until we find a pair..
						// that way we keep the difference as small as possible until we find an answer
						System.out.println("Answer : " + dif);
						return;
					}
				}
				
			}
	
		}
	}
}
