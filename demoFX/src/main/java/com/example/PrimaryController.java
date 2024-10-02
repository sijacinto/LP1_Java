package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class PrimaryController {
    @FXML
    private ImageView im;

    @FXML
    private void switchToSecondary() throws IOException {
        //App.setRoot("secondary");
    
        
    Image image = new Image(getClass().getResourceAsStream("imagens/000014.jpg"));
    
    im.setImage(image);
}

    
}
