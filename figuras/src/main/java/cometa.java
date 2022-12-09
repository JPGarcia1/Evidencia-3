public class cometa extends figuras {
    private double ladoMenor;
    private double ladoMayor;
    private double diametroMenor;
    private double diametroMayor;

    public cometa(){}

    public cometa(double ladoMenor, double ladoMayor, double diametroMenor, double diametroMayor) {
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
        this.diametroMenor = diametroMenor;
        this.diametroMayor = diametroMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }
    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    public double getLadoMayor() {
        return ladoMayor;
    }
    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
    public double getDiametroMenor() {
        return diametroMenor;
    }
    public void setDiametroMenor(double diametroMenor) {
        this.diametroMenor = diametroMenor;
    }
    public double getDiametroMayor() {
        return diametroMayor;
    }
    public void setDiametroMayor(double diametroMayor) {
        this.diametroMayor = diametroMayor;
    }

    public void calcularPerimetro(){
        double perimetroCometa = 2 * (ladoMayor+ladoMenor);
        System.out.println("El perimetro del cometa es = "+perimetroCometa);
    }

    public void calcularArea(){
        double areaCometa = (diametroMayor*diametroMenor)/2;
        System.out.println("El area del cometa es = "+areaCometa);
    }
}