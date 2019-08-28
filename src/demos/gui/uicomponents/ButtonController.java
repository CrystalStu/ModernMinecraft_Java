package demos.gui.uicomponents;

import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.effects.JFXDepthManager;
import io.datafx.controller.ViewController;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javax.annotation.PostConstruct;

@ViewController(value = "/fxml/ui/Button.fxml", title = "Material Design Example")
public class ButtonController {

    @FXML
    private JFXDialogLayout content;
    @FXML
    private StackPane root;

    @PostConstruct
    public void init() throws Exception {
        Image bombIcon  = new Image("71425.jpg");
        root.setBackground(new Background(new BackgroundImage(bombIcon, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1200, 800, false, false, false, false))));
        JFXDepthManager.setDepth(content,1);
    }

}
