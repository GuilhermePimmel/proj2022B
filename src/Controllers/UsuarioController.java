/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Tools.Conexao;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
//import model.Usuario;

/**
 *
 * @author jonas
 */
public class UsuarioController {
    
    //Usuario objUsuario;
    //JTable jtbUsuarios = null;
    
    //public UsuarioDAO(Usuario objUsuario, JTable jtbUsuarios) {
    //    this.objUsuario = objUsuario;
    //    this.jtbUsuarios = jtbUsuarios;
    //}
    
    public boolean login(String user, String pass)
    {
        try {
            Conexao.abreConexao();
            PreparedStatement stmt;
            ResultSet rs;

            String wSql = "";
            wSql = " SELECT id ";
            wSql += " FROM usuarios ";
            wSql += " WHERE user = (?)";
            wSql += " AND pass = (?)";
            stmt = Conexao.con.prepareStatement(wSql);
            stmt.setString(1, user);
            stmt.setString(2, pass);

            rs = stmt.executeQuery();
            
            return rs.next();

            catch (SQLException ex )
            {
                System.out.println("ERRO de SQL: " + ex.getMessage());
                return false;
            }

		
    }
}
