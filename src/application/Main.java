package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			VBox temp = new VBox();
			temp.getChildren().add(new Caixa().comTexto("1"));
			temp.getChildren().add(new Caixa().comTexto("2"));
			temp.getChildren().add(new Caixa().comTexto("3"));
			temp.getChildren().add(new Caixa().comTexto("4"));
			temp.getChildren().add(new Caixa().comTexto("5"));
			temp.getChildren().add(new Caixa().comTexto("6"));
			temp.getChildren().add(new Caixa().comTexto("7"));
			
			Scene principal = new Scene(temp, 800, 600);
			
			primaryStage.setScene(principal);			
			primaryStage.setTitle("Gerenciadores de Layout");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
