package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class UndergroundSystem {
    Map<Integer, Pair> checkedIn = new HashMap<>();
    Map<String, List<Integer>> tripTimes = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        if (!checkedIn.containsKey(id)) {
            checkedIn.put(id, new Pair(stationName, t));
        }
    }

    public void checkOut(int id, String stationName, int t) {
        Pair pairFrom = checkedIn.get(id);
        int startTime = pairFrom.time;
        String stationFrom = pairFrom.stationName;

        checkedIn.remove(id);
        String tripName = stationFrom + " to " + stationName;
        if (!tripTimes.containsKey(tripName)) {
            List<Integer> listOfTimes = new ArrayList<>();
            listOfTimes.add(t - startTime);
            tripTimes.put(tripName, listOfTimes);
        } else {
            tripTimes.get(tripName).add(t - startTime);
        }

    }

    public double getAverageTime(String startStation, String endStation) {
        String tripName = startStation + " to " + endStation;
        List<Integer> listOfTripsTimes = tripTimes.get(tripName);
        double sumOfTimes = 0;
        for (int x : listOfTripsTimes) {
            sumOfTimes += x;
        }
        return sumOfTimes / listOfTripsTimes.size();
    }
}

class Pair {
    String stationName;
    int time;

    public Pair(String stationName, int time) {
        this.stationName = stationName;
        this.time = time;
    }
}
