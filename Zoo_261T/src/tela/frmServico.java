package tela;

import conexao.Conexao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author RAFAELCORREABUENO
 */
public class frmServico extends javax.swing.JFrame {

    private void limparCampos(){
        txtIdServico
    }
    
    
    
    public frmServico() {
        initComponents();
        txtDataExecucao.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        chkExecutado.setSelected(false);
       
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConcluirServico = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        txtIdServico = new javax.swing.JTextField();
        txtIdAnimal = new javax.swing.JTextField();
        txtIdZelador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeAnimal = new javax.swing.JTextField();
        txtNomeZelador = new javax.swing.JTextField();
        btnBuscarAnimal = new javax.swing.JButton();
        btnBuscarZelador = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        chkExecutado = new javax.swing.JCheckBox();
        txtDataExecucao = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        btnExcluir.setText("Excluir");

        btnConcluirServico.setText("Concluir Servico");

        btnAtualizar.setText("Atualizar");

        btnLimparCampos.setText("Limpar Campos");

        txtIdServico.setEditable(false);
        txtIdServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdServicoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Servico N°");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID Animal");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID Zelador");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Serviço:");

        txtNomeAnimal.setEditable(false);

        txtNomeZelador.setEditable(false);

        btnBuscarAnimal.setText("Buscar Animal");
        btnBuscarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAnimalActionPerformed(evt);
            }
        });

        btnBuscarZelador.setText("Buscar Zelador");
        btnBuscarZelador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarZeladorActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        chkExecutado.setSelected(true);
        chkExecutado.setText("Executado");

        txtDataExecucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdZelador, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarZelador))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdServico)
                                    .addComponent(txtIdAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarAnimal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataExecucao, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(chkExecutado))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(422, 422, 422)
                                .addComponent(btnConcluirServico))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNomeZelador, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(chkExecutado)
                    .addComponent(txtDataExecucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAnimal))
                .addGap(16, 16, 16)
                .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdZelador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarZelador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeZelador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnConcluirServico)
                    .addComponent(btnAtualizar)
                    .addComponent(btnLimparCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdServicoActionPerformed

    private void btnBuscarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAnimalActionPerformed
    txtNomeAnimal.setText("");
    int idAnimal;
    
    try{ idAnimal = Integer.parseInt(txtIdAnimal.getText().trim());
        if(idAnimal <= 0) {
        JOptionPane.showMessageDialog(this, "Informe um ID de animal positivo");
        return;
        }
            
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(this, "Digite um ID de animal válido");
                return;
            }
    
            String sql = "SELECT nome FROM animal WHERE id = ?";
            
            
            try(Connection conex = Conexao.conectar();
                PreparedStatement stmt = conex.prepareStatement(sql)){
                stmt.setInt(1, idAnimal);
                
                try (ResultSet rs = stmt.executeQuery()){
                    if (rs.next()){
                        txtNomeAnimal.setText(rs.getString("nome"));
                    }else{
                        JOptionPane.showMessageDialog(this, "Animal não encontrado");
                    }
                } 
               }catch(SQLException erro){
                    JOptionPane.showMessageDialog(this, "Erro ao buscar o animal: " +erro.getMessage());
            }
    }//GEN-LAST:event_btnBuscarAnimalActionPerformed

    private void btnBuscarZeladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarZeladorActionPerformed
           txtNomeZelador.setText("");
    int idZelador;
    
    try{ idZelador = Integer.parseInt(txtIdZelador.getText().trim());
        if(idZelador <= 0) {
        JOptionPane.showMessageDialog(this, "Informe um ID de Zelador positivo");
        return;
        }
            
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(this, "Digite um ID de Zelador válido");
                return;
            }
    
            String sql = "SELECT nome FROM zelador WHERE id = ?";
            
            
            try(Connection conex = Conexao.conectar();
                PreparedStatement stmt = conex.prepareStatement(sql)){
                stmt.setInt(1, idZelador);
                
                try (ResultSet rs = stmt.executeQuery()){
                    if (rs.next()){
                        txtNomeZelador.setText(rs.getString("nome"));
                    }else{
                        JOptionPane.showMessageDialog(this, "Zelador não encontrado");
                    }
                } 
               }catch(SQLException erro){
                    JOptionPane.showMessageDialog(this, "Erro ao buscar o Zelador: " +erro.getMessage());
            }
    }//GEN-LAST:event_btnBuscarZeladorActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      String descricao = txtDescricao.getText().trim();
      if(descricao.isEmpty()){
          JOptionPane.showMessageDialog(this, "Digite a descrição de Serviço");
          return;
      }
      int idAnimal = 0;
      int idZelador = 0;
      
      try {idAnimal = Integer.parseInt(txtIdAnimal.getText().trim());
           idZelador = Integer.parseInt(txtIdZelador.getText().trim());
           if(idAnimal <= 0 || idZelador <= 0) {
               JOptionPane.showMessageDialog(this, "Os IDs devem ser positivos");
           }
      }catch (NumberFormatException erro) {
          JOptionPane.showMessageDialog(this, "Informe IDs numéricos válidos");
      }
      String sql = "INSERT INTO servico_zoo (animal_id, zelador_id, descricao)"
                  +"VALUES (?, ?, ?)";
      
      try(Connection conex = Conexao.conectar();
          PreparedStatement stmt = conex.prepareStatement(sql)){
          
          stmt.setInt(1, idAnimal);
          stmt.setInt(2, idZelador);
          stmt.setString(3, descricao);
          
          int linhas = stmt.executeUpdate();
          
          if(linhas ==1){
              JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso");
          }
      }catch(SQLException erro) {
          JOptionPane.showMessageDialog(this, "Erro ao cadastrar Serviço: " +erro.getMessage());
      } 
    }//GEN-LAST:event_btnSalvarActionPerformed

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
      btnBuscarAnimalva.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscarAnimal;
    private javax.swing.JButton btnBuscarZelador;
    private javax.swing.JButton btnConcluirServico;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkExecutado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtDataExecucao;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtIdAnimal;
    private javax.swing.JTextField txtIdServico;
    private javax.swing.JTextField txtIdZelador;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JTextField txtNomeZelador;
    // End of variables declaration//GEN-END:variables
}
