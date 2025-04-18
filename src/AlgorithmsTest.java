import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {
// bubble test
    @Test
    public void testBubbleSort() {
        Integer[] array = {5, 1, 4, 2, 8};
        Integer[] expected = {1, 2, 4, 5, 8};
        Algorithms.bubbleSort(array);
        assertArrayEquals(expected, array);
    }
// merge test
    @Test
    public void testMergeSort() {
        Integer[] array = {12, 11, 13, 5, 6, 7};
        Integer[] expected = {5, 6, 7, 11, 12, 13};
        Algorithms.mergeSort(array);
        assertArrayEquals(expected, array);
    }
//insertion
    @Test
    public void testInsertionSort() {
        Integer[] array = {9, 7, 5, 3, 1};
        Integer[] expected = {1, 3, 5, 7, 9};
        Algorithms.insertionSort(array);
        assertArrayEquals(expected, array);
    }
// edge case, empty
    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        Integer[] expected = {};
        Algorithms.bubbleSort(array);
        assertArrayEquals(expected, array);

        Algorithms.mergeSort(array);
        assertArrayEquals(expected, array);

        Algorithms.insertionSort(array);
        assertArrayEquals(expected, array);
    }

   //edge case, single element
    @Test
    public void testSingleElementArray() {
        Integer[] array = {42};
        Integer[] expected = {42};
        Algorithms.bubbleSort(array);
        assertArrayEquals(expected, array);

        Algorithms.mergeSort(array);
        assertArrayEquals(expected, array);

        Algorithms.insertionSort(array);
        assertArrayEquals(expected, array);
    }
}
