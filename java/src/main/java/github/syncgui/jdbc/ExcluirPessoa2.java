package github.syncgui.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoa2 {

    public static void main(String[] args) throws SQLException {

    String sqlDelete = "DELETE FROM pessoas WHERE codigo = ?";
    String sqlSelect = "SELECT * FROM pessoas";

    Connection conexao = FabricaConexao.getConexao();

    Statement stmtSelect = conexao.createStatement();
    ResultSet resultado = stmtSelect.executeQuery(sqlSelect);

    List<Pessoa> pessoas = new ArrayList<>();

    while (resultado.next()) {
        int codigo = resultado.getInt("codigo");
        String nome = resultado.getString("nome");
        pessoas.add(new Pessoa(codigo, nome));
    }

    System.out.println("Código ==> Nome");
    for (Pessoa p: pessoas) {
        System.out.println(p.getCodigo() + " ==> " + p.getNome());
    }

    stmtSelect.close();

    Scanner input = new Scanner(System.in);
    System.out.println("Selecione a pessoa que deseja excluir pelo Código: ");
    int codigo = input.nextInt();

    input.nextLine();
    System.out.println("Certeza que deseja excluir? S/N");
    String resposta = input.nextLine();

    int contador = 0;

    if (resposta.equalsIgnoreCase("s")) {
    PreparedStatement stmtDelete = conexao.prepareStatement(sqlDelete);
    stmtDelete.setInt(1, codigo);
    contador = stmtDelete.executeUpdate();
    } else {
        System.out.println("Operação cancelada");
    }

    if (contador > 0) {
        System.out.println("Pessoa excluída com sucesso!");
    } else {
        System.out.println("Nada feito!");
    }

    System.out.println("Linhas afetadas: " + contador);

    input.close();
    conexao.close();
    }
}



