package be.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by u0090265 on 09/11/16.
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        return "test";
    }
}
