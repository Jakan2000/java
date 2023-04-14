package Array;

public class StoringHetrogeneousValues {
	int num1;
	
	StoringHetrogeneousValues(int num){
		this.num1=num;
	}

	public static void main(String[] args) {
		
		
		int i=1;
		double d=2.5;
		boolean b=true;
		
		Integer I=Integer.valueOf(i);
		Boolean B=Boolean.valueOf(b);
		Double D=Double.valueOf(d);
		
		Object[] o= {I,B,D};
		
		StoringHetrogeneousValues s1=new StoringHetrogeneousValues(1);
		StoringHetrogeneousValues s2=new StoringHetrogeneousValues(2);
		
		StoringHetrogeneousValues[]s= {s1,s2};
		
		
		for(int x=0; i<o.length; i++) {
			System.out.println(s[x]);
			
		}
		
		
		

	}

}
