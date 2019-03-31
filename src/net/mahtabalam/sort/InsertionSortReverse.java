package net.mahtabalam.sort;

public class InsertionSortReverse {

	public static int[] insertionSort(int[] array) {
		int n = array.length;

		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		return array;
	}

	public static void main(String[] args) {
		int array[] = { 23, 154, 1, -7, 3, 0, 153, 10 };
		for (int item : insertionSort(array)) {
			System.out.print(item + " ");
		}
	}

}
