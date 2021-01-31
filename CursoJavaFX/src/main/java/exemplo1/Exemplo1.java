package exemplo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Exemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Layout
		FlowPane noRaiz = new FlowPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);

		// Nó
		Label label = new Label();
		label.setText("Olá mundo!");

		// Adicionar elementos em cena
		noRaiz.getChildren().add(label);

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}