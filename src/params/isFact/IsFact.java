package params.isFact;

class Factor {
    boolean isFactor(int a, int b){
        return (b % a) == 0;
    }
}

public class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        // При вызови метода isFactor() передаются два аргумента.
        if(x.isFactor(2,20)) System.out.println("2 is factor");
        if(x.isFactor(3,20)) System.out.println("Это не отобразится");
    }
}
