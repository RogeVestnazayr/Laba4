/**
 * Created by Egor on 09.12.2017.
 */
    import ArrayClasses.HeapSort;
    import org.junit.Test;

import static org.junit.Assert.*;

    public class HeapTest {
        HeapSort heapClass = new HeapSort();
        @Test
        public void heapSort() {
            int[] testArray = {3,6,1,3,2};
            int[] sortedArray = {1,2,3,3,6};
            heapClass.sort(testArray);
            assertArrayEquals(sortedArray,testArray );
        }

    }

