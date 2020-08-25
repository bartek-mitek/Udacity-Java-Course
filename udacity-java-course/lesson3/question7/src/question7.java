public class question7 {
    public double fahrenheitToCelsius(double f){
        double c = (f - 32) * 5/9;
        return c;
    }
    public void printTemperature(double f){
        System.out.println("F: " + f);
        System.out.println("C: " + fahrenheitToCelsius(f));
    }
}
