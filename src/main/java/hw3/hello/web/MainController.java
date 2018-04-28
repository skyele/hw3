package hw3.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    /* all the System.out.println() functions are for debug */

    /* root url is mapped to index */
    @RequestMapping("/")
    public  String root()
    {
        System.out.println("in maincontroller in root");
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index()
    {
        System.out.println("in maincontroller in index");
        return "index";
    }

    @RequestMapping("/user/index")
    public String userIndex()
    {
        System.out.println("in maincontroller in userindex");
        return "user/index";
    }

    @RequestMapping("/login")
    public String login()
    {
        System.out.println("in maincontroller in login");
        return "login";
    }

    /* Print log error function*/
    @RequestMapping("/login-error")
    public String loginError(Model model){
        System.out.println("in maincontroller in loginerror");
        model.addAttribute("loginError",true);
        return "login";
    }


}
