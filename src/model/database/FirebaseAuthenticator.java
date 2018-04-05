package model.database;

public class FirebaseAuthenticator implements Authenticator {
    private static FirebaseAuthenticator instance = new FirebaseAuthenticator();

    @Override
    public boolean authenticate(String userName, String password) {
        return false;
    }

    @Override
    public boolean register(String userName, String password) {
        return false;
    }

    /**
     * Returns this program's instance of FirebaseAuthenticator
     * @return this program's instance of FirebaseAuthenticator
     */
    public static FirebaseAuthenticator getInstance() {
        return instance;
    }
}
