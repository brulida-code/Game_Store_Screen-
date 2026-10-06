import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class GameStore extends JFrame{


    public GameStore(){
   
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setTitle("Villager Trading");
         setResizable(false);
         setExtendedState(JFrame.MAXIMIZED_BOTH);


         JPanel root = new JPanel(new GridBagLayout());
         root.setBackground(new Color(16,16,16));

         
         JPanel tradePanel = new JPanel(new BorderLayout());
         tradePanel.setBackground(new Color(198,198,198));
         tradePanel.setPreferredSize(new Dimension(552,552));

         

        root.add(tradePanel);
         add(root);
    
        root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
    .put(KeyStroke.getKeyStroke("ESCAPE"), "exit");
root.getActionMap().put("exit", new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});



GraphicsEnvironment.getLocalGraphicsEnvironment()
.getDefaultScreenDevice().setFullScreenWindow(this);
          



    }
      
  public static void main(String[] args) {
      SwingUtilities.invokeLater(GameStore:: new);
  }
}