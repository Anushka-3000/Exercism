import java.util.NoSuchElementException;

class SimpleList<T>{
    private final T val;
    private SimpleList<T> next;

    public SimpleList(T val, SimpleList<T> next) {
        this.val = val;
        this.next = next;
    }
    public T getVal() {
        return val;
    }
    public SimpleList<T> getNext() {
        return next;
    }
    public void setNext(SimpleList<T> next) {
        this.next = next;
    }
}

class SimpleLinkedList<T> {
    int size = 0;
    SimpleList<T> firstElement;

    SimpleLinkedList() {

    }

    SimpleLinkedList(T[] values) {
        for (T val : values)
            this.push(val);
    }

    void push(T value) {
        if(size == 0)
            firstElement = new SimpleList<>(value, null);
        else
            firstElement = new SimpleList<>(value, firstElement);
        size++;
    }

    T pop() {
        if (size == 0)
            throw new NoSuchElementException();

        SimpleList<T> element = firstElement;
        firstElement = element.getNext();
        element.setNext(null);
        size--;
        return element.getVal();
    }

    T[] asArray(Class<?> clazz) {
        SimpleList<T> temp = firstElement;
        T[] ret = (T[]) new Object[size];
        int i = 0;
        while (temp != null){
            ret[i] = temp.getVal();
            i++;
            temp = temp.getNext();
        }
        return  ret;
    }

    void reverse() {
        T[] array = this.asArray(Object.class);
        while (size > 0)
            this.pop();
        for (var el: array)
            this.push(el);
    }

    int size() {
        return size;
    }
}
