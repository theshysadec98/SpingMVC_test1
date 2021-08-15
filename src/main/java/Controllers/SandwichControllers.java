package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichControllers {
    @RequestMapping("/save")
    public ModelAndView save(@RequestParam("lettuce") String lettuce, @RequestParam("tomato") String tomato,@RequestParam("mustard") String mustard,@RequestParam("sprouts") String sprouts) {
        ModelAndView mv = new ModelAndView("index");

        return mv;
    }
}
