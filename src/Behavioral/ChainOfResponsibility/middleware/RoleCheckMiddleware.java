package Behavioral.ChainOfResponsibility.middleware;

public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        else if (email.equals("moderator@example.com")){
            System.out.println("Hello, moderator!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}