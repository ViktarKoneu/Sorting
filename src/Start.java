import java.util.Arrays;

public class Start {


    public static void main(String[] args) {
        int[] array;
        array = new int[]{16, 5, 30, 6, 7, 2, 11, 3, 6, 0, -9, -5, 17};
        int[] bubbleArr = array;
        int[] selectionArr = array;
        int numberStrategy = 1;/* null or one*/


        switch (numberStrategy) {
            case (0):
                BubbleSortStrategy.sortB(bubbleArr);
                System.out.println(Arrays.toString(bubbleArr));
                break;


            case (1):
                SelectionSortStrategy.sortC(selectionArr);
                System.out.println(Arrays.toString(selectionArr));
                break;
            default:
                System.out.println("Mission failure");;
                break;
        }


    }
}


