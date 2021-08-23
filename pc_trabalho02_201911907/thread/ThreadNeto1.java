/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: ThreadNeto1.java
Funcao...: Construcao da thread do primeiro neto
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class ThreadNeto1 extends Thread {
  private Controller controle;
  private int idadeNeto1 = 0;

  public void controle(Controller controle) {
    this.controle = controle;

  }
  
  public void run() {
    controle.changeImageNeto1("/Imagens/neto1.jpg");
    
    try {
      sleepF(30);
      controle.nasceBisneto();
      sleepF(35);
      controle.changeImageNeto1("Imagens/lapide.jpg");
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }
  public void sleepF(int time) throws InterruptedException {
    while( idadeNeto1!= time){
      Thread.sleep(1000);
      idadeNeto1++;
    }
  }

}