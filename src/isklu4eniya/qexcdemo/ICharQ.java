package isklu4eniya.qexcdemo;

// Интерфейс для очереди символов.
public interface ICharQ {
    // поместить символ в очередь
    void put(char ch) throws QueueFullException;

    // извлечь символ из очереди
    char get() throws QueueEmptyException;
}


