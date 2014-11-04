package com.woorea.openstack.nova.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Model for Hypervisors
 *
 * @author SF
 */
public class Hypervisors implements Iterable<Hypervisor>, Serializable {

    @JsonProperty("hypervisors")
    private List<Hypervisor> list;

    @Override
    public Iterator<Hypervisor> iterator() {
        return list.iterator();
    }

    /**
     * @return the list
     */
    public List<Hypervisor> getList() {
        return list;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Hypervisors [list=" + list + "]";
    }
}
