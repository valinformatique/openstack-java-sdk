package com.woorea.openstack.nova.api.extensions;

import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.nova.model.Hypervisors;

/**
 * Extension : Information about Hypervisors
 * @author SF
 */
public class HypervisorsExtension {

    private final OpenStackClient CLIENT;

    public HypervisorsExtension(OpenStackClient client) {
        CLIENT = client;
    }

    public List list(boolean detail) {
        return new List(detail);
    }

    public class List extends OpenStackRequest<Hypervisors> {

        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-hypervisors/detail" : "/os-hypervisors", null, Hypervisors.class);
        }
    }
}
