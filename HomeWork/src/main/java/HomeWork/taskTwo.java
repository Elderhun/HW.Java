package HomeWork;

public class taskTwo {

    public static void main(String[] args) {
        String[] arr  = {"babandl", "babanda", "baban", "babak", "kak"};
        String result = findPref(arr);
        System.out.print(result);

    }

    public static String findPref(String[] arr) {
        String emptyStr = null;
        if (arr.length == 0)
            return emptyStr;
        String prefix = arr[0];
        for (var str : arr)
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                    if (prefix.isEmpty())
                        return emptyStr;
            }
        return prefix;


    }

}
