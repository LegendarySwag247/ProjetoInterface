package Telas;
import PacoteClasses.ClassDAO;
import PacoteClasses.Lista;
import PacoteClasses.Task;
import java.util.List;

import javax.swing.JOptionPane;

public class Editar extends javax.swing.JFrame {
    private int id;
    private String list_name;
    private String tipo;
    private String titulo;
    private String data_horario;
    
    public Editar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        camp_titulo = new javax.swing.JTextField();
        camp_tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        box_concluido = new javax.swing.JCheckBox();
        bt_confirmar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_confirmar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Tarefa");

        jPanel2.setBackground(new java.awt.Color(129, 205, 207));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(198, 242, 250));
        jLabel1.setFont(new java.awt.Font("SWRomnc", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Tarefa");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Título:");

        camp_titulo.setToolTipText("Insira para editar o título");
        camp_titulo.setNextFocusableComponent(camp_tipo);

        camp_tipo.setToolTipText("Insira para editar o tipo (Compromisso ou Rotina).");
        camp_tipo.setNextFocusableComponent(camp_titulo);

        jLabel3.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo de tarefa:");

        box_concluido.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        box_concluido.setText("Concluída");
        box_concluido.setToolTipText("Se a tarefa foi concluída.");

        bt_confirmar.setBackground(new java.awt.Color(202, 237, 238));
        bt_confirmar.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        bt_confirmar.setText("Confirmar");
        bt_confirmar.setToolTipText("Confirmar.");
        bt_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(camp_tipo)
                                .addComponent(camp_titulo)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                            .addComponent(box_concluido)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(bt_confirmar)))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camp_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camp_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_concluido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_confirmar)
                .addGap(12, 12, 12))
        );

        jMenuBar1.setBackground(new java.awt.Color(198, 242, 250));

        menu.setText("Ajuda");

        menu_confirmar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        menu_confirmar.setText("Confirmar");
        menu_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_confirmarActionPerformed(evt);
            }
        });
        menu.add(menu_confirmar);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_confirmarActionPerformed
        Confirmar();
    }//GEN-LAST:event_bt_confirmarActionPerformed

    private void menu_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_confirmarActionPerformed
        Confirmar();
    }//GEN-LAST:event_menu_confirmarActionPerformed

    public void abrir(Editar editar, int id,String list_name, String titulo, String tipo, String opcao, String data_horario){
        camp_titulo.setText(titulo);
        camp_tipo.setText(tipo);
        if(tipo.equals("ROTINA") && opcao.equals("s")){
            box_concluido.setEnabled(false);
            box_concluido.setSelected(true);
        }
        
        if (opcao.equals("s")){
            box_concluido.setSelected(true);
        }else{
            box_concluido.setSelected(false);
        }
        
        editar.setVisible(true);
        setId(id);
        setListName(list_name);
        setTitulo(titulo);
        setTipo(tipo);
        setData_Horario(data_horario);
        
    }
    
    public void setListName(String _list_name){
        list_name = _list_name;
    }
    
    public void setId(int _id){
        id = _id;
    }
    
    public void setTitulo(String _titulo){
        titulo = _titulo;
    }
    
    public void setTipo(String _tipo){
        tipo = _tipo;
    }
    
    public void setData_Horario(String _data_horario){
        data_horario = _data_horario;
    }
    
    public String getListName(){
        return list_name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String data_horario(){
        return data_horario;
    }
    
    public void Confirmar(){
        List<Lista> listas = Lista.ListarLista();
        List<Task> tasks = Lista.ListarTask();
        ClassDAO dao;
        String opcao;
        String txt_titulo = camp_titulo.getText();
        String txt_tipo = camp_tipo.getText();
        
        boolean concluido = box_concluido.isSelected();
        
        if (concluido == true){
            opcao = "s";
        }else{
            opcao = "n";
        }
        
        String upper = txt_tipo.toUpperCase();
        boolean match_tipo = upper.matches("^(COMPROMISSO|ROTINA)$");
        
        if (txt_titulo.isEmpty() || txt_tipo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os dados!");
        }else if(match_tipo == false){
            JOptionPane.showMessageDialog(null, "Por favor preencha os dados escolhendo duas opcoes: 'Compromisso' ou 'Rotina'.");
        }else{
            
            for (Lista lista : listas){
                if(lista.getNome().equals(getListName()) && lista.getId() == getId()){
                    for(Task task : tasks){
                        if( task.getTitulo().equals(getTitulo()) && task.getTipo().equals(getTipo())){
                            String horario_data;
                            if(upper.equals("COMPROMISSO")){
                                boolean match_h = false;
                                
                                do{
                                    
                                    horario_data = JOptionPane.showInputDialog("Digite o horário e data.");
                                    match_h = horario_data.matches("[0-9]{2}[:][0-9]{2}[-][0-9]{2}[/][0-9]{2}[/][0-9]{4}");
                                    
                                    if(match_h == false){
                                        JOptionPane.showMessageDialog(null, "Por favor preencha os dados da seguinte forma: 'hh:mm-dd/mm/aaaa'.");
                                    }
                                    
                                }while(match_h == false);
                                
                            }else{
                                horario_data = "-";
                            }
                            
                            Inicial.atualizar(txt_titulo, upper, opcao, horario_data);
                            
                            task.setTitulo(txt_titulo);
                            task.setTipo(upper);
                            task.setConcluido(opcao);
                            
                            task.editarDados(getListName(), getTitulo(), getTipo(), txt_titulo, upper, opcao, horario_data);
                            dao = new ClassDAO();
                            boolean conectar = dao.connection();
                            if(conectar == true){
                                int status = dao.atualizarDadosTask(getListName(), getTitulo(), getTipo(), task);
                                if(status == 1){
                                    System.out.println("Atualizado com sucesso!");
                                }
                            }
                            dao.disconnect();
                        }
                    }
                }
            }
            //task.salvarDados(task, getListName(), getId());
            JOptionPane.showMessageDialog(null, "Sua tarefa foi editado.");
            dispose();
        }
    }
    
    //public void setTask(Task task){
        //this.task = task;
    //}
    
    //public Task getTask(){
        //return task;
    //}
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_concluido;
    private javax.swing.JButton bt_confirmar;
    private javax.swing.JTextField camp_tipo;
    private javax.swing.JTextField camp_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menu_confirmar;
    // End of variables declaration//GEN-END:variables
}
