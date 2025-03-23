
package PacoteClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClassDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet re;
    
    public boolean connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo_db","root", "W<Uxg8fx5Y~)ce1$");
            System.out.println("Conectado com sucesso!");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao conectar.");
            return false;
        }
    }
    
    public int inserirUsuario(Usuario user){
        int status;
        try{
            ps = con.prepareStatement("INSERT INTO usuario (id, nome, email, telefone, senha) VALUES(?,?,?,?,?)");
            ps.setInt(1, user.getId());
            ps.setString(2, user.getNome());
            ps.setString(3, user.getEmail());
            ps.setString(4,user.getTelefone());
            ps.setString(5, user.getSenha());
            status = ps.executeUpdate();
            return status;
        }catch(SQLException ex){
            System.out.println("Erro ao inserir dados: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    public int inserirListaTask(int lista_id,String lista_nome,Task task){
        int status;
        try{
            ps = con.prepareStatement("INSERT INTO lista_tarefa (lista_id, nome_lista, titulo_tarefa, tipo_tarefa, concluido_tarefa, Horario_data) VALUES(?,?,?,?,?,?)");
            ps.setInt(1, lista_id);
            ps.setString(2, lista_nome);
            ps.setString(3, task.getTitulo());
            ps.setString(4, task.getTipo());
            ps.setString(5, task.getConcluido());
            ps.setString(6, task.getHorario_Data());
            status = ps.executeUpdate();
            return status;
        }catch(SQLException ex){
            System.out.println("Erro ao inserir dados: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    public int atualizarDadosTask(String lista_nome, String titulo_task, String tipo_task,Task task){
        int status;
        try{
            ps = con.prepareStatement("UPDATE lista_tarefa SET titulo_tarefa = ?, tipo_tarefa = ?, concluido_tarefa = ?, Horario_data = ? WHERE nome_lista = ? AND titulo_tarefa = ? AND tipo_tarefa = ?");
            ps.setString(1, task.getTitulo());
            ps.setString(2, task.getTipo());
            ps.setString(3, task.getConcluido());
            ps.setString(4, task.getHorario_Data());
            ps.setString(5, lista_nome);
            ps.setString(6, titulo_task);
            ps.setString(7, tipo_task);
            status = ps.executeUpdate();
            return status;
        }catch(SQLException ex){
            System.out.println("Erro ao inserir dados: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    public boolean excluirDadosTask(Task task){
        try{
            ps = con.prepareStatement("DELETE FROM lista_tarefa WHERE titulo_tarefa = ? AND tipo_tarefa = ? AND concluido_tarefa = ? AND Horario_data = ?");
            ps.setString(1, task.getTitulo());
            ps.setString(2, task.getTipo());
            ps.setString(3, task.getConcluido());
            ps.setString(4, task.getHorario_Data());
            ps.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println("Houve um problema na hora de exclusao: " + ex.getMessage());
            return false;   
        }
    }
    
    public void lerArquivoUsuario(){
        String caminho = "./dados/usuario.csv";
        try{
            FileInputStream arquivo = new FileInputStream(caminho);
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            
            boolean variavel = connection(), primeira = true, verificar = verificarUsuariodb();
            
            if(variavel == true && verificar == true){
                while ((linha = br.readLine()) != null){
                    if(primeira){
                        primeira = false;
                        continue;
                    }
                    
                    String[] partes = linha.split(";");
                    
                    int id = Integer.parseInt(partes[0]);
                    String nome = partes[1];
                    String email = partes[2];
                    String telefone = partes[3];
                    String senha = partes[4];
                    
                    String sql = "INSERT INTO usuario (id, nome, email, telefone, senha) VALUES(?,?,?,?,?)";
                    
                    ps = con.prepareStatement(sql);
                    ps.setInt(1, id);
                    ps.setString(2, nome);
                    ps.setString(3, email);
                    ps.setString(4, telefone);
                    ps.setString(5, senha);
                    
                    ps.executeUpdate();
                }
            }
            disconnect();
        }catch(IOException | SQLException ex){
            System.out.println("Erro ao inserir dados ao carregar ou na localizacao da pasta: " + ex.getMessage());
        }
    }
    
    public void lerArquivoTaskLista(){
        String caminho = "./dados/tarefas.csv";
        try{
            FileInputStream arquivo = new FileInputStream(caminho);
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            
            boolean variavel = connection(), primeira = true, verificar = verificarListaTaskdb();
            
            if(variavel == true && verificar == true){
                while ((linha = br.readLine()) != null){
                    if(primeira){
                        primeira = false;
                        continue;
                    }
                    
                    String[] partes = linha.split(";");
                    
                    int lista_id = Integer.parseInt(partes[0]);
                    String lista_nome = partes[1];
                    String task_titulo = partes[2];
                    String task_tipo = partes[3];
                    String task_concluido = partes[4];
                    String task_Horario = partes[5];
                    
                    String sql = "INSERT INTO lista_tarefa(lista_id, nome_lista, titulo_tarefa, tipo_tarefa, concluido_tarefa, Horario_data) VALUES(?,?,?,?,?,?)";
                    
                    ps = con.prepareStatement(sql);
                    ps.setInt(1, lista_id);
                    ps.setString(2, lista_nome);
                    ps.setString(3, task_titulo);
                    ps.setString(4, task_tipo);
                    ps.setString(5, task_concluido);
                    ps.setString(6, task_Horario);
                    
                    ps.executeUpdate();
                }
            }
            disconnect();
        }catch(IOException | SQLException ex){
            System.out.println("Erro ao inserir dados ao carregar ou na localizacao da pasta: " + ex.getMessage());
        }
    }
    
    public void escreverDadosUsuario(){
        try{
            String caminho = "./dados/usuario.csv";
            File file = new File(caminho);
            boolean existe = file.exists();
            FileWriter writer = new FileWriter(caminho ,StandardCharsets.ISO_8859_1, existe);
            
            String linha;
            String sql = "SELECT * FROM usuario";
            
            boolean conexao = connection();
            if(conexao == true && existe == false){
                
                ps = con.prepareStatement(sql);
                re = ps.executeQuery();
                
                writer.write("Id;Nome;E-mail;Telefone;Senha\n");
                
                while(re.next()){
                    int id = re.getInt("id");
                    String nome = re.getString("nome");
                    String email = re.getString("email");
                    String telefone = re.getString("telefone");
                    String senha = re.getString("senha");
                    
                    writer.write(id+ ";" + nome + ";" + email + ";" + telefone + ";" + senha + "\n");
                    
                }
                
            }
            writer.close();
            disconnect();
        }catch(IOException | SQLException ex ){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    public void escreverDadosTarefa(){
        try{
            String caminho = "./dados/tarefas.csv";
            File file = new File(caminho);
            boolean existe = file.exists();
            FileWriter writer = new FileWriter(caminho ,StandardCharsets.ISO_8859_1, existe);
            
            String linha;
            
            String sql = "SELECT * FROM lista_tarefa";
            boolean conexao = connection();
            
            if(conexao == true && existe == false){
                
                ps = con.prepareStatement(sql);
                re = ps.executeQuery();
                
                writer.write("Id;Lista;Titulo;Tipo;Concluido;Horario_e_data\n");
                
                while(re.next()){
                    int lista_id = re.getInt("lista_id");
                    String lista_nome = re.getString("nome_lista");
                    String tarefa_titulo = re.getString("titulo_tarefa");
                    String tarefa_tipo = re.getString("tipo_tarefa");
                    String tarefa_concluido = re.getString("concluido_tarefa");
                    String horario = re.getString("Horario_data");
                    writer.write(lista_id+ ";" + lista_nome + ";" + tarefa_titulo + ";" + tarefa_tipo + ";" + tarefa_concluido + ";"+ horario + "\n");           
                }
            }
            writer.close();
            disconnect();
        }catch(IOException | SQLException ex ){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    public boolean verificarUsuariodb(){
        boolean situacao = false;
        try{
            String sql = "SELECT COUNT(*) AS total FROM usuario";
            ps = con.prepareStatement(sql);
            re = ps.executeQuery();
            
            if(re.next()){
                int totalRe = re.getInt("total");
                if (totalRe > 0){
                    situacao = false;
                }else{
                    situacao = true;
                }
            }
            return situacao;
        }catch(SQLException ex){
            System.out.println("ERRO NO SQL");
            situacao = false;
            return situacao;
        }
    }
    
    public boolean verificarListaTaskdb(){
        boolean situacao = false;
        try{
            String sql = "SELECT COUNT(*) AS total FROM lista_tarefa";
            ps = con.prepareStatement(sql);
            re = ps.executeQuery();
            
            if(re.next()){
                int totalRe = re.getInt("total");
                if (totalRe > 0){
                    situacao = false;
                }else{
                    situacao = true;
                }
            }
            return situacao;
        }catch(SQLException ex){
            System.out.println("ERRO NO SQL");
            situacao = false;
            return situacao;
        }
    }
    
    public void disconnect(){
        try{
            con.close();
            System.out.println("Banco de dados desconectado!");
        }catch(SQLException ex){
            System.out.println("Houve um erro ao desconectar!");
        }
    }
}
