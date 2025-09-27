package Java.Examples.Constructors;

public class NumberHolder {
    int number;

    NumberHolder() {
        this.number = 10;
    }

    NumberHolder(int number) {
        this.number = number;
    }

    NumberHolder(NumberHolder n) {
        this.number = n.number;
    }

    public static void main(String[] args) {
        NumberHolder holder1 = new NumberHolder();
        NumberHolder holder2 = new NumberHolder(20);
        NumberHolder holderCopy = new NumberHolder(holder2);

        System.out.println("Value of holder1's number: " + holder1.number);
        System.out.println("Value of holder2's number: " + holder2.number);
        System.out.println("Value of holder2's number: " + holderCopy.number);
    }
}
