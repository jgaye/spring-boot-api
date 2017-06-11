/**
 * Created by Marvin on 11/06/2017.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "<b>Hello</b> World!";
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Example.class, args);
//    }

}
