
package hello.littletest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * myController
 */
@Controller
public class myController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "普通Controller,普通的我";

    }
}