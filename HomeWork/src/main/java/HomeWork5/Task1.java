package HomeWork5;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.List;


public class Task1 {
    
    public static void main(String[] args) throws IOException {
        
        Map<Integer, Map<String, List<String>>> maplist = new HashMap<>();

        String st;
        String spnb;
        int x = getLineCountByReader()+1;
        maplist = createPhoneBook(x);    
        st = converString(maplist);
        st = st.replace("[", " : ").replace("{"," : ").replace("=", "");
        writerPhoneBook(st);
        spnb = readPhoneBook();
        System.out.printf("Ваш телефонный справочник \n%s", spnb);
        
    
    }


    public static Map<Integer, Map<String, List<String>>> createPhoneBook(int x) {
        
        Map<Integer, Map<String, List<String>>> pn = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        boolean bl = true;
        StringBuilder st2 = new StringBuilder();
        String st1;
        System.out.println("Введите имя");
        String name = sc.nextLine();

        System.out.println("Введите номер телефона, если больше нечего вводить нажмите Enter");
        while(bl)   {

            st1 = sc.nextLine();

            if(st1 != ""){
                st2.append(st1 + ", ");
            }

            else {
                bl = false;
            }

        }
        
        pn.put(x, Map.of(name, List.of(st2.toString())));

        
        
        
        return pn;
    }



    public static String converString(Map<Integer, Map<String, List<String>>> params) {
        
        Map<Integer, Map<String, List<String>>> par = new HashMap<>();
        
        StringBuilder str = new StringBuilder();

        String a;

        for (Entry<Integer, Map<String, List<String>>> key : params.entrySet())
        {
           
            a = key.getKey().toString();               
            str.append(a + params.get(key.getKey()) +", ");
            
        }
        str.delete(str.toString().length()-6,str.toString().length());
        str.append("\n");
        
        return str.toString();

    }


    
    public static void writerPhoneBook(String pnb) throws IOException {
        
        File output = new File("C:\\Users\\Igor\\Desktop\\DZJava\\HomeWork\\src\\main\\java\\HomeWork5\\phonebook.txt"); 
        PrintWriter writer = new PrintWriter(new FileWriter(output, true));
        writer.print(pnb);
        writer.close();
    }



    public static String readPhoneBook() throws IOException {
        
       
        return new String(Files.readAllBytes(Paths.get("C:\\Users\\Igor\\Desktop\\DZJava\\HomeWork\\src\\main\\java\\HomeWork5\\phonebook.txt")));
        

    }


    public static int getLineCountByReader() throws IOException {
        try (var ln = new LineNumberReader(new BufferedReader(new FileReader("C:\\Users\\Igor\\Desktop\\DZJava\\HomeWork\\src\\main\\java\\HomeWork5\\phonebook.txt")))) {
            while (ln.readLine() != null) ;
            return ln.getLineNumber();
        }
    }


}
