import ArrayClasses.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int[] array = new int[150];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt() % 10 + 1;
       /* for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");*/

        //Shell sort initialization
        Metrics metr = new Metrics();
        for (int i = 0; i < 3; i++) {
            int shellarray[] = array.clone();
            System.out.println();
            metr.metricsStart();
            ShellSort sh = new ShellSort();
            sh.sort(shellarray);
            metr.metricsEnd();
          /*  for (int j = 0; j < array.length; j++) {
                System.out.print(shellarray[j] + " ");
            }
            System.out.println();*/
            System.out.println("Shell sort time: " + metr.getTime() + "memory: " + metr.getMemory());
        }
        //Quick sort initialization
        for (int i = 0; i < 3; i++) {
            int quickarray[] = array.clone();
            metr.metricsStart();
            new QuickSort().sort(quickarray);
            metr.metricsEnd();
             /*  for (int j = 0; j < array.length;j++)
                    System.out.print(quickarray[j]+" ");
            System.out.println();*/
            System.out.println("Quick sort time: " + metr.getTime() + "memory: " + metr.getMemory());
        }
        // Heap sort initialization
        for (int i = 0; i < 3; i++) {
            int heaparray[] = array.clone();
            metr.metricsStart();
            new HeapSort().sort(heaparray);
            metr.metricsEnd();
            /*   for (int j = 0; j < array.length;j++)
                   System.out.print(heaparray[j]+" ");
            System.out.println();*/
            System.out.println("Heap sort time: " + metr.getTime() + "memory: " + metr.getMemory());
        }
        //bubble sort initialization
        for (int i = 0; i < 3; i++) {
            int bubblearray[] = array.clone();
            metr.metricsStart();
            new BubbleSort().sort(bubblearray);
            metr.metricsEnd();
            /*    for (int j = 0; j < array.length;j++)
                   System.out.print(bubblearray[j]+" ");
            System.out.println();*/
            System.out.println("Bubble sort time: " + metr.getTime() + "memory: " + metr.getMemory());
        }
        //comb sort initialization
        for (int i = 0; i < 3; i++) {
            int combarray[] = array.clone();

            metr.metricsStart();
            new CombSort().sort(combarray);
            metr.metricsEnd();
            /*    for (int j = 0; j < array.length;j++)
                    System.out.print(combarray[j]+" ");
            System.out.println();*/
            System.out.println("Comb sort time: " + metr.getTime() + "memory: " + metr.getMemory());
        }
        //java sort initializaion
        for (int i = 0; i < 3; i++) {
            int javaarray[] = array.clone();

            metr.metricsStart();
            Arrays.sort(javaarray);
            metr.metricsEnd();
            /*    for (int j = 0; j < array.length;j++)
                    System.out.print(combarray[j]+" ");
            System.out.println();*/
            System.out.println("Java sort time: " + metr.getTime() + "memory: " + metr.getMemory());
        }

    }
}
class Metrics {
    private long timeStart;
    private long memoryStart;
    private long timeEnd;
    private long memoryEnd;

    void metricsStart() {
        timeStart = System.currentTimeMillis();
        // memoryStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryStart = Runtime.getRuntime().totalMemory();

    }

    void metricsEnd() {
        timeEnd = System.currentTimeMillis();
        //  memoryEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryEnd = Runtime.getRuntime().freeMemory();
    }

    double getTime() {
        return timeEnd - timeStart;
    }

    double getMemory() {
        return memoryEnd - memoryStart;
    }

}