/**
 * Created by Egor on 09.12.2017.
 */
import ArrayClasses.CombSort;
import ArrayClasses.ShellSort;
import org.junit.Test;
import static org.junit.Assert.*;


public class ShellTest {
    ShellSort ShellClass = new ShellSort();
    @Test
    public void heapSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        ShellClass.sort(testArray);
        assertArrayEquals(sortedArray,testArray );
    }
}
