/**
 * This package contains classes related to the view of the Tetris game.
 */

package view;

import model.Board;

import javax.swing.*;
import java.awt.*;

/**
 * The GUI class is responsible for creating and managing the graphical user interface for the Tetris game.
 * It creates a JFrame with three JPanels and a JMenuBar. The JMenuBar has three JMenus - File, Help and About.
 * The File menu has an Exit JMenuItem to exit the game. The Help menu has a Rules JMenuItem to display the rules of the game.
 * The About menu has an About Game JMenuItem to display information about the game.
 * The three JPanels - left, center and right - are used to display the game board, the next piece and the game score respectively.
 */

public class GUI {
    Board board;
    
    /**
     * Constructs a new GUI object with the specified Board object.
     *
     * @param board the Board object to use for the Tetris game
     */
    
    public GUI(Board board){
        this.board = board;
        JFrame frame = new JFrame();
        frame.setSize(410, 400);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e ->{
            System.exit(0);
        });
        menu.add(exit);
        menuBar.add(menu);

        JMenu help = new JMenu("Help");
        JMenuItem rules = new JMenuItem("Rules");
        rules.addActionListener(e ->{
            JOptionPane.showMessageDialog(null, "Best of Luck");
        });
        help.add(rules);
        menuBar.add(help);

        JMenu about = new JMenu("About");
        JMenuItem abt = new JMenuItem(("About Game"));
        abt.addActionListener(e ->{
            JOptionPane.showMessageDialog(null, "This is a tetris game");
        });
        about.add(abt);
        menuBar.add(about);

        frame.setLayout(null);

        JPanel left = new JPanel();
        left.setSize(100, 100);
        left.setBackground(Color.BLUE);
        left.setBounds(300,0, 100, 100);
        frame.add(left);

        JPanel center = new JPanel();
        center.setSize(300, 400);
        center.setBackground(Color.RED);
        center.setBounds(0,0, 300, 400);
        frame.add(center);

        JPanel right = new JPanel();
        right.setSize(100, 300);
        right.setBackground(Color.GREEN);
        right.setBounds(300,100, 100, 300);
        frame.add(right);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method creates a new GUI object with a new Board object to start the Tetris game.
     *
     * @param args the command-line arguments
     */
    
    public static void main(String[] args) {
        GUI gui = new GUI(new Board());
    }
}
