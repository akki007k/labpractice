 class example {
	public static void main(String args[])
	{
		int  number = 9;
	    int space = number;
	    for (int i = 1; i <= number; i++) {

	        for(int s = 1; s <= space; s++) {
	            System.out.print(" ");
	        }
	        space--;
	        for (int j = 0; j < i; j++) {
	            System.out.print(j);
	        }
	        for (int p = i - 2 ; p >= 0; p--) {
	            System.out.print(p);
	        }
	        System.out.print("\n");
	    }
	  
	}

}