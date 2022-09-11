package HomeWork2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя, страну, город и возраст.");
        String name = scanner.nextLine();
        String country = scanner.nextLine();
        String city = scanner.nextLine();
        String age = scanner.nextLine();

        if (age == "") {
            age = null;
        }

        params.put("name : ", name);
        params.put("country : ", country);
        params.put("city : ", city);
        params.put("age : ", age);
        System.out.println(query(params));
    }
    public static String query(LinkedHashMap<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        s.append("select * from students where ");
        for (HashMap.Entry<String, String> key : params.entrySet())
        {
            if (key.getValue() != null)
            {
                s.append(key.getKey() + key.getValue()+", ");
            }
        }
        s.delete(s.toString().length()-2,s.toString().length());
        return s.toString();
    }
}
