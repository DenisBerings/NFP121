package question2;

import question1.ArticleMemento;

public class Article {
    private long id;
    private String title;
    private String content;

    public Article(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /* On crée la méthode createMemento() qui instancie un objet de type
       ArticleMemento() en lui affectant la valeur des variables à cet instant */
    public ArticleMemento createMemento() {
        return new ArticleMemento(id, title, content);
    }
    /* On crée la méthode restore() qui prend en pramètre un objet de type ArticleMemento()
       et set les valeurs de l'objet Article en fonction de celles de l'objet ArticleMemento() */
    public void restore(ArticleMemento articleMemento) {
        this.id = articleMemento.getId();
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
    }

    @Override
    public String toString() {
        return "question2.Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
