package com.mycompany.week11_demo_simplepaintapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PrimaryController {

    double sX, sY;
    String selectedShape="LINE";
    @FXML
    private Canvas myCanvas;
    
    

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void handleMouseReleased(MouseEvent event) {
        GraphicsContext g = myCanvas.getGraphicsContext2D();
        
        double eX= event.getX();
        double eY= event.getY();
        g.setStroke(Color.BLUE);
        g.setLineWidth(5);
        
         switch(     selectedShape   ){
            case "LINE": g.strokeLine(sX, sY, eX, eY);;break;
            case "RECT": g.strokeRect(
                    (sX>eX)?eX:sX,
                    (sY>eY)?eY:sY, 
                    Math.abs(eX-sX), Math.abs(eY-sY));;break;
        }
         
        
    }

    @FXML
    private void handleMouseDragged(MouseEvent event) {
    }

    @FXML
    private void handleMousePressed(MouseEvent event) {
        
        sX= event.getX();
        sY= event.getY();
    }

    @FXML
    private void setShapeColor(ActionEvent event) {
         
    }

    @FXML
    private void setShape(ActionEvent event) {
        
        switch(    ((Button)event.getSource()).getText()      ){
            case "LINE": selectedShape= "LINE";break;
            case "RECT": selectedShape= "RECT";break;
        }
    }
}
