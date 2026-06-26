interface test {
    int square(int value);
}

class arithmetic implements test {
    @Override
    public int square(int value) {
        return value * value;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        arithmetic arithmeticObject = new arithmetic();
        int number = 5;
        System.out.println("Square of " + number + " is " + arithmeticObject.square(number));
    }
}