package conta;

public class ContaBanc {
    private int numConta;
    private int senha;
    protected String tipo_conta;
    private String nome_dono;
    private float saldo;
    private boolean status;

    public ContaBanc(float saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getNome_dono() {
        return nome_dono;
    }

    public void setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    public void abrirConta(){
        this.setStatus(true);
        if(this.tipo_conta.equals("cc")){
            this.saldo = 50;
        }
        else{
            this.saldo = 150;
        }

    }
    
    public void fecharConta(){
        if(this.getSaldo() == 0 ){
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso!");
        }
        else{
            System.out.println("Impossível fechamento de conta, verifique se você tem algum saldo restante\n ou esta com saldo negativo");
        }
            
        
    }
    
    public float depositar(float depos){
        if(this.isStatus() == true){
            this.saldo += depos;
            System.out.println("Deposito realizado com sucesso, valor depositado: "+depos+" R$");
        }
        else{
            System.out.println("Conta fechada impossível depositar algum valor!");
        }
        return this.saldo;
    
    }
    
    public float sacar(float x){
        if(this.isStatus()==true && x <= this.getSaldo()){
            this.saldo -= x;
            System.out.println("Saque realizado com sucesso, valor sacadao: "+x+" R$");
        }
        else{
            System.out.println("Impossível sacar, valor situado maior que o saldo, ou conta encerrada!");
        }
        return this.saldo;
    } 
    
    public void pagarMensal(){
        if(this.tipo_conta.equals("cc")){
            saldo = saldo - 12.00f;
            System.out.println("Pagamento mensal realizado com sucesso: "+12.00f+" R$");
        }
        
        else if(this.tipo_conta.equals("cp")) {
            saldo = saldo - 20.00f; 
             System.out.println("Pagamento mensal realizado com sucesso: "+20.00f+" R$");
        }
           
    }
    
    public void estado(){
        System.out.println("Numero da conta: "+this.getNumConta());
        System.out.println("Tipo da conta: "+this.getTipo_conta());
        System.out.println("Nome do dono da conta: "+this.getNome_dono());
        System.out.println("Saldo: "+this.getSaldo());
        if(this.isStatus() == true)
            System.out.println("Status da conta: Ativo");
        else
            System.out.println("Status da conta: Inativo");
    }
}
