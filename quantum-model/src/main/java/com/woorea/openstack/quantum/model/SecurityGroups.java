package com.woorea.openstack.quantum.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Model for Security Groups
 *
 * @author VAL Informatique
 */
public class SecurityGroups implements Iterable<SecurityGroup>, Serializable {

    @JsonProperty("security_groups")
    private List<SecurityGroup> list;

    /**
     * @return the list
     */
    public List<SecurityGroup> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<SecurityGroup> list) {
        this.list = list;
    }

    @Override
    public Iterator<SecurityGroup> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return "Security groups [list=" + list + "]";
    }
}
