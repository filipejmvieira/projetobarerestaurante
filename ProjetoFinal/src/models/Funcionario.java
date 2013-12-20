package models;

public class Funcionario extends Custos {

   private String sobrenome;
   private String telefone;
   private String cpf; 
   private String rg;
   private double valeTransporte;
   private double valeRefeicao;
   
   
   public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
     public double getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao() {
        this.valeRefeicao = valeRefeicao;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte() {
        this.valeTransporte = valeTransporte;
    }
   
    public double calculaFerias(double custo){
        return this.getCusto()*0.11;
    }
    
    public double calculaDecimoTerceiro(double custo){
        return getCusto()*0.08;
    }
    
    public double calculaFGTS(double custo){
        return getCusto()*0.09;
    }
    
    public double calculaMultaRecisao(double custo){
        return getCusto()*0.09;
    }
    
    public double calculaINSS(double custo){
        return getCusto()*0.29;
    }
    
    public double calculaEntidades(double custo){
        return getCusto()*0.02;
    }
    
    public double calculaSalarioEducacao(double custo){
        return getCusto()*0.03;
    }
    
    public double totalEncargos(double custo){
        return calculaFerias(custo) + calculaDecimoTerceiro(custo) + calculaFGTS(custo) + calculaMultaRecisao(custo) + calculaINSS(custo) + calculaEntidades(custo) + calculaSalarioEducacao(custo); 
    }
    
    public double descontoFGTS(double custo){
        if (custo <= 375.00){
            return 7.65;
        }
        else if(custo < 410.00){
            return 8.65;
        }
        else if(custo <= 625.00){
            return 9.00;
        }
        else{
            return 11.00;
        }
    }
    
    public double salarioLiquido(double custo, double valeTransporte, double valeRefeicao){
        return custo - descontoFGTS(custo) + valeTransporte + valeRefeicao;
    }
    
   
    public double custoTotalEmpresa(){
        return salarioLiquido(custo, valeTransporte, valeRefeicao) + totalEncargos(custo);
    }

}
