package dev.kropla;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kropla on 29.06.16.
 */
@Controller
public class MainErrorController implements ErrorController {

        private static final String PATH = "/error";

/*        @RequestMapping(value = PATH)
        public String error() {
            return "error";
        }*/

        @Override
        public String getErrorPath() {
            return PATH;
        }
    }