package composicao;

public class VideoGame {

    private Jogo jogo;
      
    
    public void ligar(){
        System.out.println("Ligar o videogame");
    }
   
    public void desligar(){
        System.out.println("Desligando o videogame");
    }

  
    public void jogar(Jogo jogo) {
        this.jogo = jogo;
        this.jogo.jogar();
    }
    
    
    public void fechar() {
        this.jogo.fechar();
    }
       
}
