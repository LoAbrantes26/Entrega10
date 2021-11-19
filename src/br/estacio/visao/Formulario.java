package br.estacio.visao;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Formulario extends JFrame{
    
    //declarando componentes da tela
    JPanel painel = new JPanel();
    
    JLabel lblMatricula = new JLabel("Matrícula");
    JTextField txtMatricula = new JTextField();
    
    JLabel lblNome = new JLabel("Nome");
    JTextField txtNome = new JTextField();

    
    JLabel lblEmail = new JLabel("Email");
    JTextField txtEmail = new JTextField();

    
    JLabel lblDtNasc = new JLabel("Data de Nascimento");
    JTextField txtDtNasc = new JTextField();

    
    JLabel lblSenha = new JLabel("Senha");
     JPasswordField txtSenha = new JPasswordField();
    
    JButton btnGravar = new JButton("Gravar");
    
    JPanel painelBtnGravar = new JPanel();
    JLabel lblVazia = new JLabel("");



    //construtor da classe
    public Formulario() {
        
        //definindo layout
        GridLayout grid = new GridLayout(11, 1, 5, 5);
        painel.setLayout(grid);
        
        //definindo tamanho da janela
        this.setBounds(200, 200, 250, 310);
        
        //impedindo janela de ser redimensionada
        this.setResizable(false);
        
        //definindo titulo da janela
        this.setTitle("Formulário");

        
        //adicionando componentes ao painel
        painel.add(lblMatricula);
        painel.add(txtMatricula);
        
        painel.add(lblNome);
        painel.add(txtNome);
        
        painel.add(lblEmail);
        painel.add(txtEmail);
        
        painel.add(lblDtNasc);
        painel.add(txtDtNasc);
        
        painel.add(lblSenha);
        painel.add(txtSenha);
        
        //add botao
        GridLayout gridBtn = new GridLayout(1, 2);
        painelBtnGravar.setLayout(gridBtn);
        painelBtnGravar.add(btnGravar);
        painelBtnGravar.add(lblVazia);

        
        painel.add(painelBtnGravar);
        
        
        //adicionando painel na janela
        this.add(painel);
        
        //tornando janela visível
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        //chamando construtor da classe
        new Formulario();
    }

    
    
}
