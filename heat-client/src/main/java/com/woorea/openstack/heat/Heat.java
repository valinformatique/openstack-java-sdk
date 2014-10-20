package com.woorea.openstack.heat;

import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackClientConnector;

/**
 * Reference: http://developer.openstack.org/api-ref-orchestration-v1.html
 */
public class Heat extends OpenStackClient {

    private final StackResource stacks;
    private final ResourcesResource resources;

    public Heat(String endpoint, OpenStackClientConnector connector) {
        super(endpoint, connector);
        stacks = new StackResource(this);
        resources = new ResourcesResource(this);
    }

    public Heat(String endpoint) {
        this(endpoint, null);
    }

    public StackResource getStacks() {
        return stacks;
    }

    public ResourcesResource getResources() {
        return resources;
    }
}
