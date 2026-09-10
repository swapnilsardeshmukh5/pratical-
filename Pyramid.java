class PyramidDemo 
{
   public static void main(String[] args) 
   {
        int rows = 5;

      // Simple star pyramid
         
		System.out.println("Star Pyramid:");
         for (int i = 1; i <= rows; i++) 
         {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
         }

      	

// Inverted star pyramid
        
		System.out.println("\nInverted Star Pyramid:");
        
		for (int i = rows; i >= 1; i--)
		 {
            for (int j = 1; j <= i; j++) 
			{
                	   System.out.print("* ");
                 }
            System.out.println();
          }

          // Number pyramid
        
		System.out.println("\nNumber Pyramid:");
         for (int i = 1; i <= rows; i++)
		 {
             for (int j = 1; j <= i; j++) 
		    {
                  System.out.print(j + " ");
             }
             System.out.println();
          }
       }
   }
