package question2;

public class Invoker {
    private Command<String> cmd;
    // On crée un constructeur qui instancie l'objet'de type Command
    public Invoker(Command<String> cmd) {
        this.cmd = cmd;
    }
    /* On crée une méthode addArticleContent() qui prend un String en paramètre et qui appelle
       la méthode execute() sur l'objet'de type Command instancié en lui passant le String en paramètre */
    public void addArticleContent(String note) {
        cmd.execute(note);
    }
}
