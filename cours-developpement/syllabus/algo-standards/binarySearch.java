public static int binarySearch(int[] myArray, int value){
	int leftIndex = 0;
	int medianIndex = -1;
	int rightIndex = myArray.length - 1;
	int candidate;
	boolean isFound = false;

	while (!isFound && leftIndex <= rightIndex){
		medianIndex = (leftIndex + rightIndex) / 2;
		candidate = myArray[medianIndex];
		if (candidate == value){
			isFound = true;
		} else if (value < candidate){
			rightIndex = medianIndex - 1;
		} else {
			leftIndex = medianIndex + 1;
		}
	}

	if (isFound){
		return medianIndex;
	} else {
		return -1;
	}
}

