import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Teste extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group(); //root

        //Scene 
        Scene scene = new Scene(group, 500, 300);
        scene.setFill(Color.BISQUE);
        primaryStage.setTitle("Example 1 Java FX"); //setting stage title

        //add the scene to the stage
        primaryStage.setScene(scene);

        //show the stage
        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}
