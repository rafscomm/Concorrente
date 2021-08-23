/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: ThreadFilho1.java
Funcao...: Construcao da thread do primeiro filho
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class ThreadFilho1 extends Thread {
  private Controller controle;
  private int idadeF1 = 0;

  public void controle(Controller controle) {
    this.controle = controle;

  }
  
  public void run() {
    controle.changeImageFilho1("Imagens/filho1.jpg");
    try {
      sleepF(16);
      controle.nasceNeto1();
      sleepF(61);
      controle.changeImageFilho1("Imagens/lapide.jpg");
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }
  public void sleepF(int time) throws InterruptedException {
    while( idadeF1!= time){
      Thread.sleep(1000);
      idadeF1++;
    }
  }

}
