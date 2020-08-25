public class question8 {
    public static void main(String[] args) {


        public int rollDice() {
            double randomNumber = Math.random() * 6;
            int random = (int) randomNumber + 1;
            return random;
        }

        public int monopolyRoll() {
            int roll1 = rollDice();
            int roll2 = rollDice();
            int total = roll1 + roll2;
            int numberOfRolls = 1;
            while (roll1 == roll2) {
                if (numberOfRolls >= 3) return -1;
                roll1 = rollDice();
                roll2 = rollDice();
                total = total + roll1 + roll2;
                numberOfRolls = numberOfRolls + 1;
            }
            return total;
        }
        System.out.println(total);
    }
}
