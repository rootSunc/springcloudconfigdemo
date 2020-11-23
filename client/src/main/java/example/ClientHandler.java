package example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientHandler {
    @Value("${info.foo}")
    private String msg;

    @RequestMapping("/")
    public String hello() {
        return "test msg is .." + msg;
    }
}
