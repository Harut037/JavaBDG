package homework_10;

import java.util.*;

public class MyCustomArrayList implements List<Integer> {

    private int capacity = 16;

    private Integer[] array;

    private int size;

    public MyCustomArrayList(){
        array = new Integer[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer element) {
        if (size == capacity) {
            Integer[] temp = new Integer[4 * capacity];
            System.arraycopy(array, 0, temp, 0, capacity);
            array = temp;
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index] = element;
        }

    }

    @Override
    public void add(int index, Integer element) {
        if(size == capacity){
            Integer[] temp = new Integer[4*capacity];
            System.arraycopy(array,0, temp, 0, capacity);

           capacity *= 4;
            array = temp;
        }
        array[size] = element;
        size++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Integer value = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        return value;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
    void myPrint() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        MyCustomArrayList list = new MyCustomArrayList();
        list.add(1);
        list.add(3);
        list.add(6);
        list.remove(1);
        list.myPrint();
        System.out.println(list.size());
    }
}
