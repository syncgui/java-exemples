package github.syncgui.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultarRegistros {

    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite parte do nome: ");
        String parteDoNome = input.nextLine();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + parteDoNome + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        conexao.close();
        stmt.close();
        input.close();
    }
}
