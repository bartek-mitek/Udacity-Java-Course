public class question4 {
    public int yearsTillOneMillion(double initialBalance) {
        double money = initialBalance;
        double target = 1000000.0;
        int numberOfYears = 1;
        while (money < target) {
            money = money * 1.05;
            numberOfYears++;
        }
        return numberOfYears;

    }
}
