package basic;

public class TriangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for(int i=1;i<=4;i++){
//	for(int j=1;j<=i;j++){
//		//inverted triangle
//		//for(int i=1;i<=4;i++){
//			//for(int j=4;j>=i;j--){
//System.out.print("* ");
//	}
//	System.out.println();
//	}
//		//combined traingle
//		for(int i=1;i<=3;i++){
//			for(int j=3;j>=i;j--){
//System.out.print("* ");
//			}
//			System.out.println();
//			}
		//to print inverted triangle with spaces
//		for(int i=0;i<=4;i++){
//			for(int j=1;j<=4-i;j++) {
////		for(int i=4;i>=1;i--){
////			for(int j=4;j>i;j--) {
//				System.out.print(" ");
//			}
//			//spaces triangle
//			for(int k=1;k<=i;k++) {
//			System.out.print("*");
//			}
//		System.out.println("");
//		}
//		}
	int row=1,n=3;
	for (int i = n; i >0; i--) {

		for (int j =i; j<i; j++) { 

		System.out.print(" "); 
		}

		for (int j = 1; j <= row; j++) { 
		System.out.print(" "+i); 
		}
		System.out.println(); //Newline
		}
}
}
