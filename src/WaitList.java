import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Класс WaitList, реализующий интерфейс IWaitList
 * @author Заирбеков Джамал
 * @param <E>
 */
public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    public WaitList(){
        content=new ConcurrentLinkedQueue<E>();
    }
    public WaitList(Collection<E> c){
        content=new ConcurrentLinkedQueue<E>(c);
    }
    public String toString(){
        return "в очереди " + content.size() + " человек. Следующий - " + content.peek();
    }

    /**
     * метод добавления элемента в очередь класса
     * @param element
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * метод удаления элемента из очереди класса
     * @return
     */
    @Override
    public E remove() {
        return content.remove();
    }

    /**
     * метод, проверяющий, содержится ли элемент в очереди класса
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     * метод, проверяющий, содержит ли очередь класса набор элементов
     * @param c
     * @return
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * метод, проверяющий очередь на пустоту
     * @return
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}