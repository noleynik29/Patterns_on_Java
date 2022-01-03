package Behavioral.ChainOfResponsibility;

import Behavioral.ChainOfResponsibility.middleware.Middleware;
import Behavioral.ChainOfResponsibility.middleware.RoleCheckMiddleware;
import Behavioral.ChainOfResponsibility.middleware.ThrottlingMiddleware;
import Behavioral.ChainOfResponsibility.middleware.UserExistsMiddleware;
import Behavioral.ChainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

<<<<<<< HEAD
=======
        // All checks are linked. Client can build various chains using the same
        // components.
>>>>>>> b9e562aa98307ddea185f6e3104b32aea9ebde04
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

<<<<<<< HEAD
=======
        // Server gets a chain from client code.
>>>>>>> b9e562aa98307ddea185f6e3104b32aea9ebde04
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
