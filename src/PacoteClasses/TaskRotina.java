
package PacoteClasses;

public class TaskRotina extends Task{

    public TaskRotina(String titulo, String tipo, String concluido) {
        super(titulo, tipo, concluido);
    }

    @Override
    public void marcarTask(Task task) {
        task.setConcluido("sim");
    }

    @Override
    public String getHorario_Data() {
        return "-";
    }
    
    
}
