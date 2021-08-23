/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: ThreadNeto2.java
Funcao...: Construcao da thread do segundo neto
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class ThreadNeto2 extends Thread {
  private Controller controle;
  private int idadeNeto2 = 0;

  public void controle(Controller controle) {
    this.controle = controle;

  }
  
  public void run() {
    controle.changeImageNeto2("/Imagens/neto2.jpg");
    
    try {
      sleepF(33);
      
      controle.changeImageNeto2("Imagens/lapide.jpg");
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }
  public void sleepF(int time) throws InterruptedException {
    while( idadeNeto2!= time){
      Thread.sleep(1000);
      idadeNeto2++;
    }
  }

}