/**
 * Created by s-sumi on 2016/03/05.
 */
import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello, World!");
    }
}