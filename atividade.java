import javax.swing.*;
class Aula{
    public static void main(String[] args) {
        int nota = 0, i = 0, x = 0;
        double media = 0,notas=0,passou=0;
        int quant[] = new int[5];
        int alunos[] = new int[1];
        String aluno = null;
       
        
        for (i = 0; i < alunos.length; i++){
              aluno = JOptionPane.showInputDialog(null, "Escreva o nome do aluno");
              
              
           
            for (x = 1; x <= quant.length; x++){
                nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do aluno #" +x));
                media = (media + nota);
            }

            media = media/quant.length;
            notas+=media;
            
           
        }
      
       System.out.println("O aluno " + aluno+ " teve a média " + notas + ".");

    }
}