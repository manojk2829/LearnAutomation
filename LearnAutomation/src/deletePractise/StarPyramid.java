package deletePractise;

public class StarPyramid {
	public static void main(String[] args) {
		int n=6;int k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		 for(int i=2;i<=10;i++){
			 n3=n1+n2;
			 System.out.print(" "+n3);
			 n1=n2;
			 n2=n3;
		 }
		 System.out.println(" ");
		 System.out.println("--------  PELINDROME  ---------");
		 int num=12321,temp,sum=0;
		 temp=num;
		 while(num>0){
			 int r = num%10;
			 sum = (sum*10)+r;
			 num=num/10;
		 }if(temp == sum){
			 System.out.println("Pelindrome");
		 }else{
			 System.out.println("Not Pelindrome");
		 }
		 System.out.println(" ");
		 System.out.println("--------  Armstrong   ---------");
		 
		 int number = 153;
		 int tempStore = number;
		 int s=0;
		 int d=0;
		 while(number>0){
			 d = number%10;
			 s = s + (d * d * d);
			 number = number/10;
		 }if(tempStore==s){
			 System.out.println("Number is 153 Armstrong" );
		 }else{
			 System.out.println("Number is not Armstrong" );
		 }
		 
		 
		 
		 
	}
}
