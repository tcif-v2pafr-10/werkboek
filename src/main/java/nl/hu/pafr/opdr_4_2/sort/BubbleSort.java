package nl.hu.pafr.opdr_4_2.sort;

import java.util.Arrays;

public class BubbleSort implements Sort {
	public void sort(double[] list) {
		System.out.println("BubbleSort");
		// Bubblesort algorithm here
		// for now only quicksort implemented
		Arrays.sort(list);
	}
}
