package HomeWork5;



import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;




    public class Task2 {
        public static void main(String[] args) throws IOException {
           
            TreeMap<String, Integer> spisok = new TreeMap<>();

            String str = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
            spisok = verse(str);
            System.out.println(spisok);
            sortSpisok(spisok);
            
        }
        
        
    public static TreeMap<String, Integer> verse (String str) {
        TreeMap<String, Integer> strSpisok = new TreeMap<>();
        String[] strArray = str.replace(",", "").split(" ");
        Integer x;
        

            for (String string : strArray) {
                x = 0;
                
                for (String string2 : strArray) {
                    
                    if(string.equals(string2)) {
                        x++;
                        
                        
                    }
                   
                    

                }
                if(x>1){
                    strSpisok.put(string, x);
                }
                
                
            }
        
        return strSpisok;                     
    }
                   
    public static void sortSpisok(TreeMap<String, Integer> spisok) {
    
        
        spisok.entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach(System.out::println);
        
        
    } 

}