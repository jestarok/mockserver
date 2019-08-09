import com.google.gson.Gson;
import model.User;

import java.util.ArrayList;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        Gson gson;
        gson = new Gson();
        get("/ususarios", (req, res) -> {
            String response;
            ArrayList<User> users = new ArrayList<>();
            users.add(new User("001","jesus",15));
            users.add(new User("002","jesus",16));
            users.add(new User("003","jesus",17));

            response = gson.toJson(users);;

            return response;

        });

    }
}
