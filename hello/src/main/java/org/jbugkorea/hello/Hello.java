package org.jbugkorea.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {
	
    public void say() {
        launch();
    }

	@Override
	public void start(Stage stage) throws Exception {
		Label lblHello = new Label("Hello World!");
		StackPane root = new StackPane(lblHello);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setWidth(300);
		stage.setHeight(300);
		stage.show();
	}
}