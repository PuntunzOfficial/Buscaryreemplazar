package dad.Buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplezar extends Application{
	
	private Label buscarLabel;
	private Label reemplazarLabel;
	private TextField buscarText;
	private TextField reemplazarText;
	private Button buscarButton;
	private Button reempButton;
	private Button reempTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	private CheckBox mayusMinCheck;
	private CheckBox exprRegCheck;
	private CheckBox buscarCheck;
	private CheckBox resaltarCheck;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarLabel = new Label("Buscar:");
		reemplazarLabel = new Label("Reemplazar con:");
		
		buscarText = new TextField();
		reemplazarText = new TextField();
		
		buscarButton = new Button("Buscar");
		reempButton = new Button("Reemplazar");
		reempTodoButton = new Button("Reemplazar Todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		mayusMinCheck = new CheckBox("Mayúsculas y minúsculas");
		exprRegCheck = new CheckBox("Expresión regular");
		buscarCheck = new CheckBox("Buscar hacia atrás");
		resaltarCheck = new CheckBox("Resaltar resultados");
		
		VBox boxButton = new VBox();
		
		GridPane checkPane = new GridPane();
		checkPane.add(mayusMinCheck, 0, 0);
		checkPane.add(exprRegCheck, 0, 1);
		checkPane.add(buscarCheck, 1, 0);
		checkPane.add(resaltarCheck, 1, 1);
		checkPane.setHgap(10);
		checkPane.setVgap(10);
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		root.setGridLinesVisible(false);
		root.addRow(0, buscarLabel, buscarText);
		root.addRow(1, reemplazarLabel, reemplazarText);
		root.add(checkPane, 1, 2);
		root.add(boxButton, 2, 0);
		GridPane.setRowSpan(boxButton, 3);

		RowConstraints[] rows = { new RowConstraints(), new RowConstraints() };
		root.getRowConstraints().setAll(rows);
		ColumnConstraints[] columns = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };
		columns[0].setHalignment(HPos.LEFT);
		columns[1].setHgrow(Priority.ALWAYS);
		root.getColumnConstraints().setAll(columns);

		buscarButton.setMaxWidth(Double.MAX_VALUE);
		buscarButton.setMinWidth(105);
		reempButton.setMaxWidth(Double.MAX_VALUE);
		reempButton.setMinWidth(105);
		reempTodoButton.setMaxWidth(Double.MAX_VALUE);
		reempTodoButton.setMinWidth(105);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMinWidth(105);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMinWidth(105);
		GridPane.setRowSpan(boxButton, 3);
		boxButton.setSpacing(5);
		boxButton.getChildren().addAll(buscarButton, reempButton, reempTodoButton, cerrarButton, ayudaButton);

		Scene scene = new Scene(root, 500, 280);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}