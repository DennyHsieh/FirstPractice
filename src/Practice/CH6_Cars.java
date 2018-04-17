package Practice;

public class CH6_Cars {
    public static void main(String[] args) {
        Car blankcar = new Car();
        blankcar.num = "1111-Ax";
//		blankcar.go(args[0]);
        blankcar.checknum();
        blankcar.print();

        Toyota toyota = new Toyota();
        System.out.println(toyota.goOnBeach("Y"));

    }

}
class Car{
    protected String color = "Silver";
    protected int doors = 4;
    protected String num;
    private String num_pattern = "[0-9]{4}[-][A-Z]{2}";
    protected void checknum() {
        if (num.matches(num_pattern)) {
            System.out.println("Number is RIGHT.");
        }
        else {
            System.out.println("Number is WRONG!!!");
        }
    }

    protected String go(String s) {
        if (s == "[Yy]|[Yy]es") {
            return "Yes";
        }
        else if (s=="No"|s=="no"|s=="N"|s=="n") {
            return "No";
        }
        else {
            return "I cannot understand.";
        }
    }
    public void print() {
        System.out.println("Normal car:\nColor: "+color+"\nIt has "+doors+" doors.\nThe number of car is "+num+".\nCan it go? "+go("No"));
    }
}

class Toyota extends Car{
    protected String goOnBeach(String s) {
        if (s=="Yes"|s=="yes"|s=="Y"|s=="y") {
            return "Yes, toyota can go on beach.";
        }
        else if (s=="No"|s=="no"|s=="N"|s=="n") {
            return "No, toyota cannot go on beach.";
        }
        else {
            return "I cannot understand.";
        }
    }
}
class Honda extends Car{
    protected String goByBackWheel(String s) {
        if (s=="Yes"|s=="yes"|s=="Y"|s=="y") {
            return "Yes";
        }
        else if (s=="No"|s=="no"|s=="N"|s=="n") {
            return "No";
        }
        else {
            return "I cannot understand.";
        }
    }
}
