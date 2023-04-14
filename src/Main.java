import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Duenio duenio = new Duenio("Carlos","1715607071");
        Motor motor = new Motor("WXZ123456",1.6,"diesel");
        Auto auto = new Auto("PDE1234","Corolla", "Toyota", motor, duenio, 4);
        auto.setAnio(2010);
        auto.imprimirAttr();

        Duenio duenio1 = new Duenio("1732165478");
        Motor motor1 = new Motor("XFR1234");
        Auto auto1 = new Auto(motor1, duenio1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del dueño del auto:");
        String nombre = sc.next();
        System.out.println("Ingrese el cilindraje del auto:");
        double cilindraje = sc.nextDouble();
        System.out.println("Ingrese el tipo de combustible del auto:");
        String tipoCombustible = sc.next();
        System.out.println("Ingrese la placa del auto:");
        String placa = sc.next();
        System.out.println("Ingrese el modelo del auto:");
        String modelo = sc.next();
        System.out.println("Ingrese la marca del auto:");
        String marca = sc.next();
        System.out.println("Ingrese el año del auto:");
        int anio = sc.nextInt();
        System.out.println("Ingrese el numero de ruedas del auto:");
        int numRuedas = sc.nextInt();

        auto1.getDuenio().setNombre(nombre);
        auto1.getMotor().setCilindraje(cilindraje);
        auto1.getMotor().setTipoCombustible(tipoCombustible);
        auto1.setPlaca(placa);
        auto1.setModelo(modelo);
        auto1.setMarca(marca);
        auto1.setAnio(anio);
        auto1.setNumRuedas(numRuedas);





        System.out.println("##################################################################");

        auto1.imprimirAttr();

    }
}