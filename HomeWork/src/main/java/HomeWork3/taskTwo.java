package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;

import static MyPack.RandomArray.createArrayList;




public class taskTwo {


    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList = createArrayList(5);
        System.out.println("Коллекция " + arrayList);
        
        findMinAndMaxAndAverage(arrayList);

        int median = FindMedian(arrayList);
        
        System.out.println("Медиана: " + median);
    
    
    }


    public static void findMinAndMaxAndAverage(ArrayList<Integer> arrayList) {
        
        int max = arrayList.get(0);
        int min = arrayList.get(0);
        int average = 0;

        for (Integer i: arrayList) {
            
            if (i < min) {
                min = i;
            }

            if (i>max) {
                max = i;
            }      
            
            average += i;
        
        }
        
        average /= arrayList.size();

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее значение: " + average);
    }


    public static int FindMedian(ArrayList<Integer> arrayList) {

        Collections.sort(arrayList);
        int n = arrayList.size()/2;
        

        if (arrayList.size() % 2 == 0){
            
            return (arrayList.get(n) + arrayList.get(n-1))/2;
        }

        return arrayList.get(n);
    }


}
