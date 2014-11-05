package com.woorea.openstack.nova.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Model for Hypervisor information
 *
 * @author VAL Informatique
 */
public class Hypervisor implements Serializable {

    @JsonProperty("status")
    private String status;
    @JsonProperty("state")
    private String state;
    @JsonProperty("cpu_info")
    private String cpuInfo;
    @JsonProperty("current_workload")
    private Integer currentWorkload;
    @JsonProperty("disk_available_least")
    private Integer diskAvailableLeast;
    @JsonProperty("free_disk_gb")
    private Integer freeDiskGb;
    @JsonProperty("free_ram_mb")
    private Integer freeRamMb;
    @JsonProperty("hypervisor_hostname")
    private String hypervisorHostname;
    @JsonProperty("hypervisor_type")
    private String hypervisorType;
    @JsonProperty("hypervisor_version")
    private Integer hypervisorVersion;
    private int id;
    @JsonProperty("local_gb")
    private Integer localGb;
    @JsonProperty("local_gb_used")
    private Integer localGbUsed;
    @JsonProperty("memory_mb")
    private Integer memoryMb;
    @JsonProperty("memory_mb_used")
    private Integer memoryMbUsed;
    @JsonProperty("running_vms")
    private Integer runningVms;
    @JsonProperty("vcpus")
    private Integer vcpus;
    @JsonProperty("vcpus_used")
    private Integer vcpusUsed;
    @JsonProperty("service")
    private Map<String, String> service = new HashMap<>();
    @JsonProperty("host_ip")
    private String hostIp;

    public String getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public Integer getCurrentWorkload() {
        return currentWorkload;
    }

    public void setCurrentWorkload(Integer currentWorkload) {
        this.currentWorkload = currentWorkload;
    }

    public Integer getDiskAvailableLeast() {
        return diskAvailableLeast;
    }

    public void setDiskAvailableLeast(Integer diskAvailableLeast) {
        this.diskAvailableLeast = diskAvailableLeast;
    }

    public Integer getFreeDiskGb() {
        return freeDiskGb;
    }

    public void setFreeDiskGb(Integer freeDiskGb) {
        this.freeDiskGb = freeDiskGb;
    }

    public Integer getFreeRamMb() {
        return freeRamMb;
    }

    public void setFreeRamMb(Integer freeRamMb) {
        this.freeRamMb = freeRamMb;
    }

    public String getHypervisorHostname() {
        return hypervisorHostname;
    }

    public void setHypervisorHostname(String hypervisorHostname) {
        this.hypervisorHostname = hypervisorHostname;
    }

    public String getHypervisorType() {
        return hypervisorType;
    }

    public void setHypervisorType(String hypervisorType) {
        this.hypervisorType = hypervisorType;
    }

    public Integer getHypervisorVersion() {
        return hypervisorVersion;
    }

    public void setHypervisorVersion(Integer hypervisorVersion) {
        this.hypervisorVersion = hypervisorVersion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getLocalGb() {
        return localGb;
    }

    public void setLocalGb(Integer localGb) {
        this.localGb = localGb;
    }

    public Integer getLocalGbUsed() {
        return localGbUsed;
    }

    public void setLocalGbUsed(Integer localGbUsed) {
        this.localGbUsed = localGbUsed;
    }

    public Integer getMemoryMb() {
        return memoryMb;
    }

    public void setMemoryMb(Integer memoryMb) {
        this.memoryMb = memoryMb;
    }

    public Integer getMemoryMbUsed() {
        return memoryMbUsed;
    }

    public void setMemoryMbUsed(Integer memoryMbUsed) {
        this.memoryMbUsed = memoryMbUsed;
    }

    public Integer getRunningVms() {
        return runningVms;
    }

    public void setRunningVms(Integer runningVms) {
        this.runningVms = runningVms;
    }

    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public Integer getVcpusUsed() {
        return vcpusUsed;
    }

    public void setVcpusUsed(Integer vcpusUsed) {
        this.vcpusUsed = vcpusUsed;
    }

    public Map<String, String> getService() {
        return service;
    }

    public void setService(Map<String, String> service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Hypervisor [id=" + id + ", hypervisor_hostname=" + hypervisorHostname
                + ", hypervisor_type=" + hypervisorType + ", hypervisor_version=" + hypervisorVersion
                + ", status =" + status + ", state=" + state
                + "]";
    }
}