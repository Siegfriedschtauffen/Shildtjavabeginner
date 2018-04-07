package obobsheniya.o4ered;

// Обобщенный класс, реализующий очередь фиксированного размера.
class GenQueue<T> implements IGenQ<T>{
    private T q[];       // Массив для хранения элементов очереди.
    private int putloc, getloc; // Индексы размещения и извлечения
                                // элементов очереди.

    // построить пустую очередь из заданного массива
    public GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }
    // поместить элементы в очередь
    public void put(T obj) throws QueueFullException {
        if (putloc==q.length-1)
            throw new QueueFullException(q.length-1);
        putloc++;
        q[putloc] = obj;
    }
    // извлечь элементы из очереди
    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        getloc++;
        return q[getloc];
    }
}
