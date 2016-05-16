package net.jmf.xsltst;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {
	@FXML
    private WebView renderer;
	
	@FXML
    private Button renderBtn;
	
	public void onRender() {
		WebEngine webEngine = renderer.getEngine();
		webEngine.load("http://www.stallman.org");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//renderer = new WebView();
	}

}
