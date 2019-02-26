package model;

import lombok.Data;

import java.util.List;


/**
 * User: u6613739
 * Date: 2019/2/25
 * Time: 22:04
 * Description: MicroServiceInterface
 */
@Data
public class MicroServiceModel
{
    /**
     * microservice uuid
     */
    private long id;
    /**
     * microservice name
     */
    private String name;
    /**
     * microservice version x.x.x
     */
    private String version;
    /**
     * microservcie owner
     */
    private String owner;
    /**
     * microservice running Ip
     */
    private String registerIp;
    /**
     * microservice Interface list
     */
    private List<MicroServiceInterface> msInterface;
}
