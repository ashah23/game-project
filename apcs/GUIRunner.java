/*Name:	
 *Date:
 *Period:
 *Teacher:
 *Description:
 */
package apcs;


public class GUIRunner
{

    public static void main(String[] args)
    {
        Mancala board=new Mancala();
        MancalaGameGUI gui= new MancalaGameGUI(board);
        gui.displayGame();

    }

}
