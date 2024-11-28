package JavaCore.ZZCjdbc.test;

import JavaCore.ZZCjdbc.classes.Comprador;
import JavaCore.ZZCjdbc.db.CompradorDBOLD;

import java.sql.SQLException;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
//        deletar();
//        atualizar();
//        List<Comprador> listaComprador = selecionarTudo();
//        List<Comprador> listaComprador2 = BuscarPorNome("OAO");
//        System.out.println(listaComprador);
//        System.out.println(listaComprador2);
//        CompradorDBOLD.selectMetaData();
//        CompradorDBOLD.checkDriverStatus();
//        CompradorDBOLD.testTypeSroll();
//        CompradorDBOLD.updateNomesToLowerCase();
//        System.out.println(CompradorDBOLD.searchByNamePreparedStatment("oao"));
//        CompradorDBOLD.updatePreparedStatement(new Comprador(1, "011.011.011-11", "Prepared Statement da Silva"));
//        System.out.println(CompradorDBOLD.searchByNameCallableStatement("%oao%"));
//        System.out.println(CompradorDBOLD.searchByNameRowSet("joao"));
//        CompradorDBOLD.updateRowSet(new Comprador(1, "011.011.011-11", "Prepared Statement da Silva"));
//        CompradorDBOLD.updateRowSetCached(new Comprador(1, "011.011.011-11", "Prepared Statement da Silva"));
        CompradorDBOLD.saveTransaction();
    }

    public void inserir() {
        Comprador comprador = new Comprador("011.011.011-01", "Pricila");
        CompradorDBOLD compradorDB = new CompradorDBOLD();
        compradorDB.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "000.000.000-11", "MARIA");
        CompradorDBOLD.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }

    public static List<Comprador> BuscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }
}
