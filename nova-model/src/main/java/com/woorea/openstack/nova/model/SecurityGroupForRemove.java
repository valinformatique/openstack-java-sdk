package com.woorea.openstack.nova.model;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Model for removing a Security Group
 *
 * @author VAL Informatique
 */
@JsonRootName("removeSecurityGroup")
public class SecurityGroupForRemove implements Serializable {

    @JsonProperty("name")
    private String name;

    public SecurityGroupForRemove(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
