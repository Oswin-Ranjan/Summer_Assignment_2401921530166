import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int index = 0; index < compartments.length; index++) {
            int type = random.nextInt(4) + 1;
            compartments[index] = createCompartment(type);
        }

        for (int index = 0; index < compartments.length; index++) {
            System.out.println("Compartment " + (index + 1) + ": " + compartments[index].getClass().getSimpleName());
            System.out.println(compartments[index].notice());
        }
    }

    private static Compartment createCompartment(int type) {
        switch (type) {
            case 1:
                return new FirstClass();
            case 2:
                return new Ladies();
            case 3:
                return new General();
            case 4:
                return new Luggage();
            default:
                throw new IllegalArgumentException("Invalid compartment type: " + type);
        }
    }
}