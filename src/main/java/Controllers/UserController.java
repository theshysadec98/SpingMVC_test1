package Controllers;

import DAO.UserDao;
import Models.Login;
import Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/home.jsp", "login", new Login());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDao.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/error.jsp");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/user.jsp");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}