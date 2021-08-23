/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: ThreadFilho3.java
Funcao...: Construcao da thread do terceiro filho
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class ThreadFilho3 extends Thread {
  private Controller controle;
  private int idadeF3 = 0;

  public void controle(Controller controle) {
    this.controle = controle;

  }
  
  public void run() {
    controle.changeImageFilho3("Imagens/filho3.jpg");
    try {
      sleepF(55);
      controle.changeImageFilho3("Imagens/lapide.jpg");
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }
  public void sleepF(int time) throws InterruptedException {
    while( idadeF3!= time){
      Thread.sleep(1000);
      idadeF3++;
    }
  }

}