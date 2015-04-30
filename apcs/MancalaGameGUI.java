/*Name:	
 *Date:
 *Period:
 *Teacher:
 *Description:
 */
package apcs;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import apcs.Mancala;

import java.net.URL;
import java.util.List;
import java.util.ArrayList;

public class MancalaGameGUI extends JFrame implements ActionListener
{
    /** Height of the game frame. */
    private static final int DEFAULT_HEIGHT = 302;
    /** Width of the game frame. */
    private static final int DEFAULT_WIDTH = 800;
    /** Width of a card. */
    private static final int CARD_WIDTH = 73;
    /** Height of a card. */
    private static final int CARD_HEIGHT = 97;
    /** Row (y coord) of the upper left corner of the first card. */
    private static final int LAYOUT_TOP = 30;
    /** Column (x coord) of the upper left corner of the first card. */
    private static final int LAYOUT_LEFT = 30;
    /** Distance between the upper left x coords of
     *  two horizonally adjacent cards. */
    private static final int LAYOUT_WIDTH_INC = 100;
    /** Distance between the upper left y coords of
     *  two vertically adjacent cards. */
    private static final int LAYOUT_HEIGHT_INC = 125;
    /** y coord of the "Replace" button. */
    private static final int BUTTON_TOP = 30;
    /** x coord of the "Replace" button. */
    private static final int BUTTON_LEFT = 570;
    /** Distance between the tops of the "Replace" and "Restart" buttons. */
    private static final int BUTTON_HEIGHT_INC = 50;
    /** y coord of the "n undealt cards remain" label. */
    private static final int LABEL_TOP = 160;
    /** x coord of the "n undealt cards remain" label. */
    private static final int LABEL_LEFT = 540;
    /** Distance between the tops of the "n undealt cards" and
     *  the "You lose/win" labels. */
    private static final int LABEL_HEIGHT_INC = 35;

    /** The board (Board subclass). */
    private Mancala board;
    
    public MancalaGameGUI(Mancala gameBoard) 
    {
        board = gameBoard;

        
    }
    public void displayGame() 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                setVisible(true);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub
        
    }

}
