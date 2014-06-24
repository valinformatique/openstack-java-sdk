package com.woorea.openstack.nova.model;

import java.io.Serializable;
import java.util.Map;

public class Metadata implements Serializable {

    private Map<String, String> metadata;

    /**
     * @return the metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set the metadata
     *
     * @param metadata
     */
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
