package question1;
// On crée un Memento (sosie) de la classe Article
public class ArticleMemento {
    // On déclare 3 variables id, title, content, comme dla classe Article
    private long id;
    private String title;
    private String content;
    // On crée un constructeur qui prend les les 3 variables en paramètre et les instancie
    public ArticleMemento(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    // On génère les getters des 3 variables instanciées
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
