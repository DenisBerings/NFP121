package question2;

public class Controller {
    /* On déclare 2 objets :
     * - un objet number instance de la classe Number
     * - un objet view instance de la classe View
     */
    private Number number;
    private View view;
    // On crée un constructeur prenant un objet Number et un objet View en paramètre
    Controller(Number number, View view) {
        this.number = number;
        this.view = view;
    }
    // On crée une méthode display
    public void display() {
        // On ajoute 1 lorsque l'on appuis sur jButton1 (+)
        view.getjButton1().addActionListener(actionEvent -> {
            number.setValue(number.getValue() + 1);
        });
        // On ote 1 lorsque l'on appuis sur jButton2 (-)
        view.getjButton2().addActionListener(actionEvent -> {
            number.setValue(number.getValue() - 1);
        });
        //On récupére la valeur ajoutée manuellement dans le champ texte
        view.getjTextField().addActionListener(actionEvent -> {
            int value = Integer.parseInt(view.getjTextField().getText());
            number.setValue(value);
        });
    }

}
