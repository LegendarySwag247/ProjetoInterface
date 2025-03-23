
package PacoteClasses;
import Telas.Inicial;
import Telas.Erro;
import Telas.Login;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lista {
    
    private int id;
    private String nome;
    private static final List<Lista> listas = new ArrayList<>();
    private static final List<Task> tasks = new ArrayList<>();
    private static final List<Usuario> users = new ArrayList<>();
    
    public Lista(int id,String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    //funcionalidades do programa
    public void editar( String velho_tit, String velho_tip, String novo_tit, String novo_tip, String opcao){
        for(Task task : tasks){
            if(task.getTitulo().equals(velho_tit) && task.getTipo().equals(velho_tip)){
                task.setTitulo(novo_tit);
                task.setTipo(novo_tip);
                task.setConcluido(opcao);
                task.marcarTask(task);
            }
        }
    }
    
    public static List<Usuario> ListarUser(){
        users.clear();
        String caminho = "./dados/usuario.csv";
        try{
            FileReader fr = new FileReader (caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            boolean primeira = true;// quando ha conversao de dados.
            while((linha = br.readLine()) != null){
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
                
                Usuario user = new Usuario(id, nome, email, telefone, senha);
                Lista.adicionarUsers(user);
                
            }
       
            
            br.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return users;
    }
    
    public static List<Lista> ListarLista(){
        listas.clear();
        String caminho = "./dados/tarefas.csv";
        try{
            FileReader fr = new FileReader (caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            boolean primeira = true;
            while((linha = br.readLine()) != null){
                if(primeira){
                    primeira = false;
                    continue;
                }
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);// id da lista
                String nome = partes[1]; // nome da lista.
                //String titulo = partes[2];
                
                boolean jaExiste = false;
                
                Lista l = new Lista(id, nome);
                
                for (Lista l_lista : listas){
                    if (l_lista.getId() == id && l_lista.getNome().equalsIgnoreCase(nome)){
                        jaExiste = true;
                        break;
                    }
                }
                
                if(jaExiste == false){
                    Lista.adicionarLista(l);
                }
                
            }
            br.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return listas;
    }
    
    
    public static List<Task> ListarTask(){
        tasks.clear();
        String caminho = "./dados/tarefas.csv";
        try{
            FileReader fr = new FileReader (caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            boolean primeira = true;
            while((linha = br.readLine()) != null){
                if(primeira){
                    primeira = false;
                    continue;
                }
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);// id da lista
                String nome = partes[1]; // nome da lista.
                String titulo = partes[2];
                String tipo = partes[3];
                String concluido = partes[4];
                String horario_data = partes[5];
                
                
                if(tipo.equals("COMPROMISSO")){
                    Task task_c = new TaskCompromisso(titulo, tipo, concluido, horario_data);
                    Lista.adicionarTarefa(task_c);
                }else{
                    Task task_r = new TaskRotina(titulo, tipo, concluido);
                    Lista.adicionarTarefa(task_r);
                }
                
            }
            br.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return tasks;
    }
    
    public static List<Task> CarregarTask(int lista_id, String lista_nome){
        String caminho = "./dados/tarefas.csv";
        try{
            FileReader fr = new FileReader (caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            boolean primeira = true;
            while((linha = br.readLine()) != null){
                if(primeira){
                    primeira = false;
                    continue;
                }
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);// id da lista
                String nome = partes[1]; // nome da lista.
                String titulo = partes[2];
                String tipo = partes[3];
                String concluido = partes[4];
                String horario_data = partes[5];
                
                if(id == lista_id && nome.equals(lista_nome)){
                    Inicial.adicionarRow(new Object[]{
                        titulo,
                        tipo,
                        concluido,
                        horario_data
                    });
                }
                
            }
            br.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return tasks;
    }
    
    public static List<Usuario> BuscarUser(String e_mail, String password){
        String caminho = "./dados/usuario.csv";
        String name = " ";
        int user_id = 0;
        boolean acesso = false;
        try{
            FileReader fr = new FileReader (caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            boolean primeira = true;// quando ha conversao de dados.
            while((linha = br.readLine()) != null){
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
                
                if(email.equals(e_mail) && senha.equals(password)){
                    acesso = true;
                    name = nome;
                    user_id = id;
                    break;
                }else{
                    acesso = false;
                }
                
                
            }
            
            if(acesso == true){
                Inicial inicial = new Inicial();
                inicial.setVisible(true);
                inicial.colocarNome(name);
                inicial.colocarUserId(user_id);
                inicial.CarregarDadosDaLista();
                //inicial.CarregarDadosDaTarefa();
            }else{
                Erro erro = new Erro();
                erro.setVisible(true);
            }
            
            br.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return users;
    }
    
    public static void adicionarTarefa(Task task){
        tasks.add(task);
    }
    public static void adicionarUsers(Usuario user){
        users.add(user);
    }
    
    public static void adicionarLista(Lista lista){
        listas.add(lista);
    }
    
    public static int adicionarId(){
        String caminho = "./dados/usuario.csv";
        int maiorVal = -1;
        try{
            FileReader fr = new FileReader (caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            boolean primeira = true;
            while((linha = br.readLine()) != null){
                if(primeira){
                    primeira = false;
                    continue;
                }
                
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                
                if(id > maiorVal){
                    maiorVal = id;
                }
                
            }
            
            br.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return maiorVal + 1;
    }
    
}
