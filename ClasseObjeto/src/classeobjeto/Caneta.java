package classeobjeto;


public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    
    
    public void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor da caneta? " + this.cor);
        System.out.println("Está tamapada? " + this.tampada);
        System.out.println("Ponta da caneta: " +this.ponta);
        System.out.println("Carga da caneta " +this.carga+"%");
    }
    
    void rabiscar(){
        if(this.tampada == false){
            System.out.println("Rabiscando");
        }
        else{
            System.out.println("Caneta está tampada não pode rabiscar no momento");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
