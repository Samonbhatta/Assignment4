import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Name extends Application {

    @Override

        public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setHgap( 0 );
        grid.setVgap( 0 );
        grid.setPadding( new Insets( 10, 10, 10, 10 ) );

        Label label = new Label( "Please enter your full name" );
        GridPane.setConstraints( label, 0, 0 );
        grid.getChildren().addAll( label );

        TextField text = new TextField();
        text.setPromptText( "name: Jack ass..." );
        GridPane.setConstraints( text, 0, 1 );
        grid.getChildren().addAll( text );

        Button button = new Button( "Submit" );
        GridPane.setConstraints( button, 2, 3 );
        grid.getChildren().addAll( button );
        button.setOnAction( e -> {
            String input = text.getText();

            JOptionPane.showMessageDialog( null,"Welcome Mr/Mrs "+ input.substring( input.lastIndexOf( " " )+1 ) );




        } );
        primaryStage.setScene( new Scene( grid, 300, 275 ) );

        primaryStage.setTitle( "Name Window" );
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
