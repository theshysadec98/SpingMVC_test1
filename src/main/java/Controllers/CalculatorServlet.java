package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorServlet {

    @RequestMapping("/create")
    public String Calculator(@RequestParam double value1, @RequestParam double value2, @RequestParam String check, Model model){
        double result = 0;
        if(check.equals("+")){
            result = value1 + value2;
        }
        if(check.equals("-")){
            result = value1 - value2;
        }
        if(check.equals("*")){
            result = value1 * value2;
        }
        if(check.equals("/")){
            result = value1 / value2;
        }
        model.addAttribute("result", result);
        return "index.jsp";
    }
}
