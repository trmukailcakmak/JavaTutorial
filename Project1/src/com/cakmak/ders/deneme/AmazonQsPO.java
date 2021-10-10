package com.cakmak.ders.deneme;

import java.util.List;
import java.util.ArrayList;

public class AmazonQsPO {
	


	

	
	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(0);
		arr.add(1);

		System.out.println("Min Mov : "+minMoves3(arr));

	}

	public static int minMoves2(List<Integer> arr) {
		int result = 0;
		for (int begin = 0, end = (arr.size() - 1); begin < arr.size() / 2; begin++, end--) {
			if (!arr.get(begin).equals(arr.get(end))) {
				result++;
			}
		}
		return result;
	}

	public static int minMoves3(List<Integer> arr) {
		int result = 0;
		int firstHalfNumberOfOne = 0;
		for (int i = 0; i < arr.size() / 2; i++) {
			if (arr.get(i).equals(1)) {
				++firstHalfNumberOfOne;
			}
		}
		int secondHalfNumberOfOne = 0;
		for (int i = arr.size() / 2 + 1; i < arr.size(); i++) {
			if (arr.get(i).equals(1)) {
				++secondHalfNumberOfOne;
			}
		}
		boolean incrementCondition = false;
		int index = arr.size()-1;
		int j = arr.size()-1;
		int last = 0;
		if(firstHalfNumberOfOne>secondHalfNumberOfOne) {
			incrementCondition = true;
			index = 0;
			last = arr.size()-1;
			j=0;
		}

		while (index< arr.size()) {
			int m = -1;
			int n = -1;
			while (j < (arr.size() - 1)) {

				if(arr.get(j).equals(0)){
					if(m==-1){
						m=j;
					}
				}
				if(m!=-1) {
					if (arr.get(last).equals(1)) {
						n = last;
					}


					if(incrementCondition){
						last--;
					}
					else {
						last++;
					}
				}

				if(m!=-1 && n!=-1){
					int tmp = arr.get(m);
					arr.set(m, arr.get(n));
					arr.set(n, tmp);
					result++;
					m=-1;
					n=-1;
					if(incrementCondition){
						last = arr.size()-1;
					}
					else {
						last = 0;
					}
				}
				if(incrementCondition){
					j++;
				}
				else {
					j--;
				}
			}

			if(incrementCondition){
				index++;
			}
			else {
				index--;
			}
		}
		return result;
	}


	/*public static int minMoves(List<Integer> arr) {

		int size = arr.size();
		int result = 0;

		if (size % 2 == 0) {
			int firstHalfNumberOfOne = 0;
			for (int i = 0; i < arr.size() / 2; i++) {
				if (arr.get(i).equals(1)) {
					++firstHalfNumberOfOne;
				}
			}
			int secondHalfNumberOfOne = 0;
			for (int i = arr.size() / 2 + 1; i < arr.size(); i++) {
				if (arr.get(i).equals(1)) {
					++secondHalfNumberOfOne;
				}
			}

			if (firstHalfNumberOfOne > secondHalfNumberOfOne) {
				for (int i = 0, begin = 0, end = arr.size() - 1; i < arr.size() / 2; i++, begin++, end--) {
					if (!arr.get(begin).equals(arr.get(end))) {
						result++;
					}
				}
			} else {
				for (int i = arr.size() / 2, begin = 0, end = arr.size() - 1; i < arr.size() / 2; i++, begin++, end--) {
					if (!arr.get(begin).equals(arr.get(end))) {
						result++;
					}
				}
			}
		}

		if (size % 2 == 1) {
			int firstHalfNumberOfOne = 0;
			for (int i = 0; i < arr.size() / 2; i++) {
				if (arr.get(i).equals(1)) {
					++firstHalfNumberOfOne;
				}
			}
			int secondHalfNumberOfOne = 0;
			for (int i = arr.size() / 2 + 2; i < arr.size(); i++) {
				if (arr.get(i).equals(1)) {
					++secondHalfNumberOfOne;
				}
			}
			if (firstHalfNumberOfOne > secondHalfNumberOfOne) {
				for (int i = 0, begin = 0, end = arr.size() - 1; i < arr.size() / 2; i++, begin++, end--) {
					if (!arr.get(begin).equals(arr.get(end))) {
						result++;
					}
				}
				return result;
			} else {
				for (int i = arr.size() / 2, begin = 0, end = arr.size() - 1; i < arr.size() / 2; i++, begin++, end--) {
					if (!arr.get(begin).equals(arr.get(end))) {
						result++;
					}
				}
			}

		}
		return result;
	}*/

	public static int minMoves(List<Integer> arr) {

		int size = arr.size();
		int result = 0;

		if (size % 2 == 0) {
			int firstHalfNumberOfOne = 0;
			for (int i = 0; i < arr.size() / 2; i++) {
				if (arr.get(i).equals(1)) {
					++firstHalfNumberOfOne;
				}
			}
			int secondHalfNumberOfOne = 0;
			for (int i = arr.size() / 2 + 1; i < arr.size(); i++) {
				if (arr.get(i).equals(1)) {
					++secondHalfNumberOfOne;
				}
			}

			if (firstHalfNumberOfOne > secondHalfNumberOfOne ){
				result = (arr.size()/2)-firstHalfNumberOfOne;
			} else {
				result = (arr.size()/2)-secondHalfNumberOfOne;
			}
		}

		if (size % 2 == 1) {
			int firstHalfNumberOfOne = 0;
			for (int i = 0; i < arr.size() / 2; i++) {
				if (arr.get(i).equals(1)) {
					++firstHalfNumberOfOne;
				}
			}
			int secondHalfNumberOfOne = 0;
			for (int i = arr.size() / 2 + 2; i < arr.size(); i++) {
				if (arr.get(i).equals(1)) {
					++secondHalfNumberOfOne;
				}
			}
			if (firstHalfNumberOfOne > secondHalfNumberOfOne ){
				result = (arr.size()/2)-firstHalfNumberOfOne;
			} else { //move zero
				result = (arr.size()/2)-secondHalfNumberOfOne;
			}

		}
		return result;
	}
}