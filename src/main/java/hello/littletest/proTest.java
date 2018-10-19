
package hello.littletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * proTest
 */
@Controller
public class proTest {

    @Autowired
    private ApplicationContext ctx;
    
    @GetMapping("/prop")
    @ResponseBody
    public String getname(){
        return ctx.getEnvironment().getProperty("test.user.name");

    }
    
}