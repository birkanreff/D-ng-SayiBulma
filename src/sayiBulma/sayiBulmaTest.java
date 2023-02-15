package sayiBulma;

import java.util.Scanner;

public class sayiBulmaTest {

	public static void main(String[] args) {
		int number;
		
		int toplam = 0;
		 Scanner input = new Scanner(System.in);
		 
		do {
			System.out.print("Bir sayı giriniz:  ");
			 number = input.nextInt();
			
			if((number %4 == 0) && (number %2 == 0) ) {
				toplam += number;
				
			}
			
			
			
			
		} while (number %2 == 0) ;
		
			System.out.print("Girilen sayılardan çift ve 4'ün katı olan sayıların toplamı:  " + toplam);
			
			
		}

	}


