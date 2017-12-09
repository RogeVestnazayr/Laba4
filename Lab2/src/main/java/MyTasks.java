import java.util.*;

/**
 * Created by Egor on 09.12.2017.
 */
public class MyTasks {
    public void task1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int ArrLen = in.nextInt();
        System.out.println("Your input is: " + ArrLen);
        int array [] = new int[ArrLen];
        for (int i = 0; i < ArrLen; i++){
            array[i] = in.nextInt();
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("midel is "+ midel(array));
        System.out.println("SumSecondAndPositive"+ SumSecondAndPositive(array));
        System.out.println("Min="+minofarr(array));
        MostnegXsmallpair(array);
        System.out.println("Summ of pair elements "+ summnechetpair(array));
        System.out.println("Sum Second And Most Positive "+ SumSecondAndPositive(array));
    }
    public double midel(int [] array)
    {
        double midel=0;
        int schetchik=0;
        for (int i=0; i<array.length;i++){
            if(array[i]%2==0){
                midel+=array[i];
                schetchik++;
            }
        }
        midel=midel/schetchik;
        return midel;
    }
    public int minofarr(int [] array){
        int min=array[0];
        int schetchik=0;
        for (int i=0; i<array.length;i++){
            if(min>array[i]){
                min=array[i];
                schetchik=i;
            }
        }
        return min;

    }
    public  void MostnegXsmallpair(int [] array){

        int minpaired=array[0];
        int min=array[0];
        int schetchik=0;
        for (int i=0; i<array.length;i++){
            if(array[i]%2==0)
                if(minpaired%2!=0){
                    minpaired=array[i];
                }
                else if(minpaired>array[i]){
                    minpaired=array[i];
                    schetchik=i;
                }

            if(min>array[i]){
                min=array[i];
                schetchik=i;
            }
        }
        if(minpaired%2!=0){
            System.out.println("Min paired didnt find");
        }
        else if(min>0){
            System.out.println("Array havent negative elemts");
        }
        else {
            System.out.println("Product most negative and min paired="+ min*minpaired);
        }

    }
    public  int fiveelement(int [] array){
        int num=array[0];
        int kolvo=1;
        int schetchik=0;
        Arrays.sort(array);
        for (int i =1;i<array.length;i++){
            if(array[i]==num){
                kolvo++;
                if(kolvo==5){
                    if(i<array.length-1){
                        if(array[i+1]!=num){
                            schetchik++;
                        }
                    }
                }
            }
            else{
                num=array[i];
                kolvo=1;
            }
        }

        return schetchik;

    }
    public  int summnechetpair(int[] array){
        int sum=0;
        for (int i=1; i<array.length;i++){
            if(array[i]%2==0){
                sum += array[i];
            }
            i++;
        }
        return sum;
    }
    public  int SumSecondAndPositive(int [] array){
        int mostpositive=0;
        for (int i=0; i<array.length;i++){
            if(array[i]>mostpositive){
                mostpositive=array[i];
            }
        }
        int sum=array[1]+mostpositive;
        return sum;
    }

    //task2
    public void task2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = in.nextInt();
        System.out.println("Enter n: ");
        int n = in.nextInt();
        Random rand = new Random();
        int matrix [][]=new int [m][n];
        for (int i = 0;i<m;i++) {
            for (int j=0;j<n;j++){
                matrix[i][j]=2+rand.nextInt(1);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        List evenlist= even(matrix);
        System.out.println("Even list:");
        for(int i=0;i<evenlist.size();i++) {
            System.out.println(evenlist.get(i));
        }
        List  poslidov=  poslidovnist(matrix);
        System.out.println(" poslidovnist list:");
        for(int i=0;i< poslidov.size();i++) {
            System.out.println( poslidov.get(i));
        }

        List  ls_summandmax=  summandmax(matrix);

        for(int i=0;i< ls_summandmax.size();i++) {
            System.out.println(ls_summandmax.get(i));
        }
    }
    public  List even(int matrix[][]){
        List numbers = new ArrayList();
        for (int i = 0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++){
                if( matrix[i][j]%2==0){
                    if(j+1==matrix[0].length){
                        numbers.add(i+1);
                    }
                }
                else{j=matrix[0].length;}
            }
        }
        return numbers;
    }
    public  List poslidovnist(int matrix [][]){
        List numbers = new ArrayList();
        int temp=0;
        int znak=1;
        for (int i = 0;i<matrix.length;i++) {
            temp= matrix[i][0];
            if(temp>matrix[i][1]){
                znak=1;
            }
            else if (temp<matrix[i][1]){
                znak=-1;
            }
            for (int j=1;j<matrix[0].length;j++){
                if(Math.pow(temp,znak)>Math.pow(matrix[i][j],znak)){
                    if(j+1==matrix[0].length){
                        numbers.add(i+1);
                    }

                }
                else{j=matrix[0].length;}
            }
        }
        return numbers;
    }
    public static List summandmax(int matrix [][]){
        List numbers = new ArrayList();
        int summ=0;
        int max=0;

        for (int i = 0;i<matrix.length;i++) {
            if( matrix[i][i]<0) {
                summ = matrix[i][0];
                max=matrix[i][0];
                for (int j = 1; j < matrix[0].length; j++) {
                    summ+=matrix[i][j];
                    if(max<matrix[i][j]){
                        max=matrix[i][j];
                    }
                }

                String str = "В рядку № "+i+" сумма дорівнює "+summ+" максимальний елемент:"+max;
                numbers.add(str);
            }
        }
        return numbers;
    }
}
