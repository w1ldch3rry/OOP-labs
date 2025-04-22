
public class Task4 {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("daria", "qwerty123");
        System.out.println("Login success: " + user.login("qwerty123"));
        user.changePassword("qwerty123", "newpass456");
        System.out.println("Login success: " + user.login("newpass456"));
    }
}

class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword) && newPassword != null && !newPassword.isEmpty()) {
            this.password = newPassword;
        }
    }
}
