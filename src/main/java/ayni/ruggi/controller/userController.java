package ayni.ruggi.controller;

import ayni.ruggi.entities.User;
import ayni.ruggi.services.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by ruggi on 8/5/17.
 */
@RestController
public class userController {

    private UserService userService;

    @Autowired
    public void setProductService(UserService userService) {
        this.userService= userService;
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public ModelAndView deleteContact(HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("id"));
        userService.delete(userId);
        User user = new User();
        user.setEmail("asd");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(user);
        return modelAndView;
    }

}
