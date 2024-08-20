package edu.training.les18.view;

import edu.training.les18.train.Train;
import edu.training.les18.trains.Trains;

public class View {

	public static void printTrainInfo(Trains trains, int trainNumber) {
		boolean found = false;
		for (Train train : trains.getTrains()) {
			if (train.getTrainNumber() == trainNumber) {
				System.out.println("Train info: " + train);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Train with number " + trainNumber + " not found.");
		}
	}

	public static void printAllTrains(Trains trains) {
		System.out.println("All trains:");
		for (Train train : trains.getTrains()) {
			System.out.println(train);
		}
	}
}