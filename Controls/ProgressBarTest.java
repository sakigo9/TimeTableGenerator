import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.*;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
public class ProgressBarTest extends Application {  
public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
    StackPane root = new StackPane();  
    ProgressBar progress = new ProgressBar();  
    //ProgressIndicator progress=new ProgressIndicator(); 
    progress.setProgress(0.25f); 
    root.getChildren().add(progress);  
    Scene scene = new Scene(root,300,200);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Progress Bar Example");  
    primaryStage.show();  
      
}  
public static void main(String[] args) {  
        launch(args);     
    }  
}  