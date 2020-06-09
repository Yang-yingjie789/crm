package ntt.global.crm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ntt.global.crm.pojo.User;
import ntt.global.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/6 12:23
 */
@Controller
public class UserController {
    @Autowired
    @Qualifier(value = "UserServiceImpl")
    private UserService userService;
    @RequestMapping("/users")
    @ResponseBody
    public String queryUsers(Model model){
        ObjectMapper objectMapper=new ObjectMapper();
        List<User> userList = userService.queryUsers();
        try {
            String result = objectMapper.writeValueAsString(userList);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
