/**
 * Created by s-sumi on 2016/03/05.
 */
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {
        //port(80);
        get("/", (req, res) -> "Hello, World!");
        get("/convert",(req,res)->{
            Map<String,String> map=new HashMap<>();
            map.put("We're","Yousei");
            map.put("You're","guest");
            return new Gson().toJson(map);
        });
        get("/getParam",(req,res)->{return req.queryParams("sumi")+ " "+req.queryParams("one");});//queryParamが与えられていない時はnullがかえってくる

    }
}