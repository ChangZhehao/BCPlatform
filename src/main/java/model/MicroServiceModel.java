package model;

import lombok.Data;


/**
 * User: u6613739
 * Date: 2019/2/25
 * Time: 22:04
 * Description: MicroServiceInterface
 */
@Data
public class MicroServiceModel
{
    private long id;
    private String name;
    private String version;
    private String owner;
    private String registerIp;
    private MicroServiceInterface msInterface;
}
