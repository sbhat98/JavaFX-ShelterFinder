package view;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../res/MainActivity.fxml"));
        primaryStage.setTitle("Shelter Finder");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    /**
     * Why am I doing this
     * @param args Don't use this. This is JavaFX.
     */
    public static void main(String[] args) {
        launch(args);
    }

    static {
        try (FileInputStream serviceAccount =
                     new FileInputStream("../../../res/shelterfinder-6d316-firebase-adminsdk-x6k4u-0a53bdc067.json")) {

            var options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://shelterfinder-6d316.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}