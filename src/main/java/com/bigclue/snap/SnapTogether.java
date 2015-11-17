package com.bigclue.snap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Application for organizing photos
 * User: Randy Wilson
 * Date: 17 November 2015
 */
public class SnapTogether extends Application {
  private static final String ROOT_DIR = "/Users/wilsonr/Pictures/Malcolm/";
  private static final String WORLD_MAP = ROOT_DIR + "TheWorld.jpg";
  private static final String COUNTRIES = ROOT_DIR + "Best1000";

  final ImageView imageView = new ImageView();

  @Override
  public void start(Stage primaryStage) {
//    StackPane root = new StackPane();
//    Scene scene = new Scene(root);
//
//    scene.getStylesheets().add("world.css");
//
//    String filename = WORLD_MAP;
//    System.out.println("Loading " + filename);
//    Image image = new Image("file:" + filename);
//    imageView.setImage(image);
//    imageView.setPreserveRatio(true);
//    imageView.setSmooth(true);
//    imageView.setFitWidth(scene.getWidth());
//    imageView.setFitHeight(scene.getHeight());
//
//    root.getChildren().add(imageView);
//
//    text.setId("maintext");
//    root.getChildren().add(text);
//
//    root.setStyle("-fx-background-color: #000000;");
//    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//      @Override
//      public void handle(KeyEvent keyEvent) {
//        System.out.println("Key code: " + keyEvent.getCharacter() + "/" + keyEvent.getText() + "/" + keyEvent.getCode().getName());
//        handleKey(keyEvent.getCode());
//      }
//    });
//
//    scene.widthProperty().addListener(new ChangeListener<Number>() {
//      @Override
//      public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
//        System.out.println("Width: " + newSceneWidth);
//        synchronized(imageView) {
//          imageView.setFitWidth(newSceneWidth.doubleValue());
//        }
//      }
//    });
//    scene.heightProperty().addListener(new ChangeListener<Number>() {
//      @Override
//      public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
//        System.out.println("Height: " + newSceneHeight);
//        synchronized (imageView) {
//          imageView.setFitHeight(newSceneHeight.doubleValue());
//        }
//      }
//    });
//
//    primaryStage.setTitle("Where in the World!?");
//    primaryStage.setScene(scene);
//    primaryStage.show();
  }

//  public void handleKey(KeyCode keyCode) {
//    switch (keyCode) {
//      case SPACE:
//      case RIGHT:
//        if (country == null) {
//          System.out.println("Hit end of country " + country.toString());
//          loadImage(WORLD_MAP);
//          text.setText("That's all, folks!");
//        }
//        else if (country.hasNext()) {
//          // Go to next picture in the current country.
//          text.setText("");
//          loadImage(country.next());
//          System.out.println("Displaying " + country + ": " + country.current());
//        }
//        else {
//          // Hit end of pictures for current country
//          // SO it's time to just guess.
//          System.out.println("Hit end of country " + country.toString());
//          text.setText("?");
//        }
//        break;
//      case LEFT:
//        // Go to the previous photo in the same country.
//        text.setText("");
//        if (country != null) {
//          loadImage(country.previous());
//        }
//        break;
//      case X:
//      case Q:
//      case ENTER:
//        // Give up: Reveal the name of the country.
//        if (country != null) {
//          text.setText(country.getName());
//        }
//        countryList.finishCountry(country);
//        country = countryList.pickCountry();
//        break;
//      case R: // reset
//        countryList.reset();
//        break;
//      default:
//        System.out.println("Ignored code: " + keyCode.getName());
//    }
//  }
//
//  private void loadImage(String filename) {
//    System.out.println("Loading file " + filename);
//    Image image = new Image("file:" + filename);
//    imageView.setImage(image);
//  }

  public static void main(String[] args) {
    launch(args);
  }

}
