package Controllers;

import Services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorServlet {
    Services services = new Services();
    @RequestMapping("/")
    public String Calculator(){
        return "/index.jsp";
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        double value1 = Double.parseDouble(request.getParameter("value1"));
        double value2 = Double.parseDouble(request.getParameter("value2"));
        double result = services.add(value1, value2);
        request.setAttribute("result", result);
        return "/index.jsp";
    }
    @RequestMapping("/minus")
    public String minus(HttpServletRequest request){
        double value1 = Double.parseDouble(request.getParameter("value1"));
        double value2 = Double.parseDouble(request.getParameter("value2"));
        double result = services.minus(value1, value2);
        request.setAttribute("result", result);
        return "/index.jsp";
    }
    @RequestMapping("/multiplication")
    public String multiplication(HttpServletRequest request){
        double value1 = Double.parseDouble(request.getParameter("value1"));
        double value2 = Double.parseDouble(request.getParameter("value2"));
        double result = services.multiplication(value1, value2);
        request.setAttribute("result", result);
        return "/index.jsp";
    }
    @RequestMapping("/division")
    public String division(HttpServletRequest request){
        double value1 = Double.parseDouble(request.getParameter("value1"));
        double value2 = Double.parseDouble(request.getParameter("value2"));
        double result = services.division(value1, value2);
        request.setAttribute("result", result);
        return "/index.jsp";
    }
}
