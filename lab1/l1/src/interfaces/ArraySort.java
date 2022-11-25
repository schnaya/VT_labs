package interfaces;

public class ArraySort {
	
	public static void sort(int[] arr) {

        int h = 1;
        while (h*3 < arr.length)
            h = h*3 + 1;

        while(h >= 1) {
            hSort(arr, h);
            h = h/3;
        }  
    }
	public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }
}
