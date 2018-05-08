package action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/5/3.
 */
@Controller
public class LoginAction {
    @ResponseBody
    public void login(String username,String password){
        System.out.println(username+"   "+password);
    }
}
