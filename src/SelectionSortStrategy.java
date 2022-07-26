public class SelectionSortStrategy implements SortStrategy2 {



   /* @Override*/
    public static void sortC(int[] newArr) {
        System.out.println("SelectionSortStrategy");
        int[] selectionArr = newArr;
       /* for (int i = 0; i < selectionArr.length; i++) {    // i - номер текущей итерации
            int position = i;
            int min = selectionArr[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < selectionArr.length; j++) {
                if (selectionArr[j] < min) {
                    position = j;    // position - индекс наименьшего элемента
                    min = selectionArr[j];
                }
            }
            selectionArr[position] = selectionArr[i];
            selectionArr[i] = min;    // меняем местами наименьший с array[i]
        }*/
    }


}