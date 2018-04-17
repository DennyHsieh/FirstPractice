package Practice;

public class CH5_Constructor {
    public static void main(String[] args) {
        Cons c1 = new Cons();
        Cons c2 = new Cons("abc");
        Cons c3 = new Cons(17);
        Cons c4 = new Cons(1.732);
    }

}

class Cons{
    Cons(){
        System.out.println("Default");
    }
    Cons(int type){
        System.out.println("Int Constructor");
    }
    Cons(double type){
        System.out.println("Double Constructor");
    }
    Cons(String type){
        System.out.println("String Constructor");
    }
}
