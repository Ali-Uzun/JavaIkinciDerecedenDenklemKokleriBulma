package Java�dev;

import java.util.Scanner;

public class �kinciDerecedenDenklemK�kleriBulma {

	public static void main(String[] args) {
		// �kinci dereceden denklem k�kleri delta=b2-4ac
       Scanner giris = new Scanner(System.in);
	System.out.println("(ax^2+bx+c)�kinci dereceden bir denklemdir. \n Denklemin de�erini s�rayla giriniz.");
	 
    System.out.println("a de�erini giriniz:");
    int a=giris.nextInt();
    
    System.out.println("b de�erini giriniz:");
    int b=giris.nextInt();
    
    System.out.println("c de�erini giriniz:");
	int c=giris.nextInt();
	
	
	double delta =(b * b)-(4 * a * c);
	
   if (delta < 0);
   System.out.println("Denklemin reel k�k� yoktur.");
   
   
   if (delta > 0);
                    double K�k1=((-1*b)- Math.sqrt(delta))/(2 * a);
                    double K�k2=((-1*b)+ Math.sqrt(delta))/(2 * a);
       System.out.println("K�k1="+ K�k1 + "\n K�k2="+ K�k2);
       
       
   if  (delta == 0);
                     double x= (-1 * b)/(2 * a);
       System.out.println("�ak���k k�k� vard�r; K�k1=K�k2" + x);
       
    
       
   
	 
	
	
	}

}
