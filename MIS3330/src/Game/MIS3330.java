package Game;

import javax.swing.*;

public class MIS3330 {
    public static void main(String[] args){
        //Student Name
        //CRN and Course Time/Date of meeting

        Game game = new Game();

        JFrame window = new JFrame("2048");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(game);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        game.start();
    }
}
