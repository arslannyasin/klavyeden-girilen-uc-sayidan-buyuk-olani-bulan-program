package Scanner;

import java.util.Scanner;

public class Hangisibüyük {
   private static Scanner input;

public static void main(String [] args)
   {
	   System.out.println("Lütfen ilk sayýyý giriniz:");
	   input = new Scanner(System.in);
	   int x=input.nextInt();
	   System.out.println("Lütfen ikinci sayýyý giriniz:");
	   int y=input.nextInt();
	   System.out.println("Lütfen üçüncü sayýyý giriniz:");
	   int z=input.nextInt();
	   if(x>y&&x>z)
	   {
		   System.out.println("en büyük sayi x'tir = "+x);	   
	   }
	   else if(y>x&&y>z)
	   {
		   System.out.println("en büyük sayi y'dir = "+y);	   
	   }
	   else if(z>x&&z>y)
	   {
		   System.out.println("en büyük sayi z'dir = "+z);	   
	   }
	   else if(x==y&&x==z)
	   {
		   System.out.println("Bütün Sayýlar Eþittir = "+y);	   
	   }
	   else 
	   {
		   System.out.println(" Geçersiz bir sayý girdiniz");	   
	   }
   }
   
}
