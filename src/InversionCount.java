public class InversionCount {
    int counter = 0;

    public int easyInversionCount(int[] inputArr) {
        int counter = 0;
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] > inputArr[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private void merge(int arr[], int first, int middle, int last) {
        int i;
        int k;
        int j;

        int firstHalf = middle - first + 1;
        int lasthalf = last - middle;

        int[] leftArray = new int[firstHalf];
        int[] rightArray = new int[lasthalf];

        for (i = 0; i < firstHalf; i++) {
            leftArray[i] = arr[first + i];
        }
        for (j = 0; j < lasthalf; j++) {
            rightArray[j] = arr[middle + j + 1];
        }
        i = 0;
        j = 0;
        k = first;

        while (i < firstHalf && j < lasthalf) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
                counter += firstHalf - i;
            }
            k++;
        }
        while (i < firstHalf) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < lasthalf) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    private void mergeSort(int[] arr, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(arr, first, middle);
            mergeSort(arr, middle + 1, last);
            merge(arr, first, middle, last);

        }

    }

    public int fastInversionCount(int[] inputArr) {
        mergeSort(inputArr, 0, inputArr.length - 1);
        return counter;
    }

}
