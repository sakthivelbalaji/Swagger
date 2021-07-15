package com.swag;

import com.swag.Swaggerentity;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
public class SwaggerController {
    ConcurrentHashMap<String, Swaggerentity> containers = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    @ApiOperation(value ="find the value",notes = "provide the class",response = Swaggerentity.class)
    public Swaggerentity getContainer(@ApiParam(value ="Id value ",required = true) @PathVariable String id) {
        return containers.get(id);
    }

    @GetMapping(path ="/")
    public List<Swaggerentity> getAllContainer() {

        return new ArrayList<Swaggerentity>(containers.values());
    }

    @PostMapping(value ="/addswagger",consumes = {"application/json"})
    public Swaggerentity addContainerl(@RequestBody Swaggerentity container  ) {
        containers.put(container.getId(),container);
        return container;

    }

}
