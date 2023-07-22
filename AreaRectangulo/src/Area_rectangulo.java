public class Area_rectangulo{
    public static void main(String[] args){
        double base = 10.0;
        double altura = 5.0;

        double area = calcular_area_rectangulo(base, altura);
        System.out.println("El area del rectangulo es: " + area);
    }

    public static double calcular_area_rectangulo(double base, double altura) {
        return base * altura;
    }

}