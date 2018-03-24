package interfaces.var3;

// Применение интерфейсных ссылок.
class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos(){
        start=0;
        val=0;
        prev=-2;
    }
    public int getNext(){
        prev=val;
        val+=2;
        return val;
    }
    public void reset(){
        start=0;
        val=0;
        prev=-2;
    }
    public void setStart(int x) {
        start = x;
        val = x;
        prev=x-2;
    }
    int getPrevious(){
        return prev;
    }
}
class ByThrees implements Series {
    int start;
    int val;

    ByThrees(){
        start=0;
        val=0;
    }
    public int getNext() {
        val+=3;
        return val;
    }
    public void reset() {
        start=0;
        val=0;
    }
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i=0; i<5; i++){
            ob=twoOb;
            // Обращение к объекту по интерфейсной ссылке.
            System.out.println("Next ByTwos value is "+ob.getNext());
            ob=threeOb;
            // Обращение к объекту по интерфейсной ссылке.
            System.out.println("Next ByTwos value is "+ob.getNext());
        }
    }
}
