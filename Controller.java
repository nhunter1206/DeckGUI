package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Deck deck;

    private Hand[] hands;

    @FXML
    private Label cardLabel;

    @FXML
    private Button startButton;

    @FXML
    private Label deckSizeLabel;

    @FXML
    private ImageView deckImage;

    @FXML
    private ImageView playerHandCard1Image;

    @FXML
    private ImageView playerHandCard2Image;

    @FXML
    private Label handValueLabel;

    public void startButtonClicked() {
        deck = new Deck();
        deck.printDeck();
        deckImage.setImage(new Image("/sample/images/back.png"));
        deckSizeLabel.setText("Cards in Deck: " + Integer.toString(deck.getDeckSize()));
        startButton.setDisable(true);
    }

    public void drawCardButtonClicked() {
        Card drawnCard = deck.drawCard();
        deckImage.setImage(drawnCard.getImage());
        cardLabel.setText(drawnCard.displayCard());
        deckSizeLabel.setText("Cards in Deck: " + Integer.toString(deck.getDeckSize()));
    }

    public void dealHandButtonClicked() {
        hands = new Hand[2];
        hands[0] = new PlayerHand(deck);
        playerHandCard1Image.setImage((hands[0].getCards())[0].getImage());
        playerHandCard2Image.setImage((hands[0].getCards())[1].getImage());
        handValueLabel.setText("Hand value: " + Integer.toString(hands[0].getValue()));
        deckSizeLabel.setText("Cards in Deck: " + Integer.toString(deck.getDeckSize()));
        startButton.setDisable(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cardLabel.setText("");
        deckSizeLabel.setText("");
        handValueLabel.setText("");
    }
}
