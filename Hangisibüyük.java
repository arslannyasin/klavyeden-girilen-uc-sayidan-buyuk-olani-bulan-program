package Scanner;

import java.util.Scanner;

public class Hangisib�y�k {
   private static Scanner input;

public static void main(String [] args)
   {
	   System.out.println("L�tfen ilk say�y� giriniz:");
	   input = new Scanner(System.in);
	   int x=input.nextInt();
	   System.out.println("L�tfen ikinci say�y� giriniz:");
	   int y=input.nextInt();
	   System.out.println("L�tfen ���nc� say�y� giriniz:");
	   int z=input.nextInt();
	   if(x>y&&x>z)
	   {
		   System.out.println("en b�y�k sayi x'tir = "+x);	   
	   }
	   else if(y>x&&y>z)
	   {
		   System.out.println("en b�y�k sayi y'dir = "+y);	   
	   }
	   else if(z>x&&z>y)
	   {
		   System.out.println("en b�y�k sayi z'dir = "+z);	   
	   }
	   else if(x==y&&x==z)
	   {
		   System.out.println("B�t�n Say�lar E�ittir = "+y);	   
	   }
	   else 
	   {
		   System.out.println(" Ge�ersiz bir say� girdiniz");	   
	   }
   }
   
}
