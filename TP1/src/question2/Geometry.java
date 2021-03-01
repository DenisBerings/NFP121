package question2;

import java.util.Objects;

public class Geometry {
    private String type;
    private String color;

    public static int surface (int longueur, int largeur) {
        return longueur*largeur;
    }

    public static int perimeter (int cote) {
        return cote * 4;
    }

    public void setType (String type) {
        this.type = type;
    }

    public String toString() {
        return "Type:" + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geometry geometry = (Geometry) o;
        return Objects.equals(type, geometry.type);
    }

}
