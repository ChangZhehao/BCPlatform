package model;

import lombok.Data;

/**
 * User: u6613739
 * Date: 2019/2/25
 * Time: 22:13
 * Description: MicroServiceInterface
 */
@Data
public class MicroServiceInterface
{
    /**
     * microServiceInterface name
     */
    private String name;
    /**
     * the type of Interface
     */
    private EnumInterfaceType type;
}
