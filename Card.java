package sample;

import javafx.scene.image.Image;

public class Card {

    private int value;
    private int suit;
    private Image image;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void generateImageName() {
        String convertedValue;
        String convertedSuit = null;

        if (value == 1) {
            convertedValue = "ace";
        } else if (value == 11) {
            convertedValue = "jack";
        } else if (value == 12) {
            convertedValue = "queen";
        } else if (value == 13) {
            convertedValue = "king";
        } else {
            convertedValue = String.valueOf(value);
        }

        if (suit == 1) {
            convertedSuit = "diamonds";
        } else if (suit == 2) {
            convertedSuit = "spades";
        } else if (suit == 3) {
            convertedSuit = "hearts";
        } else if (suit == 4) {
            convertedSuit = "clubs";
        }

        image = new Image("/sample/images/" + convertedValue + "_" + "of" + "_" + convertedSuit + ".png");
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }



    public String displayCard() {
        String convertedValue;
        String convertedSuit = null;

        if (value == 1) {
            convertedValue = "Ace";
        } else if (value == 11) {
            convertedValue = "Jack";
        } else if (value == 12) {
            convertedValue = "Queen";
        } else if (value == 13) {
            convertedValue = "King";
        } else {
            convertedValue = String.valueOf(value);
        }

        if (suit == 1) {
            convertedSuit = "Diamonds";
        } else if (suit == 2) {
            convertedSuit = "Spades";
        } else if (suit == 3) {
            convertedSuit = "Hearts";
        } else if (suit == 4) {
            convertedSuit = "Clubs";
        }
        return convertedValue + " of " + convertedSuit;
    }
}
