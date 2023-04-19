import java.util.Scanner;

public class Auto {

    private String placa;
    private String modelo;
    private int anio;
    private String marca;

    private Motor motor;

    private Duenio duenio;

    private int numRuedas;


    public Auto(){

    }

    public Auto(String placa, String modelo, String marca, Motor motor, Duenio duenio, int numRuedas){
        this.placa=placa;
        this.modelo=modelo;
        this.marca=marca;
        this.motor=motor;
        this.duenio=duenio;
        this.numRuedas=numRuedas;
    }

    public Auto(Motor motor, Duenio duenio) {
        this.motor = motor;
        this.duenio = duenio;
    }

    double velocidad(int a){
        double velocidadKmh=0;
        switch (a){
            case 2:
                velocidadKmh= motor.torque()*a*2;
                break;
            case 4:
                velocidadKmh= motor.torque()*a*3;
                break;
            case 6:
                velocidadKmh= motor.torque()*a*5;
                break;
        }
        return velocidadKmh;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }



    public void imprimirAttr(){
        System.out.println("La placa del auto es: "+placa);
        System.out.println("El modelo del auto es: "+modelo);
        System.out.println("El año del auto es: "+anio);
        System.out.println("La marca del auto es: "+marca);
        System.out.println("La serie del motor es: "+motor.getSerie());
        System.out.println("El cilindraje del motor es: "+motor.getCilindraje());
        System.out.println("El tipo de combustible es: "+motor.getTipoCombustible());
        System.out.println("El nombre del dueño es: "+duenio.getNombre());
        System.out.println("La cédula del dueño es: "+duenio.getCedula());
        System.out.println("El número de ruedas del auto es: "+numRuedas);
    }

    public void ingresarAttr(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la placa del auto:");
        this.placa = sc.next();
        System.out.println("Ingrese el modelo del auto:");
        this.modelo = sc.next();
        System.out.println("Ingrese el año del auto:");
        int anio = sc.nextInt();
        System.out.println("Ingrese la marca del auto:");
        String marca = sc.next();
        System.out.println("Ingrese el número de ruedas del auto:");
        int numRuedas = sc.nextInt();
        System.out.println("Ingrese la serie del motor del auto:");
        String serie = sc.next();
        System.out.println("Ingrese el cilindraje del auto:");
        double cilindraje = sc.nextDouble();
        System.out.println("Ingrese el tipo de combustible del auto:");
        String tipoCombustible = sc.next();

        this.anio=anio;
        this.marca=marca;
        this.numRuedas=numRuedas;

        this.motor = new Motor(serie, cilindraje,tipoCombustible);

        System.out.println("Ingrese el nombre del dueño del auto:");
        String nombre = sc.next();
        System.out.println("Ingrese la cedula del dueño del auto:");
        String cedula = sc.next();

        this.duenio=new Duenio(nombre,cedula);

    }


}
