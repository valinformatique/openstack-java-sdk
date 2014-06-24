package com.woorea.openstack.quantum.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.quantum.model.SecurityGroup;
import com.woorea.openstack.quantum.model.SecurityGroupRule;
import com.woorea.openstack.quantum.model.SecurityGroups;

/**
 * Security Groups Management
 *
 * @author VAL Informatique
 */
public class SecurityGroupsResource {

    private final OpenStackClient CLIENT;

    public SecurityGroupsResource(OpenStackClient client) {
        this.CLIENT = client;
    }

    public List list() {
        return new List();
    }

    public Create create(SecurityGroup securityGroup) {
        return new Create(securityGroup);
    }

    public Delete delete(String securityGroupId) {
        return new Delete(securityGroupId);
    }

    public Show show(String securityGroupId) {
        return new Show(securityGroupId);
    }

    public class List extends OpenStackRequest<SecurityGroups> {

        public List() {
            super(CLIENT, HttpMethod.GET, "security-groups", null, SecurityGroups.class);
        }
    }

    public class Create extends OpenStackRequest<SecurityGroup> {

        public Create(SecurityGroup securityGroup) {
            super(CLIENT, HttpMethod.POST, "security-groups", Entity.json(securityGroup), SecurityGroup.class);
        }
    }

    public class Show extends OpenStackRequest<SecurityGroup> {

        public Show(String id) {
            super(CLIENT, HttpMethod.GET, buildPath("security-groups/", id), null, SecurityGroup.class);
        }
    }

    public class Delete extends OpenStackRequest<Void> {

        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, buildPath("security-groups/", id), null, Void.class);
        }
    }

    public AddRule addSecurityRule(SecurityGroupRule ruleToAdd) {
        return new AddRule(ruleToAdd);
    }

    public class AddRule extends OpenStackRequest<SecurityGroupRule> {

        public AddRule(SecurityGroupRule ruleToAdd) {
            super(CLIENT, HttpMethod.POST, "security-group-rules", Entity.json(ruleToAdd), SecurityGroupRule.class);
        }
    }

    public DeleteRule deleteSecurityRule(String id) {
        return new DeleteRule(id);
    }

    public class DeleteRule extends OpenStackRequest<Void> {

        public DeleteRule(String id) {
            super(CLIENT, HttpMethod.DELETE, buildPath("security-group-rules/", id), null, Void.class);
        }
    }
}
