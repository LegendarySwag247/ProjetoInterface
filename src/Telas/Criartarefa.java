package Telas;
import PacoteClasses.ClassDAO;
import PacoteClasses.Lista;
import PacoteClasses.Task;
import PacoteClasses.TaskCompromisso;
import PacoteClasses.TaskRotina;
import javax.swing.JOptionPane;


public class Criartarefa extends javax.swing.JFrame {
    
    private int id;
    private String nome;
    
    public Criartarefa() {
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
        bt_confirmar = new javax.swing.JButton();
        camp_horariodata = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jLabel1.setText("Criar Tarefa");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        jLabel2.setText("Título:");

        camp_titulo.setToolTipText("Insira o titulo da sua tarefa.");
        camp_titulo.setNextFocusableComponent(camp_tipo);

        camp_tipo.setToolTipText("Insira o tipo para a sua tarefa (Compromisso ou rotina).");
        camp_tipo.setNextFocusableComponent(camp_horariodata);

        jLabel3.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        jLabel3.setText("Tipo(Rotina ou Compromisso):");

        bt_confirmar.setBackground(new java.awt.Color(202, 237, 238));
        bt_confirmar.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        bt_confirmar.setText("Confirmar");
        bt_confirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_confirmar.setOpaque(true);
        bt_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_confirmarActionPerformed(evt);
            }
        });

        camp_horariodata.setToolTipText("Insira o horário e a data se o tipo de tarefa é compromisso (hh:mm-dd/mm/aaaa).");
        camp_horariodata.setNextFocusableComponent(camp_titulo);

        jLabel4.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        jLabel4.setText("Horário e data(para tipo compromisso):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(camp_titulo)
                            .addComponent(camp_tipo)
                            .addComponent(jLabel3)
                            .addComponent(camp_horariodata)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(bt_confirmar)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camp_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camp_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camp_horariodata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_confirmar)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(198, 242, 250));

        menu.setText("Ajuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        jMenuItem1.setText("Confirmar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Confirmar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Confirmar(){
        Task task;
        ClassDAO dao;
        String lista_nome = getNome();
        int lista_id = getId();
        String concluido = "n";
        String txt_titulo = camp_titulo.getText();
        String txt_tipo = camp_tipo.getText();
        String txt_horario = camp_horariodata.getText();
        
        String upper = txt_tipo.toUpperCase();
        
        boolean match_tipo = upper.matches("^(COMPROMISSO|ROTINA)$");
        boolean match_horario = txt_horario.matches("[0-9]{2}[:][0-9]{2}[-][0-9]{2}[/][0-9]{2}[/][0-9]{4}");
        
        if (txt_titulo.isEmpty() || txt_tipo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os dados!");
        }else if(match_tipo == false){
            JOptionPane.showMessageDialog(null, "Por favor preencha os dados escolhendo duas opcoes: 'Compromisso' ou 'Rotina'.");
        }else if((match_horario == false || txt_horario.isEmpty()) && upper.equals("COMPROMISSO")){
            JOptionPane.showMessageDialog(null, "Por favor preencha os dados da seguinte forma: 'hh:mm-dd/mm/aaaa' ");
        }else{
            JOptionPane.showMessageDialog(null, "Sua tarefa foi criado.");
            if(upper.equals("COMPROMISSO")){
                task = new TaskCompromisso(txt_titulo,upper,concluido,txt_horario);
            }else{
                task = new TaskRotina(txt_titulo, upper, concluido);
            }
            
            Lista.adicionarTarefa(task);
            
            task.salvarDados(task, lista_nome, lista_id);
            
            dao = new ClassDAO(); 
            boolean connectar = dao.connection();
            
            if(connectar == true){
                int status = dao.inserirListaTask(lista_id, lista_nome, task);
                if(status == 1){
                    System.out.println("Salvo no banco!");
                }else{
                    System.out.println("Problema ao insrir tarefa.");
                }
            }
            
            Inicial.adicionarRow(new Object[]{
                task.getTitulo(),
                task.getTipo(),
                task.getConcluido(),
                task.getHorario_Data()
            });
            
            dao.disconnect();
            dispose();
        }
    }
    
    public void abrir(Criartarefa criar,int id,String nome){
        criar.setVisible(true);
        setNome(nome);
        setId(id);
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
    public void setId(int _id){
        id = _id;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
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
            java.util.logging.Logger.getLogger(Criartarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Criartarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Criartarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Criartarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Criartarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_confirmar;
    private javax.swing.JTextField camp_horariodata;
    private javax.swing.JTextField camp_tipo;
    private javax.swing.JTextField camp_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menu;
    // End of variables declaration//GEN-END:variables
}
