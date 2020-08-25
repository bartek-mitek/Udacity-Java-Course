public class question8 {
    public static void main(String[] args){
        int dayOfWeek = 1;
        String schedule;
        switch (dayOfWeek){
            case 1: schedule = "Gym in the morning.";
            break;
            case 2: schedule = "Class after work.";
            break;
            case 3: schedule = "Meetings all day.";
            break;
            case 4: schedule = "Work from home.";
            break;
            case 5: schedule = "Game night after work.";
            break;
            case 6: schedule = "Free!";
            break;
            case 7: schedule = "Free!";
            break;
            default: schedule = "On which World you're living!";
        }
        System.out.println(schedule);
    }
}
