import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage;  
import javafx.scene.control.PasswordField;
public class TextBoxRead extends Application {  
  
      
public static void main(String[] args) {  
launch(args);     
}  
  
@Override  
public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    Label user_id=new Label("User ID");  
    Label password = new Label("Password");  
    TextField tf1=new TextField();  
    //TextField tf2=new TextField();  
    PasswordField pf=new PasswordField(); 
    Button b = new Button("Submit");  
    b.setOnAction(e->System.out.println("You entered: User_ID: "+tf1.getText()+""+"Password: "+pf.getText()));  
    GridPane root = new GridPane();  
    root.addRow(0, user_id, tf1);  
    root.addRow(1, password, pf);  
    root.addRow(2, b);  
    Scene scene=new Scene(root,300,200);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Text Field Example");  
    primaryStage.show();  
}  
}  
