import javax.swing.*;
    public class Media {
        
        public static void main (String[] args) {
            //Declaraão declaração de variáveis
            int i;
            double [] num = new double [50];
            double media, soma = 0;

            // criar objeto Swing
            JTextArea textArea = new JTextArea ();
            JScrollPane scrollPane = new JScrollPane(textArea);

            //Processamento de dados
            for (i =0; i <50; i++) {
                //Mensagem ao usuário
                String input = JOptionPane.showInputDialog(null, "Digite um número");

                //Entrada de dados
                num [i] = Double.parseDouble(input);
                soma += num [i];
            }

            //Processamento de dados
            media = soma / 50;

            // saída de resultados
            textArea.append ("A média das 50 notas digitadas é :" + media);

            // exibir a janela com os resultados
            JOptionPane.showMessageDialog(null, scrollPane);

            //fechar a janela quando o usuário clicar em "ok"
            System.exit(0);

        }

    }
