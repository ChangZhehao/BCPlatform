package service;

/**
 * User: u6613739
 * Date: 2019/2/27
 * Time: 9:01
 * Description:
 */
public abstract class MSAbstractService implements Runnable
{
    //start a service with one thread. all error should be sent as a message to MSErrorService to deal.

    public void run()
    {
        ;
    }

    /**
     * throw all exception to MSErrorService
     * @param e
     */
    private void throwExceptionToES(Exception e)
    {
        ;
    }
}
