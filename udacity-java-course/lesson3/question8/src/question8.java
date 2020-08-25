public class question8 {
public static int main(String[] args){
    public int diceRoll(int sides) {
        double randomNum = Math.random() * sides;
        randomNum = randomNum + 1;
        return (int) randomNum;
    }
    public int monopolyRoll()
    int roll1 = diceRoll(6);
    int roll2 = diceRoll(6);
    int total = roll1 + roll2;
    if (roll1==roll2){
        int roll3 = diceRoll(6);
        int roll4 = diceRoll(6);
        total = total + roll3 + roll4;
    }
    return total;


}
}
