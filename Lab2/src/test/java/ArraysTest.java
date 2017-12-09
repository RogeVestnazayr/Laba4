import org.junit.*;
public class ArraysTest {

    MyTasks task;

    int[] array1, array2;
    int[][] matrix1, matrix2;

    @Before
    public void init() {
        task = new MyTasks();
        array1 = new int[]{10, 15, 20, 25, 30, 35, 40};
        array2 = new int[]{15, 25, 25, 1, 2, 3, 4, 5, 5, 5};
        matrix1 = new int[][]{
                {1, 2, -3},
                {2, -1, 2},
                {3, 5, 0}
        };
        matrix2 = new int[][]{
                {1, 2, -3},
                {2, 2, 2},
                {0, 0, 0}
        };
    }

    @After
    public void tearDown() {
        task = null;
    }
    @Test
    public void midelTest(){
        double res = task.midel(array1);
        Assert.assertTrue(25==res);
        res = task.midel(array2);
        Assert.assertTrue(10==res);
    }
    @Test
    public void minofarrTest(){
        int res = task.minofarr(array1);
        Assert.assertTrue(10==res);
        res = task.minofarr(array2);
        Assert.assertTrue(1==res);
    }
}