import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Label;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
  
public class Labelemp extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Label my_label=new Label("This is an example of Label");  
        StackPane root = new StackPane();   
        Scene scene=new Scene(root,300,300);  
        root.getChildren().add(my_label);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Label Class Example");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
}  
