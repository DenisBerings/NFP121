package question2;

public class ProxyVaultAccess  {
    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        if (!"".equals(key) || fingerprint==false || !"".equals(password) || eyeScanner==false) {
            super.accessVault(key, fingerprint, password, eyeScanner);
        }
        return "access_denied";
    }

}
