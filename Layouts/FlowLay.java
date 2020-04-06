import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.layout.FlowPane;  
import javafx.stage.Stage;  
  
public class FlowLay extends Application {  
  
    @Override  
    public void start(Stage primaryStage) {  
        primaryStage.setTitle("FlowPane Example");  
        FlowPane root = new FlowPane(Orientation.HORIZONTAL);  
        root.setVgap(6);  
        root.setHgap(5);  
        root.setPrefWrapLength(10);  
        root.getChildren().add(new Button("StartStartStartStartFlowPane's prefWrapLength property establishes it's preferred width (for horizontal) or preferred height (for vertical). Applications should set prefWrapLength if the default value (400) doesn't suffice. Note that prefWrapLength is used only for calculating the preferred size and may not reflect the actual wrapping dimension, which tracks the actual size of the flowpane.\r\n" + 
        		"\r\n" + 
        		"The alignment property controls how the rows and columns are aligned within the bounds of the flowpane and defaults to Pos.TOP_LEFT. It is also possible to control the alignment of nodes within the rows and columns by setting rowValignment for horizontal or columnHalignment for vertical."));  
        root.getChildren().add(new Button("Stop"));  
        root.getChildren().add(new Button("Reset"));  
        Scene scene = new Scene(root,300,200);  
   
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }  
   
    public static void main(String[] args) {  
        launch(args);  
    }  
}  