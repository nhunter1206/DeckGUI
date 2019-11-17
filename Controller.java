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

    @FXML
    private Label cardLabel;

    @FXML
    private Button startButton;

    @FXML
    private Label deckSizeLabel;

    @FXML
    private ImageView image;

    public void startButtonClicked() {
        deck = new Deck();
        deck.printDeck();
        deckSizeLabel.setText("Cards in Deck: " + Integer.toString(deck.getDeckSize()));
        startButton.setDisable(true);
    }

    public void drawCardButtonClicked() {
        Card drawnCard = deck.drawCard();
        image.setImage(drawnCard.getImage());
        cardLabel.setText(drawnCard.displayCard());
        deckSizeLabel.setText("Cards in Deck: " + Integer.toString(deck.getDeckSize()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cardLabel.setText("");
        deckSizeLabel.setText("");
    }
}
