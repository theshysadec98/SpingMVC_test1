package Controllers;

import Models.Transfer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class TransferServlet {

    @RequestMapping("/search")
    public String Show(@RequestParam("input") String input, Model model){
        ArrayList<Transfer> list = new ArrayList<>();
        list.add(new Transfer("hello", "Xin chao"));
        list.add(new Transfer("what", "cai gi"));
        String output = "";
        for (int i = 0; i < list.size(); i++) {
            if(input.equals(list.get(i).getInput())){
                output = list.get(i).getOutput();
            }
        }
        model.addAttribute("output", output);
        return "index.jsp";
    }
}
