package question2;

//On étend la classe abstraite AbstractVaultAccess à la classe ProxyVaultAccess
public class ProxyVaultAccess extends AbstractVaultAccess {
    // On implémente un objet realVaultAccess de la classe RealVaultAccess()
    private RealVaultAccess realVaultAccess = new RealVaultAccess();

    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        /* Si les variables passées en paramètre ont les valeurs attendues, on appelle la méthode accessVault()
        de l'objet realVaultAccess instancié ci-dessus */
        if (key.equals("vault_key") && fingerprint==true && password.equals("vault_password") && eyeScanner==true) {
            return realVaultAccess.accessVault(key, fingerprint, password, eyeScanner);
        // Sinon on retourne le String "access_denied"
        } else {
            return "access_denied" ;
        }
    }
}
