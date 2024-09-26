import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassMate karel = new ClassMate("Karel", LocalDate.of(2000, 1, 1));
        System.out.println(karel.getName());
    }
}