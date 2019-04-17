import java.util.Scanner;

public class Converter {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int input;

		do {
			System.out.println("Odaberite!\n");
			System.out.println("1---->Pretvori kilograme u funte");
			System.out.println("2---->Pretvori funte u kilograme");
			System.out.println("3---->Pretvori centimetre u ince");
			System.out.println("4---->Pretvori ince u centimetre");
			System.out.println("5---->Pretvori celzijuse u farenhajte");
			System.out.println("6---->Pretvori farenhajte u celzijuse");
			System.out.println("7---->Izlaz");

			input = Converter.input.nextInt();
			
			if (input == 7) {
				break;
				
			} else if (input == 1) {
				ConverterMethods.kilograms2Pounds();
				
			} else if (input == 2) {
				ConverterMethods.pounds2Kilograms();
				
			}else if (input == 3) {
				ConverterMethods.centimeters2inches();
				
			}else if (input == 4) {
				ConverterMethods.inches2centimeters();
				
			}else if (input == 5) {
				ConverterMethods.Celsius2Fahrenheit();
				
			}else if (input == 6) {
				ConverterMethods.Fahrenheit2Celsius();
				
			}else {
				System.out.println("Pogresan broj! Birajte ponovo!");
				
			}
			
			System.out.println("___________________________________________");
		} while (true);

		Converter.input.close();

	}

}
