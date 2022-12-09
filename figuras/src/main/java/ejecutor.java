import java.util.*;

public class ejecutor {

    public static void main(String[] args) {
        int opc1, opc2;
        cometa com = new cometa();
        heptagono hepta = new heptagono();
        semicirculo semi = new semicirculo();

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Escoga la figura a la cual quiere calcular su perimetro y/o area.\n 1. Cometa(deltoide).\n 2. Heptagono.\n 3. Semicirculo.\n 4. Salir del programa.");
            opc1 = sc.nextInt();
            switch (opc1) {
                case 1:
                do{
                    System.out.println("COMETA(DELTOIDE)\nIngrese valor el cual quiere calcular.\n 1. Perimetro.\n 2. Area.\n 3. Salir del modulo.");
                    opc2 = sc.nextInt();
                    switch (opc2) {
                        case 1:
                            System.out.println("Ingrese el lado mayor del cometa: ");
                            com.setLadoMayor(sc.nextDouble());
                            System.out.println("Ingrese el lado menor el cometa: ");
                            com.setLadoMenor(sc.nextDouble());
                            if(com.getLadoMayor() < com.getLadoMenor()){
                                System.out.println("El lado menor no puede ser mas largo que el lado mayor.");
                            }
                            else{
                                com.calcularPerimetro();
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el diametro mayor del cometa: ");
                            com.setDiametroMayor(sc.nextDouble());
                            System.out.println("Ingrese el diametro menor del cometa: ");
                            com.setDiametroMenor(sc.nextDouble());
                            if(com.getDiametroMayor() < com.getDiametroMenor()){
                                System.out.println("El diametro menor no puede ser mas largo que el diametro mayor.");
                            }
                            else{
                                com.calcularArea();
                            }
                            break;
                        case 3:
                            System.out.println("Saliendo del modulo.");
                            break;
                        default:
                            System.out.println("Digite un valor valido.");
                            break;
                    }
                }while(opc2 != 3);
                    break;
                case 2:
                do{
                    System.out.println("HEPTAGONO\nIngrese valor el cual quiere calcular.\n 1. Perimetro.\n 2. Area.\n 3. Salir del modulo.");
                    opc2 = sc.nextInt();
                    switch (opc2) {
                        case 1:
                            System.out.println("Ingrese la longitud de los lados del heptagono en cm");
                            hepta.setLado(sc.nextDouble());
                            hepta.calcularPerimetro();
                            break;
                        case 2:
                            System.out.println("Ingrese la longitud de los lados del heptagono en cm: ");
                            hepta.setLado(sc.nextDouble());
                            System.out.println("Ingrese el apotema del heptagono en cm: ");
                            hepta.setApotema(sc.nextDouble());
                            hepta.calcularArea();
                            break;
                        case 3:
                            System.out.println("Saliendo del modulo.");
                            break;
                        default:
                            System.out.println("Digite un valor valido.");
                            break;
                    }
                }while(opc2 != 3);
                    break;
                case 3:
                do{
                    System.out.println("SEMICIRCULO\nIngrese valor el cual quiere calcular.\n 1. Perimetro.\n 2. Area.\n 3. Salir del modulo.");
                    opc2 = sc.nextInt();
                    switch (opc2) {
                        case 1:
                            System.out.println("Ingrese el radio del semicirculo");
                            semi.setRadio(sc.nextDouble());
                            semi.calcularPerimetro();
                            break;
                        case 2:
                            System.out.println("Ingrese el radio del semicirculo");
                            semi.setRadio(sc.nextDouble());
                            semi.calcularArea();
                            break;
                        case 3:
                            System.out.println("Saliendo del modulo.");
                            break;
                        default:
                            System.out.println("Digite un valor valido.");
                            break;
                    }
                }while(opc2 != 3);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Digite un valor valido.");
                    break;
            }
        }
        while(opc1 != 4);
        sc.close();
    }
}