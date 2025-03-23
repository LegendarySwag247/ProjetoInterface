
package PacoteClasses;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Usuario {
    private int id;
    private String nome, email, telefone, senha;
    
    public Usuario(int id,String nome, String email, String telefone, String senha){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void salvarDadosUser(Usuario user){
        try{
            String caminho = "./dados/usuario.csv";
            File file = new File(caminho);
            boolean existe = file.exists();
            FileWriter writer = new FileWriter(caminho ,StandardCharsets.ISO_8859_1, existe);
            
            if(existe == false){
                writer.write("Id;Nome;E-mail;Telefone;Senha\n");
            }
            
            writer.write(user.getId()+ ";" + user.getNome() + ";" + user.getEmail() + ";" + user.getTelefone() + ";" + user.getSenha() + "\n");
            
            writer.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
