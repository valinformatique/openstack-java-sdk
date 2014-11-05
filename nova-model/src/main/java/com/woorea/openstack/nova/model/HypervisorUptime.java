package com.woorea.openstack.nova.model;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Model for Hypervisor uptime
 *
 * @author VAL Informatique
 */
@JsonRootName("hypervisor")
public class HypervisorUptime implements Serializable {

    @JsonProperty("hypervisor_hostname")
    private String hypervisorHostname;
    private int id;
    private String uptime;
    private String state;
    private String status;

    public String getHypervisorHostname() {
        return hypervisorHostname;
    }

    public void setHypervisorHostname(String hypervisorHostname) {
        this.hypervisorHostname = hypervisorHostname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
