package github.syncgui.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {

    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);

        String selectSQL = "SELECT * FROM pessoas WHERE codigo = ?";
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        System.out.println("Digita o ID: ");
        int id = input.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(selectSQL);
        stmt.setInt(1, id);
        ResultSet r = stmt.executeQuery();

        if(r.next()) {
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

            System.out.println("O nome atual é: " + p.getNome());
            input.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = input.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(updateSQL);
            stmt.setString(1, novoNome);
            stmt.setInt(2, id);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!!");
        } else {
            System.out.println("Pessoa não encontrada!!");
        }

        conexao.close();
        input.close();
    }
}
