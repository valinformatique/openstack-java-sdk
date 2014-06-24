package com.woorea.openstack.nova.model;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Model for adding a Security Group
 *
 * @author VAL Informatique
 */
@JsonRootName("addSecurityGroup")
public class SecurityGroupForAdd implements Serializable {

    @JsonProperty("name")
    private String name;

    public SecurityGroupForAdd(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
