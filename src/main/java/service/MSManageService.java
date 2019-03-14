package service;

import model.MicroServiceModel;

import java.io.IOException;
import java.util.List;

/**
 * User: u6613739
 * Date: 2019/2/26
 * Time: 13:35
 * Description: the service is controling the microservice's log in, log off, sign in, delete .
 */
public interface MSManageService
{
    public void getProjectByProject(long projectId) throws IOException;


}
