package question2;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

// On implémente l'interface java Observer afin que la classe View hérite de ses méthodes
public class View implements Observer {
    private JTextField jTextField;
    private JButton jButton1;
    private JButton jButton2;

    View(Number number){
        // create the window
        JFrame window = new JFrame();
        // give a title
        window.setTitle("Swing Window");
        // change the size
        window.setSize(400, 100);
        // exit program on window close action
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // center window on screen
        window.setLocationRelativeTo(null);
        // create a panel to include components
        JPanel jPanel = new JPanel();
        // create a textField
        this.jTextField = new JTextField(5);
        // add the textField to the window
        jPanel.add(this.jTextField);
        // create a button
        this.jButton1 = new JButton("+");
        // add the button to the window
        jPanel.add(this.jButton1);
        // create a button
        this.jButton2 = new JButton("-");
        // add the button to the window
        jPanel.add(this.jButton2);
        // add the panel to the window
        window.add(jPanel);
        // display the window
        window.setVisible(true);

        number.addObserver(this);
    }

    // On génère & surcharge la méthode update héritée de la classe java Observer
    @Override
    public void update(Observable observable, Object o) {
        // Si la variable "observable" est une instance de Number...
        if(observable instanceof Number) {
            // ...on récupère la valeur transmise et on s'assure qu'elle est convertie en Number...
            Number number = (Number) observable;
            // ...et on l'assigne à notre champ texte
            this.jTextField.setText(String.valueOf(number.getValue()));
        }
    }
    // On génère les Getters pour les 3 variables déclarées
    public JTextField getjTextField() {
        return jTextField;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }
}
