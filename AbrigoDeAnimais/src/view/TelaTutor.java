/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entities.Tutor;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TelaTutor extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaTutor() {
        initComponents();
        Tutor.cadastrarTutor("Yngred", "Soares", "717171", 20);
        Tutor.cadastrarTutor("Mauri", "Volpato", "88956", 23);
        Tutor.cadastrarTutor("Jeremias", "", "", 60);   
        txtAreaTutores.setText(Tutor.exibirTutores());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEncerrarSessao = new javax.swing.JButton();
        btnVoltarAoMenuPrincipal = new javax.swing.JButton();
        painalListaTutores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTutores = new javax.swing.JTextArea();
        txtTituloLista = new javax.swing.JLabel();
        comboBoxTutores = new javax.swing.JComboBox<>();
        txtBuscarTutor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditarTutor = new javax.swing.JButton();
        btnArquivarTutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Siemens Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABRIGO DE ANIMAIS");

        btnEncerrarSessao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEncerrarSessao.setText("X");
        btnEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarSessaoActionPerformed(evt);
            }
        });

        btnVoltarAoMenuPrincipal.setText("MENU PRINCIPAL");
        btnVoltarAoMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAoMenuPrincipalActionPerformed(evt);
            }
        });

        painalListaTutores.setBackground(new java.awt.Color(102, 0, 51));

        txtAreaTutores.setBackground(new java.awt.Color(102, 0, 51));
        txtAreaTutores.setColumns(20);
        txtAreaTutores.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtAreaTutores.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaTutores.setRows(5);
        jScrollPane1.setViewportView(txtAreaTutores);

        txtTituloLista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloLista.setForeground(new java.awt.Color(255, 255, 0));
        txtTituloLista.setText("LISTA DE TUTORES:");

        comboBoxTutores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ATIVOS", "ARQUIVADOS" }));
        comboBoxTutores.setSelectedIndex(1);
        comboBoxTutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTutoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painalListaTutoresLayout = new javax.swing.GroupLayout(painalListaTutores);
        painalListaTutores.setLayout(painalListaTutoresLayout);
        painalListaTutoresLayout.setHorizontalGroup(
            painalListaTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painalListaTutoresLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(painalListaTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painalListaTutoresLayout.createSequentialGroup()
                        .addComponent(txtTituloLista, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxTutores, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        painalListaTutoresLayout.setVerticalGroup(
            painalListaTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painalListaTutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painalListaTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTituloLista)
                    .addComponent(comboBoxTutores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditarTutor.setText("EDITAR");
        btnEditarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTutorActionPerformed(evt);
            }
        });

        btnArquivarTutor.setText("ARQUIVAR");
        btnArquivarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivarTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnVoltarAoMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(painalListaTutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArquivarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarAoMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArquivarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(painalListaTutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnArquivarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivarTutorActionPerformed
        if(txtBuscarTutor.getText().equalsIgnoreCase("")|| txtBuscarTutor.getText().equalsIgnoreCase("Digite o id...")){
            JOptionPane.showMessageDialog(null, "Escolha um tutor para realizar a ação");
            txtBuscarTutor.requestFocus();
        } else {
            String nome = txtBuscarTutor.getText();
            Tutor t = Tutor.buscarTutorPorNome(nome);
            Tutor.arquivarTutor(t);
            JOptionPane.showMessageDialog(null, "Tutor arquivado com sucesso!");
            txtAreaTutores.setText("");
        }
    }//GEN-LAST:event_btnArquivarTutorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //ALTEREI A FUNCIONALIDADE PARA BUSCAR POR NOME
        String nome = txtBuscarTutor.getText();

        if (Tutor.buscarTutorPorNome(nome)!=null){
            Tutor t = Tutor.buscarTutorPorNome(nome);
            txtAreaTutores.setText(t.toString());
            
        } else {
            txtAreaTutores.setText("Tutor nao existe ou esta inativo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarSessaoActionPerformed
        dispose();
    }//GEN-LAST:event_btnEncerrarSessaoActionPerformed

    private void btnVoltarAoMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAoMenuPrincipalActionPerformed
        TelaInicial tela = new TelaInicial();
        this.dispose();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarAoMenuPrincipalActionPerformed

    private void btnEditarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTutorActionPerformed
        if(txtBuscarTutor.getText().equalsIgnoreCase("")|| txtBuscarTutor.getText().equalsIgnoreCase("Digite o nome...")){
            JOptionPane.showMessageDialog(null, "Escolha um tutor para realizar a ação");
            txtBuscarTutor.requestFocus();
        } else {
            int id = Integer.parseInt(txtBuscarTutor.getText());
            Tutor t = Tutor.buscarTutorPorId(id);
            
            
//            Tutor.editarInformacoesTutor(t, nome, sobrenome, telefone, id);
            JOptionPane.showMessageDialog(null, "Informações atualizadas com sucesso");
        }
    }//GEN-LAST:event_btnEditarTutorActionPerformed

    private void comboBoxTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTutoresActionPerformed
        int index = comboBoxTutores.getSelectedIndex();
        switch(index){
            case 0:
                txtAreaTutores.setText(Tutor.exibirTutores());
                txtTituloLista.setText("LISTA DE TUTORES");                
                break;
            case 1:
                txtAreaTutores.setText(Tutor.exibirTutoresAtivos());
                txtTituloLista.setText("LISTA DE TUTORES ATIVOS");
                break;
            case 2: 
                txtAreaTutores.setText(Tutor.exibirTutoresArquivados());
                txtTituloLista.setText("LISTA DE TUTORES ARQUIVADOS");
                break;
        }
    }//GEN-LAST:event_comboBoxTutoresActionPerformed

//    public void limparCamposDeTexto(){
//        txtNomeTutor.setText("");
//        txtSobrenomeTutor.setText("");
//        txtTelefoneTutor.setText("");
//        txtIdadeTutor.setText("");
//    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquivarTutor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarTutor;
    private javax.swing.JButton btnEncerrarSessao;
    private javax.swing.JButton btnVoltarAoMenuPrincipal;
    private javax.swing.JComboBox<String> comboBoxTutores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painalListaTutores;
    private javax.swing.JTextArea txtAreaTutores;
    private javax.swing.JTextField txtBuscarTutor;
    private javax.swing.JLabel txtTituloLista;
    // End of variables declaration//GEN-END:variables
}
