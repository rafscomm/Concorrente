/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: ThreadFilho2.java
Funcao...: Construcao da thread do segundo filho
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class ThreadFilho2 extends Thread {
  private Controller controle;
  private int idadeF2 = 0;

  public void controle(Controller controle) {
    this.controle = controle;

  }
  
  public void run() {
    controle.changeImageFilho2("Imagens/filho2.jpg");
    try {
      sleepF(20);
      controle.nasceNeto2();
      sleepF(55);
      controle.changeImageFilho2("Imagens/lapide.jpg");
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }
  public void sleepF(int time) throws InterruptedException {
    while( idadeF2!= time){
      Thread.sleep(1000);
      idadeF2++;
    }
  }

}