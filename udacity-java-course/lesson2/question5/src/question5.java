public class question5 {
    public static void main(String[] args){
        int time = 18;
        if (time >= 5 && time < 12){
            String timeOfDay = "morning";
            System.out.println(timeOfDay);
        } else if (time >= 12 && time < 20){
            String timeOfDay = "daytime";
            System.out.println(timeOfDay);
        } else {
            String timeOfDay = "night";
            System.out.println(timeOfDay);
        }
    }
}
