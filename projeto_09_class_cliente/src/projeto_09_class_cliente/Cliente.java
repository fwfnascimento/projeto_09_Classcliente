/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_09_class_cliente;

/**
 *
 * @author aluno
 */
public class Cliente {
     //Atributos que podem ser privados ou publicos(modificador)
        //Por definição no java os Atributos sempre serao PRIVATE
        
        private String RG;
        private String nome;
        private String cpf;
        private String cidade;
        private String estado;

// metodos podem ser public ou private(modificador)
//por definiçao no java os metodos serao PUBLIC
// CONSTRUTORES
        //cheio
        public Cliente (String RG, String nome, String cpf, String cidade, String estado){
            this.RG = RG;
            this.nome = nome;
            this.cpf = cpf;
            this.cidade = cidade;
            this.estado = estado;
        }
        //vazio
        public Cliente(){
        }
//GETTERS E SETTERS
        public String getRG(){
            return this.RG;
}
 public void setRG(String RG){
     this.RG = RG;
     
 }
 public String getnome(){
            return this.RG;
}
 public void setnome(String RG){
     this.RG = RG;
     
 }
 public String getcpf(){
            return this.RG;
}
 public void setcpf(String RG){
     this.RG = RG;
     
 }
 public String getcidade(){
            return this.RG;
}
 public void setcidade(String RG){
     this.RG = RG;
     
 }
 public String getestado(){
            return this.RG;
}
 public void setestado(String RG){
     this.RG = RG;
     
 }
}