package obobsheniya.o4ered;

// Исключение в связи с ошибками переполнения очереди.
class QueueFullException extends Exception{
    int size;

    QueueFullException(int a) {
        size = a;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}

// Исключение в связи с ошибками опустошения очереди.
class QueueEmptyException extends Exception{
    public String toString(){
        return "\nQueue is empty.";
    }
}
