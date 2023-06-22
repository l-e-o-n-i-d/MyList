package ex7;

public class MyList<T>  {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] array = new Object[DEFAULT_CAPACITY];

    public void add(T element){
        if (size == array.length - 1) {
            Object[] temp_array = new Object[DEFAULT_CAPACITY * 2];
            for (int i = 0; i < array.length; i++) {
                temp_array[i] = array[i];
            }
            array = temp_array;
        }
        array[size++] = element;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        if (index < size && index >= 0){
            return (T) array[index];
        }else throw new IndexOutOfBoundsException("Значення індексу за межами масиву");
    }

    public void remove(int index){
        if (index < size && index >= 0){
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            array[size] = null;
            size--;
        }else throw new IndexOutOfBoundsException("Недопустимий індекс для видалення елементу масиву");
    }
}
