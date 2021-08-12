package Controllers;

import Models.TransferMoney;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TransferServlet {


    @RequestMapping("/show")
    public String show(){
        return "/WEB-INF/Views/Show.jsp";
    }
    @RequestMapping("/VNtoUSD")
    public String VNtoUSD(HttpServletRequest request){
        double money = Double.parseDouble(request.getParameter("VND"));
        TransferMoney transferMoney = new TransferMoney(money);
        request.setAttribute("VND", transferMoney.VN_To_USD());
        return "/WEB-INF/Views/Show.jsp";
    }

    @RequestMapping("/USDtoVN")
    public String USDtoVN(HttpServletRequest request){
        double money = Double.parseDouble(request.getParameter("USD"));
        TransferMoney transferMoney = new TransferMoney(money);
        request.setAttribute("USD", transferMoney.USD_To_VN());
        return "/WEB-INF/Views/Show.jsp";
    }
}
