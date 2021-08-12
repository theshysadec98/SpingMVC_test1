package Controllers;

import Models.SanPham;
import Services.SanPhamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class SanPhamController {
    SanPhamService sanPhamService = new SanPhamService();
    @RequestMapping("/sanpham")
    public String show(Model model){
        model.addAttribute("list", sanPhamService.list);
        return "index.jsp";
    }

    @RequestMapping("/create")
    public String create(@ModelAttribute SanPham sanPham, Model model){
        sanPhamService.add(sanPham);
        model.addAttribute("list", sanPhamService.list);
        return "index.jsp";
    }

    @RequestMapping("/edit")
    public String edit(@ModelAttribute SanPham sanPham, Model model){
        sanPhamService.edit(sanPham, sanPham.getId());
        model.addAttribute("list", sanPhamService.list);
        return "index.jsp";
    }

    @RequestMapping("/delete")
    public String delete(@ModelAttribute SanPham sanPham, Model model){
        sanPhamService.delete(sanPham.getId());
        model.addAttribute("list", sanPhamService.list);
        return "index.jsp";
    }
    @RequestMapping("/find")
    public String find(@ModelAttribute SanPham sanPham, Model model) {
        sanPhamService.find(sanPham.getName());
        model.addAttribute("list", sanPhamService.list);
        return "index.jsp";
    }
}
