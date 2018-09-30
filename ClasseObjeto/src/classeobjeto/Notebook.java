package classeobjeto;

public class Notebook {
    String marca;
    String cor;
    String hd;
    int memoria;
    boolean flag;
    
    void status(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Cor: "+this.cor);
        System.out.println("HD: "+this.hd);
        System.out.println("Memoria: "+this.memoria+"GB RAM");
        System.out.println("Flag: "+this.flag);
    }
    
    
    void digitar(){
        if(this.flag == true){
            System.out.println("Digitando...");
        }
        else
            System.out.println("Não é possível digitar no momento, notebook "+ this.marca+" "+this.cor+" esta desligado");
          
    }
    
    
    void ligado(){
        this.flag = true;
    }
    
    void desligado(){
        this.flag = false;
    }
}
