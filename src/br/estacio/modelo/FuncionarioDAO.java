package br.estacio.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 


public class FuncionarioDAO {
    
    private Connection conexaoBD;

    /*construtor da classe*/
    public FuncionarioDAO()   {
        
        /*estabele conexao com base de dados*/
        
        String driver = "org.postgresql.Driver";
        String user   = "postgres";
        String password = "av1";
        String url  = "jdbc:postgresql://localhost:5432/av1";
        
        try
        {
            Class.forName(driver);
            conexaoBD = 
                    (Connection) DriverManager.getConnection(url, user, password);

            System.out.println("Conexão realizada com sucesso. \n");
            

        }
        catch (SQLException ex)
        {
            System.err.print("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.print("ClassNotFoundException: " + ex.getMessage());
        } 
    }
    
    /* insere dados no BD*/
    public boolean grava(Funcionario func){
        String sql = "INSERT INTO funcionarios VALUES (?,?,?,?,?)";
        
        PreparedStatement ps;
        try {
            
            ps = conexaoBD.prepareStatement(sql);
            ps.setInt(1, func.getMatricula());
            ps.setString(2, func.getNome());
            ps.setString(3, func.getEmail());
            ps.setDate(4, func.getDt_nasc());
            ps.setString(5, func.getSenha());
            
            ps.execute();
            
             
            return true;
            
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());        
            return false;
        }
        
    }
    
    /* atualiza dados no BD*/
    public boolean atualiza(Funcionario func){
      String sql = "UPDATE funcionarios SET "
              + " nome = ? ,"
              + " email = ? ,"
              + " dt_nasc = ? ,"
              + " senha = ? "
              + " WHERE matricula = ?";
        
        PreparedStatement ps;
        try {
            
            ps = conexaoBD.prepareStatement(sql);
            ps.setString(1, func.getNome());
            ps.setString(2, func.getEmail());
            ps.setDate(3, func.getDt_nasc());
            ps.setString(4, func.getSenha());
            ps.setInt(5, func.getMatricula());

            
            ps.execute();
            
             
            return true;
            
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());        
            return false;
        }  
    }
    
    /* apaga dados no BD*/
    public boolean apaga(Funcionario func){
        
        String sql = "DELETE FROM funcionarios "
              + " WHERE matricula = ?";
        
        PreparedStatement ps;
        try {
            
            ps = conexaoBD.prepareStatement(sql);
            ps.setInt(1, func.getMatricula());
            
            ps.execute();
                       
            return true;
            
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());        
            return false;
        }  
    }
    
    /* busca dados no BD*/
    public List<Funcionario> getFuncionarios(){
        String sql = "SELECT * FROM funcionarios ";
        
        PreparedStatement ps;
        try {
            
            ps = conexaoBD.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            List<Funcionario> listaFuncionarios = new ArrayList<>();
            
            while(rs.next()){
                listaFuncionarios.add(new Funcionario(
                        rs.getInt("matricula"), 
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getDate("dt_nasc"),
                        rs.getString("senha")));

            }
            
             
            return listaFuncionarios;
            
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());        
            return null;
        }  
    }
    
}
