package question2;
/* On crée une classe main (reprenant le code des tests) pour pouvoir constater
*  que les modifications apportées au code se voient sur l'UX Swing, en effet,
*  les tests font la même chose mais de manière trop rapide pour être constatées à l'oeil nu */
public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        View view = new View(number);
        Controller controller = new Controller(number, view);
        controller.display();
    }
}
