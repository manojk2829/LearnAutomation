package deletePractise;

public class StarPattern {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		
		int n=6, k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-2;
			for(int jj=1;jj<=i;jj++){
				System.out.print("* ");
			}System.out.println();
		}
		
        int a=6,b=2*a-2;
	    for(int x=1;x<=a;x++){
	    	for(int y=1;y<=b;y++){
	    		System.out.print(" ");
	    	}b=b-2;
	    	for(int z=1;z<=x;z++){
	    		System.out.print("* ");
	    	}System.out.println();
	    }

		int nn=6;int kk=2*nn-2;
		for(int i=1;i<=nn;i++){
			for(int j=1;j<=kk;j++){
				System.out.print(" "); 
			}kk=kk-2;
			for(int j=i;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		
	}

}
