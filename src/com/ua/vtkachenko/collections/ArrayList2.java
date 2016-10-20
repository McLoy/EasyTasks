package com.ua.vtkachenko.collections;

public class ArrayList2 implements List {

    public int size(){
    return 0;
    }

    public boolean isEmpty(){
        return false;
    }

    public boolean contains(Object o){
        return false;
    }

    public Iterator<E> iterator(){
        return new Iterator<E>;
    }

    public Object[] toArray(){
        return new Object[];
    }

    public <T> T[] toArray(T[] a){
        return T[];
    }

    public boolean add(E e){
        return false;
    }

    public boolean remove(Object o){
        return false;
    }

    public boolean containsAll(Collection<?> c){
        return false;
    }

    public boolean addAll(Collection<? extends E> c){
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c){
        return false;
    }

    public boolean removeAll(Collection<?> c){
        return false;
    }

    ///
    boolean retainAll(Collection<?> c){
        return new UnsupportedOperationException();
    };

    default void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();
        while (li.hasNext()) {
            li.set(operator.apply(li.next()));
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    default void sort(Comparator<? super E> c) {
         new UnsupportedOperationException();
//        Object[] a = this.toArray();
//        Arrays.sort(a, (Comparator) c);
//        ListIterator<E> i = this.listIterator();
//        for (Object e : a) {
//            i.next();
//            i.set((E) e);
//        }
    }

    public void clear(){

    }

    public boolean equals(Object o){
        return false;
    }

    public int hashCode(){
        return 0;
    }

    public E get(int index){
        return E;
    }

    public  E set(int index, E element){
        return E;
    }

    public void add(int index, E element){

    }

    public E remove(int index){
        return E;
    }

    public int indexOf(Object o){
        return 0;
    }

    public int lastIndexOf(Object o){
        return 0;
    }

    ListIterator<E> listIterator(){
        return new UnsupportedOperationException();
    }

    ListIterator<E> listIterator(int index){
       return new UnsupportedOperationException();
    }

    List<E> subList(int fromIndex, int toIndex){
        return new UnsupportedOperationException();
    }

    default Spliterator<E> spliterator() {

        new UnsupportedOperationException();
        return Spliterators.spliterator(this, Spliterator.ORDERED);
    }

}
