package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Student student = new Student("Darwin", new Date(93, 2, 4));
        System.out.println("El nombre del estudiante es: " + student.name());
        System.out.println("La edad del estudiante es: " + student.getAge() + " años");
    }
}