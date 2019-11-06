package net.mahtabalam.sort;

public class InsertionSort2 {

	public static int[] insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i < n ; i++){
		int item = arr[i];
		int j = i; 
			for(; j > 0; j--){
				// For Descending Sort arr[j-1] < item
				if(arr[j-1] > item){
					arr[j] = arr[j-1];
				} else{
					break;
				}
			}
		  arr[j] = item;
		}
        return arr;
	}

	public static void main(String[] args) {
		int array[] = { 45, 39, 20, 89, 1 };
		for (int item : insertionSort(array)) {
			System.out.print(item + " ");
		}
	}

}
