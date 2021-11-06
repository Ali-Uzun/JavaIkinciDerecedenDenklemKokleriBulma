package JavaÖdev;

import java.util.Scanner;

public class ÝkinciDerecedenDenklemKökleriBulma {

	public static void main(String[] args) {
		// Ýkinci dereceden denklem kökleri delta=b2-4ac
       Scanner giris = new Scanner(System.in);
	System.out.println("(ax^2+bx+c)Ýkinci dereceden bir denklemdir. \n Denklemin deðerini sýrayla giriniz.");
	 
    System.out.println("a deðerini giriniz:");
    int a=giris.nextInt();
    
    System.out.println("b deðerini giriniz:");
    int b=giris.nextInt();
    
    System.out.println("c deðerini giriniz:");
	int c=giris.nextInt();
	
	
	double delta =(b * b)-(4 * a * c);
	
   if (delta < 0);
   System.out.println("Denklemin reel kökü yoktur.");
   
   
   if (delta > 0);
                    double Kök1=((-1*b)- Math.sqrt(delta))/(2 * a);
                    double Kök2=((-1*b)+ Math.sqrt(delta))/(2 * a);
       System.out.println("Kök1="+ Kök1 + "\n Kök2="+ Kök2);
       
       
   if  (delta == 0);
                     double x= (-1 * b)/(2 * a);
       System.out.println("Çakýþýk kökü vardýr; Kök1=Kök2" + x);
       
    
       
   
	 
	
	
	}

}
