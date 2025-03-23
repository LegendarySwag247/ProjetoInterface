package Telas;
import PacoteClasses.ClassDAO;
import PacoteClasses.Lista;
import PacoteClasses.Task;
import PacoteClasses.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Inicial extends javax.swing.JFrame {

    static DefaultListModel<String> modelo_lista;
    static DefaultTableModel model;
    private String l_name_select;
    private String _titulo;
    private String _tipo;
    private int id;
    
    public Inicial() {
        initComponents();
        modelo_lista = new DefaultListModel<>();
        model = (DefaultTableModel)table_tarefas.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bt_criarl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        list_lista = new javax.swing.JList<>();
        label_usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_tarefas = new javax.swing.JTable();
        bt_criartarefas = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_deletar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_sair = new javax.swing.JMenuItem();
        menu_criarlist = new javax.swing.JMenuItem();
        menu_criartarefa = new javax.swing.JMenuItem();
        menu_deletar = new javax.swing.JMenuItem();
        menu_editar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicial");

        jPanel2.setBackground(new java.awt.Color(129, 205, 207));

        bt_criarl.setBackground(new java.awt.Color(202, 237, 238));
        bt_criarl.setFont(new java.awt.Font("SWRomnc", 0, 12)); // NOI18N
        bt_criarl.setText("Criar");
        bt_criarl.setToolTipText("Criar lista");
        bt_criarl.setOpaque(true);
        bt_criarl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_criarlActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(123, 233, 241));
        jLabel1.setFont(new java.awt.Font("SWRomnc", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("To-Do");
        jLabel1.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("SWRomnc", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bem-Vindo");

        bt_sair.setBackground(new java.awt.Color(253, 160, 160));
        bt_sair.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.setToolTipText("Sair da sua conta.");
        bt_sair.setOpaque(true);
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        JScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

        list_lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_lista.setToolTipText("Aqui estão as listas.");
        list_lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_listaValueChanged(evt);
            }
        });
        JScrollPane.setViewportView(list_lista);

        label_usuario.setFont(new java.awt.Font("SWRomnc", 0, 10)); // NOI18N
        label_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_usuario.setText("Usuário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_criarl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_criarl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(198, 242, 250));
        jLabel2.setFont(new java.awt.Font("SWRomnc", 0, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tarefas");
        jLabel2.setOpaque(true);

        table_tarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Tipo", "Concluído", "Horário e Data"
            }
        ));
        table_tarefas.setToolTipText("Aqui ficam as tarefas.");
        jScrollPane1.setViewportView(table_tarefas);

        bt_criartarefas.setBackground(new java.awt.Color(202, 237, 238));
        bt_criartarefas.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        bt_criartarefas.setText("Criar Tarefa");
        bt_criartarefas.setToolTipText("Criar Tarefa");
        bt_criartarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_criartarefasActionPerformed(evt);
            }
        });

        bt_editar.setBackground(new java.awt.Color(255, 255, 153));
        bt_editar.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        bt_editar.setText("Editar Tarefa");
        bt_editar.setToolTipText("Selecione uma tarefa para editar.");
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_deletar.setBackground(new java.awt.Color(253, 160, 160));
        bt_deletar.setFont(new java.awt.Font("SWRomnc", 0, 18)); // NOI18N
        bt_deletar.setText("Deletar Tarefa");
        bt_deletar.setToolTipText("Selecione uma tarefa para deletar.");
        bt_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_criartarefas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_deletar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_criartarefas)
                    .addComponent(bt_editar)
                    .addComponent(bt_deletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(198, 242, 250));

        menu.setText("Ajuda");

        menu_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menu_sair.setText("Sair");
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });
        menu.add(menu_sair);

        menu_criarlist.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_criarlist.setText("Criar lista");
        menu_criarlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_criarlistActionPerformed(evt);
            }
        });
        menu.add(menu_criarlist);

        menu_criartarefa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_criartarefa.setText("Criar tarefa");
        menu_criartarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_criartarefaActionPerformed(evt);
            }
        });
        menu.add(menu_criartarefa);

        menu_deletar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_deletar.setText("Deletar Tarefa");
        menu_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_deletarActionPerformed(evt);
            }
        });
        menu.add(menu_deletar);

        menu_editar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_editar.setText("Editar Tarefa");
        menu_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editarActionPerformed(evt);
            }
        });
        menu.add(menu_editar);

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

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
       Sair();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_criartarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_criartarefasActionPerformed
        CriarTarefa();
    }//GEN-LAST:event_bt_criartarefasActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        Editar();
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deletarActionPerformed
        Deletar();
    }//GEN-LAST:event_bt_deletarActionPerformed

    private void bt_criarlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_criarlActionPerformed
        CriarLista();
    }//GEN-LAST:event_bt_criarlActionPerformed

    private void list_listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_listaValueChanged
        model.setRowCount(0);
        CarregarDadosDaTarefa();
    }//GEN-LAST:event_list_listaValueChanged

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        Sair();
    }//GEN-LAST:event_menu_sairActionPerformed

    private void menu_criarlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_criarlistActionPerformed
        CriarLista();
    }//GEN-LAST:event_menu_criarlistActionPerformed

    private void menu_criartarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_criartarefaActionPerformed
        CriarTarefa();
    }//GEN-LAST:event_menu_criartarefaActionPerformed

    private void menu_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_deletarActionPerformed
        Deletar();
    }//GEN-LAST:event_menu_deletarActionPerformed

    private void menu_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editarActionPerformed
        Editar();
    }//GEN-LAST:event_menu_editarActionPerformed

    private void Sair(){
       int res = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja sair?");
       Login login = new Login();
       if (res == JOptionPane.YES_OPTION){
           id = -1;
           modelo_lista.clear();
           //System.out.println("Tamanho do modelo depois: " + modelo_lista.getSize());
           dispose();
           login.setVisible(true);
       } 
    }
    
    public void CriarLista(){
        try{
            Lista _lista;
            String nome;
            boolean vazio = true;
        
            do{
                nome = JOptionPane.showInputDialog(null, "Digite o nome para a sua lista.");
                vazio = nome.isEmpty();
                if (vazio == true){
                    JOptionPane.showMessageDialog(null, "Por favor preencha o nome para a sua lista.");
                }else{
                    modelo_lista.addElement(nome);
                    list_lista.setModel(modelo_lista);
                    _lista = new Lista(id,nome);
                    Lista.adicionarLista(_lista);
                }
            }while(vazio);
        }catch(NullPointerException e){
        }
    }
    
    public void CriarTarefa(){
        Criartarefa criar = new Criartarefa();
        if (list_lista.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das listas.");
        }else{
            l_name_select = list_lista.getSelectedValue();
            criar.abrir(criar, getUserId(),getListSelectedName());
            //System.out.println(id + " " + l_name_select);
        }
    }
    
    public void Deletar(){
        ClassDAO dao = new ClassDAO();
        List<Lista> listas = Lista.ListarLista();
        List<Task> tasks = Lista.ListarTask();
        try{
            int row = table_tarefas.getSelectedRow();
            boolean conectar = dao.connection();
            String nome = list_lista.getSelectedValue();
            String titulo = table_tarefas.getValueAt(row, 0).toString();
            String tipo = table_tarefas.getValueAt(row, 1).toString();
            for (Lista lista : listas){
                if(lista.getNome().equals(nome)){
                    for (Task task : tasks){
                        if(task.getTitulo().equals(titulo) && task.getTipo().equals(tipo)){
                            int res = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja deletar a tarefa?");
                            if (res == JOptionPane.YES_OPTION){
                                task.exclirDados( nome, titulo, tipo);
                                if (conectar == true){
                                    boolean excluido = dao.excluirDadosTask(task);
                                    if(excluido == true){
                                        System.out.println("Dado excluido!");
                                        
                                    }else{
                                        System.out.println("Problema na exclusao.");
                                    }
                                }
                                dao.disconnect();
                                retirarRow(row);
                            }
                            break;
                        }
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das tarefas para excluir.");
        }
    }
    
    public void Editar(){
        Editar editar = new Editar();
        try{
            if (list_lista.isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor selecione uma das listas.");
            }else{
                
                int row = table_tarefas.getSelectedRow();
                String opcao = table_tarefas.getValueAt(row, 2).toString();
                String data_horario = table_tarefas.getValueAt(row, 3).toString();
                
                if(table_tarefas.isRowSelected(row)){
                    l_name_select = list_lista.getSelectedValue();
                    colocar_Titulo(row);
                    colocar_Tipo(row);
                    editar.abrir(editar, getUserId(),getListSelectedName(), get_Titulo(), get_tipo(), opcao, data_horario);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor selecione uma linha da tabela.");
                }
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor selecione uma tarefa.");
        }
    }
    
    public void colocarNome(String name){
        label_usuario.setText(name);
    }
    
    public void colocarUserId(int user_id){
        id = user_id;
    }
    
    public void colocar_Titulo(int row){
        _titulo = table_tarefas.getValueAt(row, 0).toString();
    }
    
    public void colocar_Tipo(int row){
        _tipo = table_tarefas.getValueAt(row, 1).toString();
    }
    
    public int getUserId(){
        return id;
    }
    
    public String get_Titulo(){
        return _titulo;
    }
    
    public String get_tipo(){
        return _tipo;
    }
    
    public String getListSelectedName(){
        return l_name_select;
    }
    
    public static void atualizar(String txt_titulo, String txt_tipo , String opcao, String data){
        model.setValueAt(txt_titulo, table_tarefas.getSelectedRow(), 0);
        model.setValueAt(txt_tipo, table_tarefas.getSelectedRow(), 1);
        model.setValueAt(opcao, table_tarefas.getSelectedRow(), 2);
        model.setValueAt(data, table_tarefas.getSelectedRow(), 3);
    }
    
    public static void adicionarRow(Object[] dataRow){
        model.addRow(dataRow);
    }
    
    public void retirarRow(int selectedRow){
        model.removeRow(selectedRow);
    }
    
    public void adicionarList(String lista_nome){
        modelo_lista.addElement(lista_nome);
    }
    
    public void CarregarDadosDaLista(){
        List<Usuario> users = Lista.ListarUser();
        List<Lista> listas = Lista.ListarLista();
        
            for (Usuario _user : users){
                if(_user.getId() == id){
                    for (Lista _lista : listas){
                        if (_user.getId() == _lista.getId()){
                            modelo_lista.addElement(_lista.getNome().trim());
                        }
                    }
                    break;
                }
            }
        list_lista.setModel(modelo_lista);
        //System.out.println("Tamanho do modelo antes: " + modelo_lista.getSize());
    }
    
    public void CarregarDadosDaTarefa(){
            Lista.CarregarTask(id, list_lista.getSelectedValue());
        
        
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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton bt_criarl;
    private javax.swing.JButton bt_criartarefas;
    private javax.swing.JButton bt_deletar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JList<String> list_lista;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menu_criarlist;
    private javax.swing.JMenuItem menu_criartarefa;
    private javax.swing.JMenuItem menu_deletar;
    private javax.swing.JMenuItem menu_editar;
    private javax.swing.JMenuItem menu_sair;
    private static javax.swing.JTable table_tarefas;
    // End of variables declaration//GEN-END:variables
}
