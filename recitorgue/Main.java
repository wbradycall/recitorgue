import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Organ Sound Generator");

        Button generateButton = new Button("Generate Sounds");
        generateButton.setOnAction(e -> generateSounds());

        VBox layout = new VBox(10);
        layout.getChildren().add(generateButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void generateSounds() {
        Pedal pedal = new Pedal("Pedal Type", 32, "Action Tye", "Organ Style");
        Great great = new Great("Great Keyboard", 61, "Action Type", "Organ Style");
        Swell swell = new Swell("Swell Keyboard", 61, "Action Type", "Organ Style");
        Choir choir = new Choir("Choir Keyboard", 61, "Action Type", "Organ Style");
        
        Principals principals = new Principals("Principal Stop", 2, 1, "Open", 0.4);
        principals.generateSound();
        
        Strings strings = new Strings("String Stop", 4, 2, "Closed", 0.6);
        strings.generateSound();
        
        OpenFlutes openFlutes = new OpenFlutes("OpenFlute Stop", 8, 4, "Open", 0.8);
        openFlutes.generateSound();
        
        ClosedFlutes closedFlutes = new ClosedFlutes("ClosedFlute Stop", 16, 8, "Closed", 0.9);
        closedFlutes.generateSound();
        
        ConedReeds conedReeds = new ConedReeds("ConedReed Stop", 2, 1, "Coned", 0.3);
        conedReeds.generateSound();
        
        CylindricalReeds cylindricalReeds = new CylindricalReeds("CylindricalReed Stop", 4, 2, "Cylindrical", 0.5);
        cylindricalReeds.generateSound();
        
        Krummhorns krummhorns = new Krummhorns("Krummhorn Stop", 8, 2, "Single", 0.5);
        krummhorns.generateSound();
        
        VoxHumanas voxHumanas = new VoxHumanas("VoxHumana Stop", 16, 4, "Double", 0.7);
        voxHumanas.generateSound();
        
        Zinkes zinkes = new Zinkes("Zinke Stop", 4, 1, "Single", 0.25);
        zinkes.generateSound();
        
        Regales regales = new Regales("Regale Stop", 2, 1, "Double", 0.3);
        regales.generateSound();
        
        PrincipalMixtures principalMixtures = new PrincipalMixtures("Mixture Stop", 
            new Rank[]{new Rank(2, 1), new Rank(4, 2)}, "Mixed", 0.7);
        principalMixtures.generateSound();
        
        FluteMixtures fluteMixtures = new FluteMixtures("FluteMixture Stop", 
            new Rank[]{new Rank(4, 2), new Rank(8, 4)}, "Mixed", 0.6);
        fluteMixtures.generateSound();
    }
}
