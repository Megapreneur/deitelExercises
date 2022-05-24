package eStore;

public class CardCreditInformation {
    String cvv;
    int cardExpirationYear;
    String cardName;
    String creditCardNumber;
    CardType cardType;

    public CardCreditInformation(String cvv, int cardExpirationYear, String cardName, String creditCardNumber, CardType cardType) {
        this.cvv = cvv;
        this.cardExpirationYear = cardExpirationYear;
        this.cardName = cardName;
        this.creditCardNumber = creditCardNumber;
        this.cardType = cardType;
    }
}
