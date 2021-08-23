/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: Controller.java
Funcao...: Construcao da classe de controle que manipula as threads
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable {

  @FXML
  private AnchorPane background;

  @FXML
  private ImageView tree;

  @FXML
  private ImageView pai;

  @FXML
  private ImageView filho1;

  @FXML
  private ImageView filho2;

  @FXML
  private ImageView filho3;

  @FXML
  private ImageView neto1;

  @FXML
  private ImageView neto2;

  @FXML
  private ImageView bisneto;

  @FXML
  private Button start;

  private ThreadPai threadPai; // criar variavel threadPai
  private ThreadFilho1 threadFilho1; // cria variavel threadFilho1
  private ThreadFilho2 threadFilho2;
  private ThreadFilho3 threadFilho3;
  private ThreadNeto1 threadNeto1;
  private ThreadNeto2 threadNeto2;
  private ThreadBisneto threadBisneto;
  public  Controller(){ // contrutor da classe controller
    this.threadPai= new ThreadPai(); // instancia cada variavel
    this.threadFilho1 = new ThreadFilho1();
    this.threadFilho2 = new ThreadFilho2();
    this.threadFilho3 = new ThreadFilho3();
    this.threadNeto1 = new ThreadNeto1();
    this.threadNeto2 = new ThreadNeto2();
    this.threadBisneto = new ThreadBisneto();
  }//fim construtor
  @FXML
  public void start(ActionEvent event){ // acao do butao start
    threadPai.start(); // incializa a thread pai
  }// fim metodo start
  public void nascePai (){
    threadPai.start(); // metodo que inicializa a thread pai
  } //fim metodo nascePai
  public void nasceF1 (){// metodo que inicializa a thread filho1
    threadFilho1.start();
  }//fim metodo nasceF1
  public void nasceF2 (){// metodo que inicializa a thread filho2
    threadFilho2.start();
  }//fim metodo nasceF2
  public void nasceF3 (){// metodo que inicializa a thread filho3
    threadFilho3.start();
  }//fim metodo nasceF3
  public void nasceNeto1(){// metodo que inicializa a thread neto1
    threadNeto1.start();
  }//fim metodo nasceNeto1
  public void nasceNeto2(){// metodo que inicializa a thread neto2
    threadNeto2.start();
  }//fim metodo nasceNeto2
  public void nasceBisneto(){// metodo que inicializa a thread bisneto
    threadBisneto.start();
  }//fim metodo nasceBisneto

  public void changeImagePai(String url) {
    pai.setImage(new Image(url));
    
  }

  public void changeImageFilho1(String url) {
    filho1.setImage(new Image(url));
    
  }

  public void changeImageFilho2(String url) {
    filho2.setImage(new Image(url));
    
  }

  public void changeImageFilho3(String url) {
    filho3.setImage(new Image(url));
    
  }

  public void changeImageNeto1(String url) {
   neto1.setImage(new Image(url));
    
  }

  public void changeImageNeto2(String url) {
    neto2.setImage(new Image(url));
    
  }

  public void changeImageBisneto(String url) {
    bisneto.setImage(new Image(url));
    
  }


  

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    threadPai.controle(this);
    threadFilho1.controle(this);
    threadFilho2.controle(this);
    threadFilho3.controle(this);
    threadNeto1.controle(this);
    threadNeto2.controle(this);
    threadBisneto.controle(this);

  }

}