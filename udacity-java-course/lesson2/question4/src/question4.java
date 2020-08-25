public class question4 {
    public static void main(String[] args){
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isRaining || isSnowing || temperature < 50.0){
            System.out.println("Let's sty home.");
        }
        else{
            System.out.println("Let's go out");
        }
    }
}
