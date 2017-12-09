import java.util.*;

/**
 * Created by Egor on 25.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner mainsc = new Scanner(System.in);
        System.out.println("Chose task:1 or 2 ");
        int numtask = mainsc.nextInt();
        MyTasks t = new MyTasks();
        if (numtask == 1) {
            t.task1();
        } else if (numtask == 2) {
            t.task2();
        }

    }

}


