// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Duenio duenio = new Duenio("Carlos","1715607071");
        Motor motor = new Motor("WXZ123456",1.6,"diesel");
        Auto auto = new Auto("PDE1234","Corolla", "Toyota", motor, duenio, 4);

        Duenio duenio1 = new Duenio("1732165478");
        Motor motor1 = new Motor("XFR1234");
        Auto auto1 = new Auto(motor1, duenio1);

        duenio1.setNombre("Carlos");
        motor1.setCilindraje(1.2);
        motor1.setTipoCombustible("diesel");

        auto1.setNumRuedas(6);
        auto1.setModelo("HFC1102");

        String nombreDuenio = auto1.getDuenio().getNombre();

    }
}