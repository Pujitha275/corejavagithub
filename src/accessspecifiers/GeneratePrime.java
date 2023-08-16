package accessspecifiers;

public class GeneratePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num, c=0;
		//	Scanner scanner =new Scanner(System.in);
			
	        for( num=1;num<=100;num++) { 
	          c=0;
			for(int i=1;i<=num;i++) {
				if(num%i == 0) {
					//System.out.println(i);
					c++;
				}
			}
			if(c==2) {
				System.out.println(num);
			}
		}
	}//main
	}	//class


