public class Contato {
private Object nome;
private Object telefone;
private Object email;

public Contato(){

}
public Contato(Object nome, Object telefone, Object email){
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
}

    public Object getNome() {
        return nome;
    }

    public Object getTelefone() {

    return telefone;
    }

    public void setTelefone(Object telefone) {

    this.telefone = telefone;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {

    this.email = email;
    }

    public void setNome(Object nome) {

    this.nome = nome;
    }
    @Override
    public String toString(){
    return "Contato{" + " nome = " + nome + ", telefone = " + telefone + ", email = "+email +", }";
    }
}
