package HomeWork4;



public class Queue<T> {

    
    private T[] array;
    private int index;
    private int front;
    private int size;    

    public Queue(int length) {

        this.front = 0;
        this.size = 0;
        this.index = 0;
        this.array = (T[])new Object[length];
        
    }

    public int size() {
        
        
        return this.index;
    
    }

    public boolean empty() {
        
        return this.size() == 0;
    
    }

    public boolean offer(T value) {                          // Вставляет объект в очередь - вернет тру, в противном случае - фолс.
  
        try {
            
            this.array[index++] = value;
            size++;
        }
        catch (Exception e) {                         
            
            System.out.println("Невозможно добавить больше обьектов чем размер \n");
            return false;
        }
    
        return true;
    }
    
    public T poll(){                                       //Извлекает и удаляет голову очереди, если пусто - null.
        try {
           
            index = index % size;
            
            return this.array[front++];
      
            
        }
        
        catch (Exception e) {
            
            return null;
        }
        
    }

    public T  peek(){                                       //Возвращает головной элемент без удаления, если нечего возваращать - null.
       
        try {
            return this.array[front];  
        }
        
        catch (Exception e) {
            return null;
        }
    }



    public static void main(String[] args) { 

        Queue<String> queue = new Queue<>(3);


        System.out.println(queue.offer("String 1"));
        System.out.println(queue.offer("String 2"));
        System.out.println(queue.offer("String 3"));
        
        System.out.println(queue.peek());
       
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.peek());
        
        System.out.println("Пустой? " + queue.empty());

        System.out.println("Объектов в очереди: " + queue.size());

        

        
    }

}