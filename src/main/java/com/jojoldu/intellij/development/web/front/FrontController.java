package com.jojoldu.intellij.development.web.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jojoldu@gmail.com on 2018. 2. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@Controller
public class FrontController {

    @RequestMapping("/front")
    public String front(@RequestParam String myName, Model model) {
        model.addAttribute("myName", myName);
        return "front";
    }
}
