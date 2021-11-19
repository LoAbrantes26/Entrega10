package br.estacio.modelo;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        
        
        FuncionarioDAO dao = new FuncionarioDAO();
        
        Calendar dt_nasc = Calendar.getInstance();
        dt_nasc.set(2021, Calendar.APRIL, 28);
        
        Funcionario func1 = new Funcionario(12345, 
                                           "Fulano", 
                                           "@fulano", 
                                            new Date(dt_nasc.getTimeInMillis()),
                                           "s123");
                
        
        
        if(dao.grava(func1)){
            System.out.println("Func1 # "+ func1.getMatricula()+ " - " + func1.getNome() + " CADASTRADO com sucesso!!");
        }
        
        System.out.println("");
        
        Funcionario func2 = new Funcionario(54321, 
                                           "Beltrano", 
                                           "@beltrano", 
                                            new Date(dt_nasc.getTimeInMillis()),
                                           "s543");
                
        
        
        if(dao.grava(func2)){
            System.out.println("Func2 # "+ func2.getMatricula()+ " - " + func2.getNome() + " CADASTRADO com sucesso!!");
        }
        
        System.out.println("");
        
        dt_nasc.set(2021, Calendar.APRIL, 29);
        Funcionario func_alt = new Funcionario(12345, 
                                           "Fulano *DE TAL", 
                                           "@fulanoDeTal", 
                                            new Date(dt_nasc.getTimeInMillis()),
                                           "s321");
               
        if(dao.atualiza(func_alt)){
            System.out.println("Func1 # "+ func_alt.getMatricula()+ " - (" + func_alt.getNome() + ") ALTERADO com sucesso!!");
        }
        
        System.out.println("");
        
        if(dao.apaga(func2)){
            System.out.println("Func2 # "+ func2.getMatricula()+ " - " + func2.getNome() + " EXCLUÍDO com sucesso!!");
        }
        
        System.out.println("");
        
        List<Funcionario> listaFuncionarios = dao.getFuncionarios();
        System.out.println("-->Funcionário(s) Cadastrado(s) <-- \n");
        for (Funcionario func : listaFuncionarios) {
            System.out.println("# " + func.getMatricula()+ " - " + func.getNome());
        }
        
    }
    
}
