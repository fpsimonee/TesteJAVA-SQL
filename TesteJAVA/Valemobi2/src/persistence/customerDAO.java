/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import Objects.customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class customerDAO implements InterDAO{
    private Connection con;
    
    public customerDAO() throws SQLException, ClassNotFoundException {
        con = new DataSource().getCon();
    }
    
    @Override
    public void inserir(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List consultar() throws SQLException {
        String sql = "SELECT * FROM customer order by vl_total";
        PreparedStatement stm = con.prepareStatement(sql);
            
        ResultSet rs = stm.executeQuery();
        ArrayList<customer> vet = new ArrayList<customer>();
        while(rs.next()) {
            customer novo = new customer();
            novo.setId_customer(rs.getInt(1));
            novo.setCnpj(rs.getString(2));
            novo.setName(rs.getString(3));
            novo.setIs_active(rs.getBoolean(4));
            novo.setValor_total(rs.getDouble(5));
            vet.add(novo);
        }
        return vet;
    }

    @Override
    public void atualizar(int chave, Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(int chave) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
