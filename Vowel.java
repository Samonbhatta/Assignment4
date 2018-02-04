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

public class Vowel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid=new GridPane();
        grid.setPadding(new Insets( 14,14,14,14 ));
        grid.setVgap(2);
        grid.setHgap(1);

        Label input = new Label( "Please enter a letter!" );
        GridPane.setConstraints(input,0,1);
        grid.getChildren().addAll( input );

        TextField textField = new TextField(  );
        textField.setPromptText( "for eg: a (or A)" );
        GridPane.setConstraints( textField,0,2 );
        grid.getChildren().addAll( textField );

        Button button = new Button("Submit");
        GridPane.setConstraints( button,2,3 );
        grid.getChildren().addAll( button );
        button.setOnAction( e->{
            String tes = textField.getText().toUpperCase();
            Character testing = tes.charAt( 0 );
            int num = (int)testing;
            

            if((num>=65)&&(num<=90)&&{
                if(tes.equals( "A" )||tes.equals( "E" )||tes.equals( "I" )||tes.equals( "O" )||tes.equals( "U" )){
                    JOptionPane.showMessageDialog( null,"THe letter you have entered is VOWEL. " );

                }

                else{
                    JOptionPane.showMessageDialog( null,"THe letter you have entered is CONSONANT " );

                }}
                else {
                JOptionPane.showMessageDialog( null,"Invalid Input. Cam you enter any alphabet to get the result." );


            }
            }
         );


        primaryStage.setTitle("Vowel and Consonant Identifier.");
        primaryStage.setScene(new Scene(grid, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
