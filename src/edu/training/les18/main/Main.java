package edu.training.les18.main;

import edu.training.les18.train.*;
import edu.training.les18.trains.*;
import edu.training.les18.sort.Sort;
import edu.training.les18.view.View;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Trains trains = new Trains();

		trains.addTrain(new Train("Minsk", 1, "10:00"));
		trains.addTrain(new Train("Brest", 2, "12:30"));
		trains.addTrain(new Train("Vitebsk", 3, "15:00"));
		trains.addTrain(new Train("Grodno", 5, "18:45"));
		trains.addTrain(new Train("Gomel", 20, "23:50"));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the train number: ");
		int trainNumber = scanner.nextInt();
		View.printTrainInfo(trains, trainNumber);

		View.printAllTrains(trains);
		Sort.sortByNumber(trains);
		View.printAllTrains(trains);
		Sort.sortByDestinationAndTime(trains);
		View.printAllTrains(trains);
	}
}