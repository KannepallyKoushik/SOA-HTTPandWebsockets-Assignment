package nl.utwente.soa.sampleWebapplication.web;

import nl.utwente.soa.sampleWebapplication.services.EchoProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.EncodeException;
import java.io.IOException;

@Controller
public class IndexController {

    @Qualifier("rest")
    @Autowired private EchoProxyService echoProxyService;

    @GetMapping("/")
    public String showWeather(Model model) {
        return "echo-form";
    }

    @RequestMapping(value = "/proxy", method= RequestMethod.POST)
    public String processForm(@ModelAttribute(value="message") String message) throws EncodeException, IOException, InterruptedException {
        try{
            echoProxyService.echo(message);
            return "result";
        }
        catch (Exception e) {
            return "error";
        }


    }

    @GetMapping("/messageboard")
    public String showMessageBoard(Model model) {
        return "messageboard";
    }
}
