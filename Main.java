//import java.util.Scanner
class Main {
  public static void main(String[] args) {

    //Scanner sc = new Scanner(System.in);
    
    Candidato candidato1 = new Candidato(13, "Lula ladrão roubou meu coração");
    Candidato candidato2 = new Candidato(22, "Bolsonaro ladrao ja na prisao");
    Candidato candidato3 = new Candidato(14, "Padre bobao");

    for (int i = 0; i < 7; i++) {
      //System.out.println("Digite numero do seu candidato: ");
            candidato1.votar();
            candidato2.votar();
            candidato3.votar();
        
      }
   System.out.println(candidato1.getVotos());
   System.out.println(candidato2.getVotos());
   System.out.println(candidato3.getVotos());
  }
}