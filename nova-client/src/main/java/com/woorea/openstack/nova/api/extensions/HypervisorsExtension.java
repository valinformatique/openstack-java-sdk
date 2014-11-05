package com.woorea.openstack.nova.api.extensions;

import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.nova.model.HypervisorUptime;
import com.woorea.openstack.nova.model.Hypervisors;

/**
 * Extension : Information about Hypervisors
 *
 * @author VAL Informatique
 */
public class HypervisorsExtension {

    private final OpenStackClient CLIENT;

    public HypervisorsExtension(OpenStackClient client) {
        CLIENT = client;
    }

    public List list(boolean detail) {
        return new List(detail);
    }

    public Show showUptime(int hypervisorId) {
        return new Show(hypervisorId);
    }

    public class List extends OpenStackRequest<Hypervisors> {

        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-hypervisors/detail" : "/os-hypervisors", null, Hypervisors.class);
        }
    }

    public class Show extends OpenStackRequest<HypervisorUptime> {

        public Show(int hypervisorId) {
            super(CLIENT, HttpMethod.GET, "/os-hypervisors/".concat(Integer.toString(hypervisorId)).concat("/uptime"), null, HypervisorUptime.class);
        }
    }
}
