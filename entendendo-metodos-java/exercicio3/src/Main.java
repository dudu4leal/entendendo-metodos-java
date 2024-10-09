public class Main {
    public static void main(String[] args) throws Exception {
        
        //Quadrilateros 2
        
        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Area do quadrado = " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5, 5);
        System.out.println("Area do retangulo = " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7, 8, 9);
        System.out.println("Area do trapezio = " + areaTrapezio);


    }
}
