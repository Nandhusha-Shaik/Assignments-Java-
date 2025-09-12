package assignments;

public class Pattern {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++){
			for(int j=1;j<=2*i-1;j++){
				if(j==1 && (i>=2 && i<=5)){
					System.out.print(".");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			for(int j=2*i-1;j>=1;j--){
				if(j==2*i-1 && (i>1 && i<=4)){
					System.out.print(".");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
