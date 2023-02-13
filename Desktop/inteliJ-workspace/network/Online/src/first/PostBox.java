package first;

public class PostBox<T>{ // generic class
    private T item ;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
