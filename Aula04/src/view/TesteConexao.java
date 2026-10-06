
package view;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * @author RAFAELCORREABUENO
 */
public class TesteConexao {
    public static void main (String[] args) {
            Scanner resposta = new Scanner (System.in);
        System.out.println("=========================================");
        System.out.println("          CADASTRO DE ALUNOS");
        System.out.println("=========================================");
        
        System.out.print("Nome: ");
        String nome = resposta.nextLine();
        System.out.print("Turma: ");
        String turma = resposta.nextLine();
        System.out.print("Email: ");
        String email = resposta.nextLine();
        
        String sql = "INSERT INTO aluno(nome,turma,email) VALUES (?,?,?)";
        try{
                Connection conexao =Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement(sql);
                stmt.setString(1, nome);
                stmt.setString(2, turma);
                stmt.setString(3, email);
                
                stmt.executeUpdate();
                
                System.out.println("Aluno cadastrado ");
                
                stmt.close();
                
                PreparedStatement stmt2 = conexao.prepareStatement("Select * From aluno");
                ResultSet resultado = stmt2.executeQuery();
                
                while (resultado.next()) {
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getString("nome"));
                System.out.print(" | ");
                System.out.print(resultado.getString("turma"));
                System.out.print(" | ");
                System.out.println(resultado.getString("email"));
                
                }
                
                
                
        }catch (SQLException erro){
        System.out.println("Error ao cadastrar aluno");
        System.out.println(erro.getMessage());
        }
        resposta.close();
    };
}
