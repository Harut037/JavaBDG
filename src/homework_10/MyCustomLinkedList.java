package homework_10;

import java.io.LineNumberInputStream;
import java.util.*;




public class MyCustomLinkedList<E> implements List<E> {
    private int size = 0;
    private MyNode<E> head;
    private MyNode<E> last;

    private static class MyNode<E> {
        E data;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.data = element;
            this.next = next;
            this.prev = prev;
        }

        MyNode(E data) {
            this.data = data;
        }
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
    public E get(int index) {
        MyNode<E> x = head;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        }
        return (E) x.data;
    }

    @Override
    public E set(int index, E data) {
        MyNode<E> current = head;
        E oldValue;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            oldValue = current.data;
            current.data = data;
        }
        return oldValue;
    }

    @Override
    public boolean add(E data) {
        MyNode<E> newNode = new MyNode<E>(data);

        if (head == null) {
            head = last = newNode;
            head.prev = null;
            last.next = null;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            last.next = null;
        }
        size++;

        return true;
    }

    @Override
    public E remove(int index) {
        E data;
        MyNode<E> current = head;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            data = head.data;
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            data = last.data;
            last = last.prev;
            last.next = null;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            data = current.data;
            current = null;
        }
        size--;

        return data;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
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
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
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
    public void add(int index, E element) {

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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

}