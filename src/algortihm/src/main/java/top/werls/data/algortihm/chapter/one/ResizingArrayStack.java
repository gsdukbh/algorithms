package top.werls.data.algortihm.chapter.one;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: data
 * @Date : 2020/7/24 15:29
 */
public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] a = (T[]) new Objects[1];
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        T[] temp = (T[]) new Objects[max];
        if (N >= 0) {
            System.arraycopy(a, 0, temp, 0, N);
        }
        a = temp;
    }

    public void push(T t) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = t;
    }

    public T pop() {
        T t = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return t;
    }
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {

        return null;
    }

    private class ListIterator implements  Iterable<T>{

        /**
         * Returns an iterator over elements of type {@code T}.
         *
         * @return an Iterator.
         */
        @Override
        public Iterator<T> iterator() {
            return null;
        }
    }
}
