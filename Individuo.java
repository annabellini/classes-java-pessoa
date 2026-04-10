package Anna;
public class Individuo {
    String nome;
    int idade;

            public void caminhar() {
            System.out.println("caminhando...");
            }
            public void dormir(){
            System.out.println("dormir...");
            }
    
}

--------------------------------------------------------------------

  package Anna;
public class Principal {
    public static void main (String[] args) {
        Individuo i1 = new Individuo();
        i1.nome = "Ana";
        i1.idade = 20;
        i1.caminhar();
        i1.dormir();
        
        Individuo i2 = new Individuo();
        i2.nome = "Bruno";
        i2.idade = 30;
        
        Individuo i3 = new Individuo();
        i3.nome = "Carla";
        i3.idade = 25;
        i3.caminhar();
        i3.dormir();
    }
}
