import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        content=new ConcurrentLinkedQueue<E>();
        this.capacity=capacity;
    }

    /**
     * метод, возвращающий максимальное количество элементов в очереди
     * @return
     */
    public int getCapacity() {
        return this.capacity;
    }
    public void add(E element) {
        if(content.size()<this.capacity){
            content.add(element);
        }
    }
    public String toString(){
        return "в очереди " + content.size() + " человек. Следующий - " + content.peek();
    }
}