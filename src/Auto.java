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


}
