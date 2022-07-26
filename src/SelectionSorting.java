public class SelectionSorting extends Sorting{

    public SelectionSorting() {
        super((SortStrategy) new SelectionSortStrategy());
    }
}
