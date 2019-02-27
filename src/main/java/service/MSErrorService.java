package service;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * User: u6613739
 * Date: 2019/2/28
 * Time: 9:43
 * Description:
 */
public class MSErrorService extends MSAbstractService
{
    ConcurrentLinkedQueue<Exception> allExceptionList = new ConcurrentLinkedQueue<Exception>();

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
