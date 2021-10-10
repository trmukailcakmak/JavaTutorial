package com.cakmak.ders.deneme;
//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

//CLASS BEGINS, THIS CLASS IS REQUIRED
public class AmazonQs {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static List<List<Integer>> nearestXsteakHouses(int totalSteakhouses,
														 List<List<Integer>> allLocations,
														 int numSteakhouses) {
		// WRITE YOUR CODE HERE
		Map<Double, List<Integer>> distances = new TreeMap<>();

		for (List<Integer> item : allLocations) {
			Double distance = Math.sqrt(Math.pow(item.get(0), 2) + Math.pow(item.get(1), 2));
			distances.put(distance, item);
		}

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		int i = 0;

		for (Double dist : distances.keySet()) {
			if (i < numSteakhouses) {
				result.add(distances.get(dist));
			}
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		List<List<Integer>> allLocs=new ArrayList<>();
		List<List<Integer>> allLocs1=new ArrayList<>();
		List<Integer> loc = new ArrayList<>();
		List<Integer> loc1 = new ArrayList<>();
		List<Integer> loc2 = new ArrayList<>();
		
		loc.add(1);
		loc.add(-3);
		allLocs.add(loc);
		//loc.clear();
		loc1.add(1);
		loc1.add(2);
		allLocs.add(loc1);
		//loc.clear();
		loc2.add(3);
		loc2.add(-4);
		allLocs.add(loc2);
		allLocs1=nearestXsteakHouses(3,allLocs, 2);
		System.out.println(allLocs1.get(0).get(0)+" - "+allLocs1.get(0).get(1));
		System.out.println(allLocs1.get(1).get(0)+" - "+allLocs1.get(1).get(1));
	}
}