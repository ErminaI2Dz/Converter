
public class ConverterMethods {

	// This method converts kilograms to pounds
	public static void kilograms2Pounds() {

		double kilogram, pound;

		System.out.print("Unesite kilograme: ");
		kilogram = Converter.input.nextDouble();
		pound = kilogram * 2.205;
		String answerKilogram = (kilogram == 1) ? " kilogram" : " kilograma";

		System.out.println(kilogram + answerKilogram + " = " + pound + " funti.");
	}

	// This method converts pounds to kilograms
	public static void pounds2Kilograms() {

		double kilogram, pound;

		System.out.print("Unesite funte: ");
		pound = Converter.input.nextDouble();

		kilogram = pound / 2.205;
		String answerKilogram = (kilogram == 1) ? " kilogram" : " kilograma";

		System.out.println(pound + " funti = " + kilogram + answerKilogram);
	}

	// This method converts centimeters to inches
	public static void centimeters2inches() {

		double centimeter, inches;

		System.out.print("Unesite centimetre: ");
		centimeter = Converter.input.nextDouble();

		inches = centimeter / 2.54;

		String answerCentimeter = (centimeter == 1) ? " centimetar" : " centimetra";
		String answerInches = (inches == 1) ? " inc" : " inca";

		System.out.println(centimeter + answerCentimeter + " = " + inches + answerInches);
	}

	// This method convert inches to centimeters
	public static void inches2centimeters() {

		double inches, centimeter;

		System.out.print("Unesite ince: ");
		inches = Converter.input.nextDouble();

		centimeter = inches * 2.54;

		String answerCentimeter = (centimeter == 1) ? " centimetar" : " centimetra";
		String answerInches = (inches == 1) ? " inc" : " inca";

		System.out.println(+ inches + answerInches + " = " + centimeter + answerCentimeter);
	}

	// This method convert Celsius to Fahrenheit
	public static void Celsius2Fahrenheit() {

		double Celsius, Fahrenheit;

		System.out.print("Unesite celzijuse: ");
		Celsius = Converter.input.nextDouble();

		Fahrenheit = (Celsius * 9/5)+32;

		System.out.println(Celsius + " °C = " + Fahrenheit + " °F");
	}

	// This method convert Fahrenheit to Celsius
	public static void Fahrenheit2Celsius() {

		double Celsius, Fahrenheit;

		System.out.print("Unesite farenhajte: ");
		Fahrenheit = Converter.input.nextDouble();

		Celsius =(Fahrenheit-32) *5/9;

		System.out.println(Fahrenheit + " °F = " + Celsius + " °C");
	}
}
