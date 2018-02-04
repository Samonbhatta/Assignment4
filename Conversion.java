

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import javax.xml.soap.Text;

public class Conversion 
extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid = new GridPane();
        grid.setHgap( 0 );
        grid.setVgap( 0 );
        grid.setPadding( new Insets( 10,10,10,10 ) );

        Label label = new Label( "Enter the character or digit to be converted" );
        GridPane.setConstraints( label, 0,0 );
        grid.getChildren().addAll( label );

        TextField text = new TextField(  );
        text.setPromptText( "Enter character for eg 1 or a");
        GridPane.setConstraints( text,0,1 );
        grid.getChildren().addAll( text );

        Button button = new Button( "Submit" );
        GridPane.setConstraints( button,2,3 );
        grid.getChildren().addAll( button );
        button.setOnAction( e->{
            String input = text.getText();
            Character inputs = input.charAt( 0 );
            int bin = (int)inputs;
            int number = input.length();


            if(number==1){

            if((inputs>=48 && inputs<=57)) {

                JOptionPane.showMessageDialog( null, "The binary Value of the given number is " + Integer.toBinaryString( inputs ) );

            }
            else if (((inputs>=65 && inputs<=90)||(inputs>=97&& inputs<=122))){
                JOptionPane.showMessageDialog( null, "The binary Value of the given input is " + Integer.toBinaryString( inputs ) );}
            }






                else{
                JOptionPane.showMessageDialog( null, "Invalid Digit or number entered! ");

            }




        });



        Scene scene = new Scene( grid );
        primaryStage.setScene( scene );


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
