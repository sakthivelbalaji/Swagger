package com.swag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = " the class file")
public class Swaggerentity {
    @ApiModelProperty(notes = "id")
    private String id;
    @ApiModelProperty(notes = "Name")
    private String sname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


}
