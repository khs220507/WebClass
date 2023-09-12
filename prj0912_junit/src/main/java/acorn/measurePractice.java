package acorn;

public class measurePractice {
	
	public int[] cntMeasure(int target) {
		int cnt = 0;
		int index = 1;
		
		while(target>=index) {
			if(target % index == 0) {
				cnt++;
			}
			index++;
		}
		
		index = 0;
		
		int[] measure = new int[cnt];

		for(int i=1; i<=target; i++) {
			if(target%i==0) {
				measure[index] = i;
				index++;
			}
		}
		return measure;
	}
	
	public static void main(String[] args) {
		measurePractice m = new measurePractice();
		int[] result = m.cntMeasure(6);
		for(int item : result) {
			System.out.println(item);
		}
	}

}
