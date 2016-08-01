package dev.kropla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by kropla on 07.07.16.
 */
@Controller
@RequestMapping("/file")
public class FileController {
    private static final Logger LOG = LoggerFactory.getLogger(FileController.class);

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file){
        LOG.debug("LLLL UPLOAD FILE");
        LOG.debug("file name::" + file.getName());
        
        return "fileUpload";
    }

    @RequestMapping(value = "/")
    public String uploadPage(){
        return "fileUpload";
    }
}
