import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroAluno {

    public static void main(String[] args) {

        // Informações para conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/nome_do_banco_de_dados";
        String user = "usuario";
        String password = "senha";

        // Dados do aluno a ser cadastrado
        int id = 1;
        String nome = "João";
        int idade = 20;
        float nota = 8.5f;

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            // Preparação da query de inserção
            String sql = "INSERT INTO Aluno (id, nome, idade, nota) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, nome);
            statement.setInt(3, idade);
            statement.setFloat(4, nota);

            // Execução da query de inserção
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Aluno cadastrado com sucesso!");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar aluno: " + e.getMessage());
        }

    }

}
