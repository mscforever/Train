package edu.training.les18.sort;

import edu.training.les18.train.Train;
import edu.training.les18.trains.Trains;
import java.util.Comparator;

public class Sort {

	public static void sortByNumber(Trains trains) {
		trains.getTrains().sort(Comparator.comparingInt(Train::getTrainNumber));
	}

	public static void sortByDestinationAndTime(Trains trains) {
		trains.getTrains().sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
	}
}