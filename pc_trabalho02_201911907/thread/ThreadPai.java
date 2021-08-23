/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: ThreadPai.java
Funcao...: Construcao da thread do pai
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class ThreadPai extends Thread {
  private Controller controle; // criacao da variavel controle do tipo Controller
  private int idadePai = 0; // contador de tempo da idade pai

  public void controle(Controller controle) { // Funcao que define a variavel global controle como a variavel local
    this.controle = controle;

  }// fim do controle
  
  public void run() {
    controle.changeImagePai("/Imagens/pai.jpg"); // define a imagem da thread pai
      try {
      sleepF(22);// tempo para nascer filho 1 
      controle.nasceF1(); // nasce filho 1
      sleepF(25); // tempo para nascer filho 2 
      controle.nasceF2(); // nasce filho 2
      sleepF(32); // tempo para nascer filho 3 
      controle.nasceF3(); // nasce filho 3 
      sleepF(90); // tempo de vida do pai 
      controle.changeImagePai("Imagens/lapide.jpg"); // seta imagem de morte do pai 
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    } // fim metodo exception

  } // fim metodo run 
  public void sleepF(int time) throws InterruptedException {
    while( idadePai!= time){ // contador de idade pai
      Thread.sleep(1000); // tempo em segundos 
      idadePai++; // a cada segundo, contador idadePai recebe mais 1
    } // fim while 
  }// fim metodo sleepF

}// fim ThreadPai