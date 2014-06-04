package exemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        // Exemplo 5 - GUI e ActionListeners
        JFrame tela = new JFrame("Rascunho");
        JButton botao = new JButton("Clique");
        
        // Jeito velho
        botao.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Clicou do jeito velho");
                
            }
        });
        
        // Jeito bizurado
        botao.addActionListener((evento)->System.out.println("Clicou do jeito bizurado"));
        
        
        tela.add(botao);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(200, 80);
        tela.setVisible(true);
    }
}
