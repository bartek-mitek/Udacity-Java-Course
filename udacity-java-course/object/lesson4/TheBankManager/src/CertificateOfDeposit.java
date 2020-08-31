public class CertificateOfDeposit extends BankAccount {
    String expiry;

    public void ChangeExpiryDate(String newExpiry) {
        expiry = newExpiry;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
