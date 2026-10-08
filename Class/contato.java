package Class;

public class contato extends PF {
    private String Telefone;
    private String email;
    private String endereco;
    private String observacao;
    public String getTelefone() {
        return Telefone;
    }
    
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getObservacao() {
        return observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}