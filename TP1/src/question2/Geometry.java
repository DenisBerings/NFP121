package question2;

import java.util.Objects;

public class Geometry {
    // On passe la variable type en private (testcheckFieldVisibility())
    private String type;
    // On déclare une variable color (String) (test checkFieldIsDeclared())
    private String color;
    /* On crée une fonction surface qui prend 2 int en paramètre et qui retourne 
       le produit de ces 2 paramètres (test checkSurfaceCalculation()) */
    public static int surface (int a, int b) {
        return a*b;
    }
    /* On crée une fonction perimeter qui prend 1 int en paramètre et qui 
       multiplie ce paramètre par 4 (test checkPerimeterCalculation()) */
    public static int perimeter (int a) {
        return a*4;
    }
    // On génère les getters & setters pour la variable type (facultatif)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    /* On génère la fonction toString() et la surcharger pour qu'elle renvoie 
       le String qui va bien (test checkToStringMethod()) */
    @Override
    public String toString() {
        return "Type:"+type;
    }
    // On surcharge la fonction equals() (test checkEquality())
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geometry geometry = (Geometry) o;
        return Objects.equals(type, geometry.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
