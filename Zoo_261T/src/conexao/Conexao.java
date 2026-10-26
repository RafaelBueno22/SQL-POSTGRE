
package conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author RAFAELCORREABUENO
 */
public class Conexao {
    
    public static Connection conectar(){
    
        Connection conexao = null;
        
        String url = "jdbc:postgresql://localhost/zoo_261T";
        String usuario = "postgres";
        String senha = "root";
        
        try {
           conexao = DriverManager.getConnection(url, usuario, senha);
           System.out.println("Conectado ao Banco com SUCESSO");
        } catch (SQLException erro) {
            System.out.println("ERRO ao conecar com o Banco - Erro: " + erro);
        }
            return conexao; 
    }
}
