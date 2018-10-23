import genericclasses.Box;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);
        System.out.println("The box integer is"+integerBox.get());
    }
}

/**
 * E - Element
 * K - Key
 * N - Number
 * T - Type
 * V - value
 * S,U,V etc - 2nd, 3rd , 4th types
 **/