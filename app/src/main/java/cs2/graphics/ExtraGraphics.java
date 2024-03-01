package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExtraGraphics extends Application {

  public double map(double value, double loin, double hiin, double loout, double hiout) {
    double newval = value - loin;
    newval /= (hiin - loin);
    newval *= (hiout - loout);
    newval += loout;
    return newval;
  }

  public void start(Stage primaryStage) {
    Canvas canva = new Canvas(600,600);
    Scene sc = new Scene(new StackPane(canva));
    primaryStage.setScene(sc);
    primaryStage.show();

    GraphicsContext g = canva.getGraphicsContext2D();
  
    for(double y=0; y<600; y+=50) {
      for(double x=0; x<600; x+=50) {
        g.setFill(Color.rgb((int)map(x, 0,600, 0,255), 
                            0, (int)map(y, 0,600, 0,255)));
        g.fillOval(x,y, 50,50);
      }
    }

    Color skyblue = Color.rgb(57, 126, 230);
    Color skyorange = Color.rgb(217, 139, 37);

    g.setLineWidth(2);
    for(double y=0; y<400; y++) {
      g.setStroke(skyblue.interpolate(skyorange, y/400));
      g.strokeLine(0,y, 600,y);
    }


    for(double r=1; r<150; r++) {
      g.setStroke(Color.rgb(242, 81, 12).interpolate(Color.rgb(217, 199, 65), 
                  map(r, 1,150, 1,0)));
      //g.strokeOval(200,300, r*2,r*2);
      strokeCircle(g, 200,300, r);
    }

    for(double y=400; y<600; y++) {
      g.setStroke(Color.rgb(24, 29, 163).interpolate(Color.rgb(59, 143, 141), 
                  map(y, 400,600, 0,1)));
      g.strokeLine(0,y, 600,y);
    }
  }

  public void strokeCircle(GraphicsContext g, double x, double y, double r) {
    g.strokeOval(x-r,y-r, r*2,r*2);
  }

}
