package Model;
// Generated Jun 13, 2022 2:31:50 PM by Hibernate Tools 3.6.0



/**
 * Pessoa generated by hbm2java
 */
public class Pessoa  implements java.io.Serializable {


     private Integer idPessoa;
     private String apelido;
     private String nome;

    public Pessoa() {
    }

    public Pessoa(String apelido, String nome) {
       this.apelido = apelido;
       this.nome = nome;
    }
   
    public Integer getIdPessoa() {
        return this.idPessoa;
    }
    
    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }




}

