
package PacoteClasses;

public class TaskCompromisso extends Task {
    
    private String data_horario;
    
    public TaskCompromisso(String titulo, String tipo,String concluido, String data_horario) {
        super(titulo, tipo, concluido);
        this.data_horario = data_horario;
    }
    
    @Override
    public String getHorario_Data(){
        return data_horario;
    }
    
    @Override
    public void marcarTask(Task task) {
        if(task.getConcluido().equals("não")){
            task.setConcluido("sim");
        }else{
            task.setConcluido("não");
        }
    }
    
}
