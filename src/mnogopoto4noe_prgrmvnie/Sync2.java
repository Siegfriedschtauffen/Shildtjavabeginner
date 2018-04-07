package mnogopoto4noe_prgrmvnie;

// Применение синхронизированного блока
// для управления доступом к методу sumArray().
class SumArray2{
    private int sum;

    // Здесь метод sumArray() не синхронизирован.
    int sumArray(int nums[]){
        sum = 0; // обнулить сумму
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            System.out.println("Running total for "+
                    Thread.currentThread().getName()+" is "+sum);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println("Main thread interrupted.");
            }
        }
        return sum;
    }
}
class MyThread8 implements Runnable{
    Thread thrd;
    static SumArray2 sa = new SumArray2();
    int a[];
    int answer;

    // построить новый поток
    MyThread8 (String name, int nums[]){
        thrd = new Thread(this,name);
        a = nums;
        thrd.start(); // начать поток
    }
    // начать исполнение нового потока
    public void run(){
        int sum;
        System.out.println(thrd.getName()+" starting.");
        // Здесь вызовы метода sumArray() для объекта sa синхронизированы.
        synchronized (sa){
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for "+thrd.getName()+" is "+answer);
        System.out.println(thrd.getName()+" terminating.");
    }
}
public class Sync2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        MyThread8 mt1 = new MyThread8("Child #1",a);
        MyThread8 mt2 = new MyThread8("Child #2",a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
    }
}
