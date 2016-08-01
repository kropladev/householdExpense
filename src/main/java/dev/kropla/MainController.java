package dev.kropla;

import dev.kropla.model.Employee;
import dev.kropla.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

/**
 * Created by kropla on 27.06.16.
 */
@Controller
public class MainController {
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);
    @Value("${application.message:Hello World}")
    private String message = "Hello World";
    @Autowired
    private EmployeeRepository employeeRepository;

    //@ResponseBody
    public String showIndex() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome2(Map<String, Object> model) {
        LOG.debug("welcome controller");
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String loadHomePage(Model model){

        model.addAttribute("employees", employeeRepository.findAll());

        return "index";
    }

    @RequestMapping(value="/addEmployee",method=RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee")Employee employee, Model model){

        employeeRepository.save(employee);

        return "redirect:/employees";
    }

}
