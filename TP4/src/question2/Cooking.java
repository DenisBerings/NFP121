package question2;

public class Cooking {
    // On déclare une variable de type RiceType
    private RiceType riceType;
    // On compléte le constructeur pour qu'il instancie la variable riceType
    Cooking(RiceType riceType) {
        this.riceType = riceType;
    }
    // On crée une méthode prepareDinner qui retourne une chaîne de caractères contenant la variable riceType
    public String prepareDinner() {
        return "I am done cooking " + this.riceType;
    }

}
