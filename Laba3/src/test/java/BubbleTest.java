/**
 * Created by Egor on 09.12.2017.
 */
import ArrayClasses.BubbleSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleTest {

        BubbleSort bubble = new BubbleSort();
        @Test
        public void bubbleSort() {
            int[] testArray = {3,6,1,3,2};
            int[] sortedArray = {1,2,3,3,6};
            bubble.sort(testArray);
           assertArrayEquals(sortedArray,testArray );
        }
}
