/**
 * Created by Egor on 09.12.2017.
 */
import ArrayClasses.QuickSort;
import org.junit.Test;

import static org.junit.Assert.*;
public class QuickTest {



        QuickSort quickClass = new QuickSort();
        @Test
        public void quickSort() {
            int[] testArray = {3,6,1,3,2};
            int[] sortedArray = {1,2,3,3,6};
            int min = 0;
            int max = testArray.length-1;
            quickClass.sort(testArray);
            assertArrayEquals(sortedArray,testArray);
        }

}

