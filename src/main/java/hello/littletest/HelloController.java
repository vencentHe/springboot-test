package hello.littletest;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    
    @RequestMapping(value="/person/{id}",method=RequestMethod.GET,
    produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(@PathVariable Integer id) {
        Person p = new Person();
        p.setId(id);
        p.setAge(25);
        p.setName("诸葛亮");
        p.setName("潘长江");
        return p;
        // return "welcome to my world!";
    }
    
}