void swapMinMax(int[] array){
	int minIndex = 0;
	for (int i = 1; i < array.length; i++) {
		if (array[i] < array[minIndex]) {
			minIndex = i;
		}
	}
	
	int maxIndex = 0;
	for (int i= 1; i < array.length; i++) {
		if (array[i] > array[maxIndex]) {
			maxIndex = i;
		}
	}
	
	int temp = array[minIndex];
	array[minIndex] = array[maxIndex];
	array[maxIndex] = temp;	
}