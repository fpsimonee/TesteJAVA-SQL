package persistence;

import java.sql.SQLException;
import java.util.List;

public interface InterDAO {
    public void inserir(Object obj) throws SQLException;
    public List consultar() throws SQLException;
    public void atualizar(int chave, Object obj) throws SQLException;
    public void remover(int chave) throws SQLException;
}
