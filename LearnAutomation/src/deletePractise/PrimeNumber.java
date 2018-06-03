package deletePractise;

public class PrimeNumber {

	public static void main(String[] args) {
		int nnn=31;
		   for(int i=2;i<=nnn;i++){
			   boolean isPP=true;
			   for(int j=2;j<i;j++){
				   if(i%j==0){
					   isPP=false;
					   break;
				   }
			   }if(isPP){
				  System.out.println(i); 
			   }
		   }
		   int n=29;
		   for(int i=2;i<=n;i++){
			   boolean isPrime = true;
			   for(int j=2;j<i;j++){
				   if(i%j==0){
					   isPrime = false;
					   break;
				   }
			   }if(isPrime){
				   System.out.println(i);
			   }
		   }
		   
		   boolean is=true;
		   for(int i=2;i<n/2;i++){
			   if(n%i==0){
				   is=false;
				   break;
			   }
		   }if(is){
			   System.out.println("Number is Prime " + n);
		   }else{
			   System.out.println("Number is not prime --- > " + n);
		   }
         }
}
