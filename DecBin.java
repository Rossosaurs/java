class DecBin{
	public static void main (String a[]){
	
	int n;
	String bin; String hex;
	System.out.println("DEC BIN HEX");
	
	
	
	
	
	for (n = 0; n <= 50; n++){
			
			bin = Integer.toBinaryString(n);
			hex = Integer.toHexString(n);
			if(bin.length() == 1)bin = "0000000"+bin;
		 
		  System.out.println(n+" "+hex+" "+bin);
			
			}
		}
	
	}
	
	
	
	
/*
  System.out.println(n+" "+decimal+" "+hex+" "+bin);
   System.out.print(n);
			System.out.print(" ");
			System.out.print(bin);
			System.out.print(" ");
			System.out.print(hex);
			System.out.println();
  */	
