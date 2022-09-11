package HomeWork;

public class task {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 5};
        findI(arr);

    }
    public static void findI(int[] arr)
    {
        int start;
        int sumLess = 0;
        int sumAfter = 0;
        boolean result = false;



        for (start = 1; !result&(start <= arr.length-1);) {
            System.out.println(start);
            sumLess = 0;
            sumAfter = 0;

            for (int i = 0; i < start; i++) {
                sumLess += arr[i];
            }

            for (int j = start + 1; j < arr.length; j++) {
                sumAfter += arr[j];
            }

            if (sumLess == sumAfter) {
                result = true;
            }
            else {
                start++;
            }

        }
        if (result) {
            System.out.printf("Сумма элементов до  index-%s и после - равны", start);
        }
        else {
            System.out.println("Такого индекса нет");
        }
    }
}