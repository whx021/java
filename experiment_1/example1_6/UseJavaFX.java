import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
public class UseJavaFX extends Application {
    Image[] myImages;
    int totalImages = 5;
    int currentImage = 0; 
    ImageView pic = new ImageView();
    Button btNext;
    public void start(Stage myStage) throws Exception {
        myStage.setTitle("Do you want to see the beauty of the campus");
        myStage.setWidth(400);
        myStage.setHeight(500);
        Group layout = new Group();
        myStage.setScene(new Scene(layout));
        btNext = new Button("next picture");
        btNext.setLayoutX(180);
        btNext.setLayoutY(20);
        myImages = new Image[totalImages];
        for (int i = 0; i < myImages.length; ++i) {
            myImages[i] = new Image("/data/home/whx/develop/java/experiment_1/example1_6/images/picture" + (i + 1) + ".jpg");
        }
        pic.setImage(myImages[0]);
        pic.setLayoutX(20);
        pic.setLayoutY(60);
        pic.setFitWidth(350);
        pic.setPreserveRatio(true);
        layout.getChildren().addAll(pic, btNext);
        btNext.setOnAction(event -> { changepic(); });
        myStage.show();
    }
    public void changepic() {
        currentImage = ++currentImage % totalImages;
        pic.setImage(myImages[currentImage]);
    }
    public static void main(String[] args) {
        launch(args);
    }
}