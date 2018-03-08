package classes_and_methods.passob;

// Методам можно передавать объекты.
class Block{
    int a,b,c;
    int volume;

    Block(int i, int j, int k){
        a=i;
        b=j;
        c=k;
        volume=a*b*c;
    }

    // Возвратить логическое значение true, если
    // параметр ob определяет параллелепипед такого же объема
    // В качестве параметра методу передается объект.
    boolean someBlock(Block ob){
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Возвратить логическое значение true, если
    // параметр ob определяет такой же паралеллепипед
    // В качестве параметра методу передается объект.
    boolean someVolume(Block ob){
        if (ob.volume == volume) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10,2,5);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(4,5,5);

        // Здесь методам передаются объекты.
        System.out.println("ob1 some dimensions as ob2: " + ob1.someBlock(ob2));
        System.out.println("ob1 some dimensions as ob3: " + ob1.someBlock(ob3));
        System.out.println("ob1 some volume as ob3: " + ob1.someVolume(ob3));
    }
}
