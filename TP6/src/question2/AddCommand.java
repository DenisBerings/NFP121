package question2;

public class AddCommand implements Command<String> {
    private Article article;

    public AddCommand(Article article) {
        this.article = article;
    }
    // On surcharge la méthode execute() héritée de l'interface Command
    @Override
    public void execute(String s) {
        article.setContent(s);
    }
    // On surcharge la méthode undo() héritée de l'interface Command
    @Override
    public void undo() {

    }
}
