public class heptagono extends figuras {

    private double lado;
    private double apotema;

    public heptagono(){}

    public heptagono(double lado, double apotema){
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void calcularPerimetro() {
        double perimetroHeptagono = 7 * lado;
        System.out.println("El perimetro del heptagono es = "+perimetroHeptagono);
    }

    public void calcularArea() {
        double areaHeptagono =(7 * apotema * lado)/2;
        System.out.println("El area del heptagono es = "+areaHeptagono);
    }
}