package model.database;

public interface Authenticator {
    /**
     * Authenticates whether this is a correct log in or not
     * @param userName The user's username
     * @param password The user's password
     * @return true if this is a user, false if this is not a user
     */
    boolean authenticate(String userName, String password);

    /**
     * Registers a user into the system
     * @param userName The new user's name
     * @param password The new user's password
     * @return true if successfully registered, false if not
     */
    boolean register(String userName, String password);
}
