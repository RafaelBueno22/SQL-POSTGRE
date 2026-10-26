
package tela;

import conexao.Conexao;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class frmConsultaAnimais extends javax.swing.JFrame {

   private void atualizarTabela(){
       DefaultTableModel modelo = (DefaultTableModel) tblAnimais.getModel();
       
       modelo.setRowCount(0);
       
       String sql = "SELECT * FROM animal "
                    + "ORDER BY id";
       
       try (Connection conex = Conexao.conectar();
           PreparedStatement stmt = conex.prepareStatement(sql);
           ResultSet resultado = stmt.executeQuery();){
               while(resultado.next()){
               modelo.addRow(new Object[]{
               resultado.getInt("id"),
               resultado.getString("especie"),
               resultado.getString("nome"),
               resultado.getInt("idade")
               });
               }
           
       } catch (SQLException erro) {
      JOptionPane.showMessageDialog(
              this,
              "ERRO ao atualizar a tabela: \n" + erro.getMessage(),
              "ERRo no banco de dados",
              JOptionPane.ERROR_MESSAGE
              );
      
       }
   };
    
    
    
    public frmConsultaAnimais() {
        initComponents();
        tblAnimais.setModel(new DefaultTableModel(new Object[][]{},
                            new String[] {
                            "ID", "Espécie", "Nome", "Idade"
                            }) {
                        @Override
                        public boolean isCellEditable(int linha, int coluna){
                        return false;
                        }
                            });
        tblAnimais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        atualizarTabela();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimais = new javax.swing.JTable();
        btnAtualizarTabela = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnLocalizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAnimais.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnimaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnimais);

        btnAtualizarTabela.setBackground(new java.awt.Color(102, 153, 0));
        btnAtualizarTabela.setText("Atualizar Tabela");
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABELA ANIMAIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnLocalizar.setBackground(new java.awt.Color(0, 51, 204));
        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Excluir");

        jButton2.setText("Sair");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Espécie", "Idade", " " }));

        txtId.setEditable(false);

        jLabel2.setText("ID");

        jLabel3.setText("Espécie");

        jLabel4.setText("Nome");

        jLabel5.setText("Idade");

        btnAlterar.setBackground(new java.awt.Color(204, 204, 0));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnLocalizar)
                .addGap(0, 280, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizarTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(116, 116, 116)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdade))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNome))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEspecie))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocalizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarTabela)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnAlterar))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
           DefaultTableModel modelo = (DefaultTableModel) tblAnimais.getModel();
        
        modelo.setRowCount(0);
        
        String sql = "SELECT * FROM animal "
                     + "ORDER BY id";
        
        try (Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery() ){
            
            while (resultado.next()){
                modelo.addRow(new Object[] {
                    resultado.getInt("id"),
                    resultado.getString("especie"),
                    resultado.getString("nome"),
                    resultado.getInt("idade")
                });
            }
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(
                        this,
                        "Erro ao atualizar tabela:\n" + erro.getMessage(),
                        "Erro no banco de dados",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        String pesquisa = txtPesquisar.getText().trim();
        if(pesquisa.isEmpty()) {
        JOptionPane.showMessageDialog(
                this,
                "Digite o nome ou parte do nome do animal.",
                "Pesquisa Vazia",
                JOptionPane.WARNING_MESSAGE
                );
        return;
                }
        
        DefaultTableModel modelo = (DefaultTableModel) tblAnimais.getModel();
        
        modelo.setRowCount(0);
        
        String sql = "SELECT * FROM animal"
                     + "WHERE nome ILIKE ? "
                     + "ORDER BY nome";
        
        try (Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql)){
             stmt.setString(1, "%" + pesquisa + "%");
            
             try (ResultSet resultado = stmt.executeQuery()){
                 while(resultado.next()){
                     modelo.addRow(new Object[]{
                         resultado.getInt("id"),
                         resultado.getString("especie"),
                         resultado.getString("nome"),
                         resultado.getInt("idade")
                     });
                 }
             }
             if(modelo.getRowCount() == 0 ){
             JOptionPane.showMessageDialog(
                     this,
                     "Nenhum animal encontrado para: " + pesquisa,
                     "Resultado da Pesquisa",
                     JOptionPane.INFORMATION_MESSAGE);
             }
        } catch (SQLException erro) {
        }
                
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void tblAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnimaisMouseClicked
      int linha = tblAnimais.getSelectedRow();
      
      if(linha == -1){
      return;}
      
      txtId.setText(tblAnimais.getValueAt(linha, 0).toString());
      txtEspecie.setText(tblAnimais.getValueAt(linha, 1).toString());
      txtNome.setText(tblAnimais.getValueAt(linha,2).toString());
      txtIdade.setText(tblAnimais.getValueAt(linha, 3).toString());

    }//GEN-LAST:event_tblAnimaisMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tblAnimais.getSelectedRow();
        
        if(linha == -1){
        JOptionPane.showMessageDialog(this, "Selecione um animal na tabela para alterar");
        return;
        }
        
        int id = Integer.parseInt(tblAnimais.getValueAt(linha, 0).toString());
        String especie = txtEspecie.getText().trim();
        String nome = txtNome.getText().trim();
        String idadeTexto = txtIdade.getText().trim();
        
        if( especie.isEmpty() || nome.isEmpty() || idadeTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }
        int idade;
        
        try {
            idade = Integer.parseInt(idadeTexto);
            
            if(idade < 0){
                JOptionPane.showMessageDialog(this, "A idade não pode ser Negativa");
                return;
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(this, "A idade deve ser um numero Inteiro: " + erro);
            return;
            
        }
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja alterar os dados do animal de ID" +id+ "?",
                "Confirmar alterações",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta != JOptionPane.YES_OPTION) {
        return;
        }
        
        String sql = """
                     UPDATE animal
                     SET especie = ?, nome = ?, idade = ?
                     WHERE id = ?
                     """;
        
        try (Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql)){
                stmt.setString(1, especie);
                stmt.setString(2, nome);
                stmt.setInt(3, idade);
                stmt.setInt(4, id);
                
                int registros = stmt.executeUpdate();
                if(registros >0) {
                    JOptionPane.showMessageDialog(this, "Animal alterado com sucesso!");
                       atualizarTabela();
                       txtId.setText("");
                       txtEspecie.setText("");
                       txtNome.setText("");
                       txtIdade.setText("");
                } else{
                JOptionPane.showMessageDialog(this, "Animal não encontrado");
                }
                
                
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(this, "Erro ao alterar o animal: " + erro.getMessage());
            
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnimais;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
