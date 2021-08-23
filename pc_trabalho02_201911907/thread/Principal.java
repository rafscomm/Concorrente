/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: Principal.java
Funcao...: Construcao da classe main
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {

    public static void main (String[] args) {
        launch(args);
    }
    @Override
    public void start (Stage stage)throws Exception{
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("Principal.fxml"));
        Controller controle = new Controller();
        fxml.setController(controle);
        Parent parent= fxml.load();
        Scene scene = new Scene(parent);
        stage.setTitle("Arvore Genealogica do Papajhonsons");
        stage.setScene(scene);
        stage.show();
            
        
        

    }

}