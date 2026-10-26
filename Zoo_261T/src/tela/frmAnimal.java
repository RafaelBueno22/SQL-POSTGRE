
package tela;
import java.sql.SQLException;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author RAFAELCORREABUENO
 */
public class frmAnimal extends javax.swing.JFrame {

    /**
     * Creates new form frmAnimal
     */
    public frmAnimal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadZelador = new javax.swing.JButton();
        spnIdade = new javax.swing.JSpinner();
        btnConsulta = new javax.swing.JButton();
        btnConsZelador = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnServicos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 0));
        jPanel1.setForeground(new java.awt.Color(153, 204, 0));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 145, 2));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ZOO da Turma 261T");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        txtEspecie.setToolTipText("Digite aqui a Espécie do Animal");
        txtEspecie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espécie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 0, 12), new java.awt.Color(153, 204, 0))); // NOI18N

        txtNome.setToolTipText("Digite aqui o Nome do Animal");
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 0, 12), new java.awt.Color(153, 204, 0))); // NOI18N

        btnSalvar.setBackground(new java.awt.Color(153, 204, 0));
        btnSalvar.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(109, 145, 2));
        btnSalvar.setText("SALVAR");
        btnSalvar.setToolTipText("Clique para SALVAR no Banco de Dados");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELCORREABUENO\\Downloads\\logo_90x90.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELCORREABUENO\\Downloads\\WhatsApp Image 2026-10-15 at 2.39.44 PM.jpeg")); // NOI18N

        btnCadZelador.setBackground(new java.awt.Color(0, 102, 255));
        btnCadZelador.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        btnCadZelador.setForeground(new java.awt.Color(117, 199, 255));
        btnCadZelador.setText("CADASTRAR ZELADOR");
        btnCadZelador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadZeladorActionPerformed(evt);
            }
        });

        spnIdade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnIdade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 0, 12), new java.awt.Color(153, 204, 0))); // NOI18N

        btnConsulta.setText("Consulta Animal");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnConsZelador.setText("Consulta Zelador");
        btnConsZelador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsZeladorActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastro");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");
        jMenuBar1.add(jMenu2);

        mnServicos.setText("Servicos");
        mnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnServicosActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Servico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnServicos.add(jMenuItem1);

        jMenuBar1.add(mnServicos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCadZelador)))
                        .addGap(92, 92, 92)
                        .addComponent(btnConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsZelador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(spnIdade)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConsZelador)
                        .addComponent(btnConsulta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnCadZelador)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       String sqlInsert = """
                          INSERT INTO animal
                          (especie, nome, idade)
                          VALUES(?,?,?)
                          """;
       
        try {
            Connection conex = Conexao.conectar();
            PreparedStatement stmt = conex.prepareStatement(sqlInsert);
            
            String especie = txtEspecie.getText();
            String nome = txtNome.getText();
            int idade = Integer.parseInt(spnIdade.getValue().toString());
            
            
            stmt.setString(1, especie);
            stmt.setString(2, nome);
            stmt.setInt(3, idade);
            
          int linhas = stmt.executeUpdate();
          if(linhas >0){
          JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso");
          
          txtEspecie.setText("");
          txtNome.setText("");
          spnIdade.setValue(0);
          txtNome.requestFocus();
          }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Nao foi possivel cadastrar - ERRO:" + erro);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCadZeladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadZeladorActionPerformed
       frmZelador tela2 = new frmZelador();
       tela2.setVisible(true);
    }//GEN-LAST:event_btnCadZeladorActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        frmConsultaAnimais tela3 = new frmConsultaAnimais();
        tela3.setVisible(true);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnConsZeladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsZeladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsZeladorActionPerformed

    private void mnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnServicosActionPerformed
        
    }//GEN-LAST:event_mnServicosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmServico tela4 = new frmServico();
        tela4.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadZelador;
    private javax.swing.JButton btnConsZelador;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnServicos;
    private javax.swing.JSpinner spnIdade;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
