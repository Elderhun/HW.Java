package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        
        newArrayList = createArrayList();
        newArrayList = deleteEvenNumbers(newArrayList);
        System.out.printf("\nЛист без четных чисел \n%s", newArrayList);

    }

    public static ArrayList<Integer> createArrayList() {

        
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Введите размер массива");
        int length = scn.nextInt();
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < length; i++ ) {
            arrayList.add(rnd.nextInt(1,10));
        }
        System.out.printf("Изначальный лист \n%s", arrayList );
        scn.close(); // Закрыл скан, надоело подчеркивание
        return arrayList;
    }


    public static ArrayList<Integer> deleteEvenNumbers(ArrayList<Integer> arrayList) {
        
        // Штука до того как узнал про итератор).

        // for (int i = 0; i < arrayList.size(); i++) {
            
        //     if ((arrayList.get(i) % 2)==0) {
        //         arrayList.remove(arrayList.get(i));
        //         i--;
        //     }
            
        // }


        for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext();) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        
        }
        
        return arrayList;
     
    }





}
