import java.util.Scanner;

public class semicirculo extends figuras {
    private double radio;

    Scanner sc = new Scanner(System.in);

    public semicirculo(){}

    public semicirculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularPerimetro() {
        double perimetroSemicirculo =(2 * 3.1416 * radio)/2;
        System.out.println("El perimetro del semicirculo es = "+ perimetroSemicirculo);
    }

    public void calcularArea() {
        double areaSemicirculo = ( 3.1416 * (radio * radio) ) / 2;
        System.out.println("El area del semicirculo es = "+areaSemicirculo);
    }
}