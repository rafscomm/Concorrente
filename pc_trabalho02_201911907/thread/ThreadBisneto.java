/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 18 de agosto de 2021
Nome.....: ThreadBisneto.java
Funcao...: Construcao da thread do bisneto
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class ThreadBisneto extends Thread {
  private Controller controle;
  private int idadeBisneto = 0;

  public void controle(Controller controle) {
    this.controle = controle;

  }
  
  public void run() {
    controle.changeImageBisneto("Imagens/bisneto.jpg");
    try {
      sleepF(12);
      controle.changeImageBisneto("Imagens/lapide.jpg");
     
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }
  public void sleepF(int time) throws InterruptedException {
    while( idadeBisneto!= time){
      Thread.sleep(1000);
      idadeBisneto++;
    }
  }

}