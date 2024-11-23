import java.util.HashMap;

public class IDandPassword {
    HashMap<String,String> LoginInfo = new HashMap<String,String>();

    IDandPassword(){
        // Id's and there Passwords
        LoginInfo.put("Bro","pizza");
        LoginInfo.put("Chanderi","password");
        LoginInfo.put("New Haven's","123@abc");
    }
    protected HashMap getLoginInfo(){
        return LoginInfo;
    }
}
