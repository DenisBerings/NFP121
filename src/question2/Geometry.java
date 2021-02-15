package question2;

public class Geometry {
    private String type;
    private String color;

    public static int surface (int longueur, int largeur) {
        return longueur*largeur;
    }

    public static int perimeter (int cote) {
        return cote*4;
    }

    public void setType (String type) {
        this.type = type;
    }

    public String ToString() {
        return "Type:".concat(this.type);
    }
}
