public interface SortStrategy {



    public  static void sortB(int[] newArr) {
        System.out.println("BubbleSortStrategy");
        int[] bubbleArr = newArr;
        for (int i = 0; i < bubbleArr.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < bubbleArr.length; j++) {
                if (bubbleArr[j] < bubbleArr[min]) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            int swap = bubbleArr[i];
            bubbleArr[i] = bubbleArr[min];
            bubbleArr[min] = swap;
        }
    }

}


