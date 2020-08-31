public class Main {




    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount();
        SavingsAccount save = new SavingsAccount();
        CertificateOfDeposit COD = new CertificateOfDeposit();
        check.changeLimit(2000);
        check.changeAccount("321421451251");
        check.changeBalance(5000);
        save.changeTransfer(4000);
        save.changeAccount("ofiiowenoiwenwoewnoi");
        save.changeBalance(78798);
        COD.changeAccount("kkkkkkkkkkk");
        COD.changeBalance(4444.4);
        COD.setExpiry("22/11/2020");
        System.out.println("Checking: " + check.account + " Balance: " + check.balance + " Total limit: " + check.limit);
        System.out.println("Checking: " + save.account + " Balance: " + save.balance + " Total transfer: " + save.transfers);
        System.out.println("Checking: " + COD.account + " Balance: " + COD.balance + " Expiry day is: " + COD.expiry);
    }





}
