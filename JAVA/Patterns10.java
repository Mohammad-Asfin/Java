//Square Pattern
class square{
	public static void main(String[] args){
		// int n=5;
		// for(int i=0;i<5;i++){
		// for (int j=0;j<5;j++){
			// System.out.print("*");
		// }
		// System.out.println();
		// }
	


		//Square 11111's
		// int n=5;
		// for(int i=1;i<6;i++){
		// for (int j=1;j<6;j++){
			// System.out.print(i);
		// }
		// System.out.println();
		// }
		
		//Square 12345
		// int n=5;
		// for(int i=1;i<6;i++){
		// for (int j=1;j<6;j++){
			// System.out.print(j);
		// }
		// System.out.println();
		// }
		
		
		//25 numbers Square
		// int n=5;
		// for(int i=1;i<((n*n)+1);i++){
		// System.out.print(" "+i);
			// if (i%5==0){
				// System.out.println();
			// }
		
		// }
		
			//9 Loop Square
			// int n=5;
			// int count=0;
			// for (int i=0;i<5;i++){
				// for (int j=0;j<5;j++){
					// count++;
					// System.out.print(" "+count);
					// if (count==9){
						// count=0;
					// }
				// }
				// System.out.println();
				
			// }
			
			// Binary Square
			// int n=5;
			// int count=0;
			// for (int i=0;i<5;i++){
				// for (int j=1;j<6;j++){
					// if(j%2==0){
						// count=0;
						// System.out.print(" "+count);
					// }
					// else{
						// count=1;
						// System.out.print(" "+count);
					// }
				// }
				// System.out.println();
				
			// }
			
			//Odd Pattern
			// int n=5;
			// int count=0;
			// int a=0;
			// for (int i=1;i<6;i++){
				// for (int j=0;j<5;j++){
						// count++;
						// a=(2*count)-1;
						// System.out.print(" "+a);
					

					
				// }
				// System.out.println();
				
			// }


			
			//Pyramid
			// int n=5;
			// for (int i=0;i<5;i++){
				// for (int j=0;j<5;j++){
					// if (j<n-i){	
					// System.out.print(" ");
					// }
					// else{
					// System.out.print(" *");
					// }
				
				// }
				// System.out.println();
			// }
			
			//2 Multiple Pyramid
			// int n=5;
			// for (int i=1;i<6;i++){
				// for (int j=1;j<=n-i;j++){	
					// System.out.print(" ");
					// }
				// for(int k=1;k<=(i);k++){
					// System.out.print(" "+k*2);
					// }
				
				// System.out.println();
			// }
			
	
			// Right angle India
			// String n="INDIA";
			// for (int i=0;i<6;i++){
				// for (int j=0;j<i;j++){
					// System.out.print(n.charAt(j));
					// }
				// System.out.println();
			// }
			
			// int n=5;
			// for(int i=1;i<n+1;i++){
				// for (int j=1;j<n+1-i;j++){
						// System.out.print(" ");
					// }
				// for(int k=1;k<=(2*i-1);k++){
						// System.out.print("*");
					// }
				
				// System.out.println();
						
			// }		
			
			//Diamond
			// int n=5;
			// for(int i=1;i<n+1;i++){
				// for (int j=1;j<n+1-i;j++){
						// System.out.print(" ");
					// }
				// for(int k=1;k<=(2*i-1);k++){
						// System.out.print("*");
					// }
				
				// System.out.println();
						
			// }
			
			// for(int i=1;i<n;i++){
				// for (int j=1;j<i+1;j++){
						// System.out.print(" ");
					// }
				// for(int k=1;k<(2*n-2*i);k++){
						// System.out.print("*");
					// }
				
				// System.out.println();
						
			// }
			
			// X Pattern
			// int n=5;
			// for(int i=0;i<5;i++){
				// for(int j=0;j<5;j++){
					// if (i==j|| j==n-1-i){
						// System.out.print("*");
					// }
					// else{
						// System.out.print(" ");
					// }
				// }
				// System.out.println();
			// }
			
			// Plus Pattern
			// int n=7;
			// for(int i=0;i<7;i++){
				// for(int j=0;j<7;j++){
					// if ((i==((n/2))) || (j==((n/2)))){
						// System.out.print("*");
					// }
					// else{
						// System.out.print(" ");
					// }
				// }
				// System.out.println();
			// }
			
			
			int n=7;
			for(int i=0;i<7;i++){
				for(int j=0;j<7;j++){
					if ((i==((n/2))) || (j==((n/2))) i==0 || i==4 || j==0 || j==4 ){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
	

