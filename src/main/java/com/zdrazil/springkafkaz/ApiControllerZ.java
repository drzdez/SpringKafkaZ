package com.zdrazil.springkafkaz;


import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author zdraz
 */

@RestController
public class ApiControllerZ {
    
    Logger logger = LogManager.getLogger(ApiControllerZ.class);
    
    @ApiOperation(value = "Test API with swagger", notes = "Returns a product as per the id")
    @PostMapping(value = "/commandzneco")
    public String custom(
    
            
            
    ) {
        logger.info("Param set to: ");
        return "commandzneco";
    }
}    

    
