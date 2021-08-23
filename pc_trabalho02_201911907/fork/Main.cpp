/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Rafael Pereira Santos
Matricula: 201911907
Inicio...: 17 de agosto de 2021
Alteracao: 17 de agosto de 2021
Nome.....: Main.cpp
Funcao...: Utlizar comando fork para gerenciar uma arvore genealogica
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/


#include <iostream>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

using namespace std;

int main(void){
  pid_t idPessoa;
  int time;// variavel necessária para funcionamento do wait
  cout << "Nasce o pai" << endl;
  sleep(22);// Tempo de espera para o primeiro filho

  switch(idPessoa=fork())// escolhe o valor gerado pelo fork
  {
  case -1: //caso onde o programa nao funciona
    cout << "Erro" << endl;
  break;
  case 0: // caso, onde idPessoa == 0, logo indica que é um processo filho
    cout << "O pai tem o primeiro filho aos 22 anos " << endl;
  break;
  default:
    sleep(3);// No sleep , temos a diferença da idade onde cada fato aconteceu, exemplo , entre o nascimento do primeiro e segundo filho, temos uma diferença de 3 anos. Dessa forma, esse comando funciona da mesma maneira no restante do programa
    idPessoa=wait(0); // comando para parar o funcionamento do fork
  switch(idPessoa=fork()){
  case -1:
   cout<< "Erro"  << endl;
   exit(0);
  break;
  case 0:
    cout<< "O pai tem o segundo filho aos 25 anos " << endl;
  break;
  default:
  sleep(7); 
    idPessoa=wait(0);
  switch(idPessoa =fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "O pai tem o terceiro filho aos 32 " << endl;
  break;
  default:
    sleep(6); 
    idPessoa=wait(0);
  switch(idPessoa =fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "O pai e avo (do primeiro filho) aos 38 anos " << endl;
  break;
  default:
    sleep(7); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "O pai e avo (do segundo filho) aos 45 anos "<< endl;
  break;
  default:
    sleep(23); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "O pai e bisavo (primeiro filho) aos 68 anos " << endl;
  break;
  default:
    sleep(5); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "O primeiro neto morre aos 35 anos " << endl;
  break;
  default:
    sleep(5); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
     cout<< "Segundo neto morre aos 33 anos " << endl;
  break;
  default:
    sleep(2); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro" << endl;
    exit(0);
  break;
  case 0:
    cout<< "Segundo filho morre aos 55 anos " << endl;
  break;
  default:
    sleep(0); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"<< endl;
    exit(0);
  break;
  case 0:
     cout<< "O bisneto morre aos 12 anos " << endl;
  break;
  default:
    sleep(3); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "Primeiro filho morre aos 61 anos " << endl;
  break;
  default:
    sleep(4); 
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "Terceiro filho morre aos 55 anos " << endl;
  break;
  default:
    sleep(3);
    idPessoa=wait(0);
  switch(idPessoa=fork()){
  case -1:
    cout<< "Erro"  << endl;
    exit(0);
  break;
  case 0:
    cout<< "O pai morre aos 90 anos " << endl;
  break;
  default:                 
    idPessoa=wait(0);   
  break;
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
  }//fim switch
}//fim main
      

