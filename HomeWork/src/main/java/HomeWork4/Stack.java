package HomeWork4;



public class Stack<T> {

    private T[] array;
    private int index;


    public Stack(int length) {
        
        this.index = 0;
        this.array = (T[])new Object[length];

    }

    public int size() {
        
        
        return this.index;
    
    }

    public boolean empty() {
        
        return this.size() == 0;
    
    }

    public void push(T value) {

        try {
            
            this.array[index++] = value;
            
        }
        catch (Exception e) {                         
            index--;
            System.out.println("Ошибка, невозможно добавить больше обьектов чем размер \n");
        }
        
    }

    public T peek() {
        
        try {
            
            return this.array[index - 1];

        }
        catch (Exception e) {
            System.out.printf("Стек пустой\n");
        }
        return null;
    
    }

    public T pop() {
       
        try {
            
            return this.array[--index];
 
        }
        catch(Exception e) {
            index++;
            System.out.println("Не удалось найти объект, возможно, он не был добавлен т.к. размер стека не позволяет\n");
            return null;
        }
        
          
        
        
    }

    public static void main(String[] args) { 

        Stack<String> stack = new Stack<>(4);

        stack.push("String 4");
        stack.push("String 3");
        stack.push("String 2");
        stack.push("String 1");
        stack.push("String 5");

        System.out.println("Размер стека: " + stack.size());
        
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    

        System.out.println("Пустой? " + stack.empty());

        System.out.println("Размер стека: " + stack.size());

        System.out.println("Последний элемент стека: " + stack.peek());
        

        
    }

}
