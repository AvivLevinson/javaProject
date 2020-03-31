package system;

import java.util.Hashtable;
import java.util.Scanner;

//project class import

import vehicles.Bike;
import vehicles.Car;
import vehicles.Carriage;
import vehicles.Point;
import vehicles.Vehicle;

public class MySystem {

	public boolean drive(int id, Point point) {
		return false;
	}

	public static void printAll() {

	}



	public static void main(String args[]) {
		int sizeArray;
		Hashtable<Integer,Vehicle> vehicleArray;  
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter size vehicle array: ");
		sizeArray = scan.nextInt();

		//create  hash table   vehicleArray(id,vehicle_object)
		vehicleArray = new Hashtable<Integer, Vehicle>(sizeArray);

		for (int index = 0; index < sizeArray; index++) {
			String option;
			System.out.println("Choose the following options:\n"
					+ "1.Motorized vehicle  - enter the word 'Motorized'\n"
					+ "2.None Motorized Vehicle - enter the word 'None'\n");

			option = scan.nextLine();

			assert !(option=="Motorize" || option=="None"):"option: motorize or none motorize are not valid";

			switch (option) {
			case "Motorize":

				System.out.println("Build Car\n");
				vehicleArray.put(index, new Car());
				break;

			case "None":
				String noneMotorizeOption;
				System.out.println("Choose the following options:\n"
						+ "1.Bike' - enter the word Bike\n"
						+ "2.Carriage - enter the word Carriage\n");
				noneMotorizeOption = scan.nextLine();
				assert !(option=="Bike" || option=="Carriage"):"none motorize option not valid";


				if(noneMotorizeOption == "Bike") {

					vehicleArray.put(index, new Bike());

				} else if(noneMotorizeOption == "Carriage") {

					vehicleArray.put(index, new Carriage());
				}

				break;

			default:

				System.out.println("you enter worng option\n");
				break;
			}








		}






	}


}
