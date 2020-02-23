package core;

public class Login {

    // Password section
    private static class PasswordContainer {
        private static final String defaultPassword = "SayHello";

        String getDefaultPassword() {
            return defaultPassword;
        }

        public boolean checkPassword(String password,PasswordContainer passwordContainer){
            return passwordContainer.getDefaultPassword().equals(password);
        }
    }

    // Username section
    private static class UsernameContainer{
        private static final String defaultUsername = "Anton";

        public String getDefaultUsername() {
            return defaultUsername;
        }

        public boolean checkUsername(String username, UsernameContainer usernameContainer){
            return usernameContainer.getDefaultUsername().equals(username);
        }
    }

    // returns conclusion of operations
    public boolean checkLogin(String password,String username){
        PasswordContainer passwordContainer = new PasswordContainer();
        UsernameContainer usernameContainer = new UsernameContainer();
        return passwordContainer.checkPassword(password,passwordContainer) && usernameContainer.checkUsername(username,usernameContainer);
    }
}
