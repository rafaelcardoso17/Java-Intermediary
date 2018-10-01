package encaps_interface;
public class ControleRemoto implements Controlador{
    
    private int volume; 
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto( ) {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //metódos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }
    

    @Override
    public void abrirMenu() {
        
        System.out.println("\t\tAbrindo Menu\t\t");
        System.out.println("Está ligado? "+this.isLigado());
        System.out.println("Está tocando? "+this.isTocando());
        System.out.print("Volume: "+this.getVolume());
        for(int i=0;i <=this.getVolume();i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume()+5);
        }
        else{
            System.out.println("Impossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() == false){
            this.setVolume(this.getVolume()-5);
        }
        else{
            System.out.println("Impossivel diminuir volume!");
        }
            
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() >0){
            this.setVolume(0);
        }
    
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
        else{
            System.out.println("Nao consegui dar play!");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
        else{
            System.out.println("Nao consegui dar pause!");
        }
    }
   
    
    
    
    
}
