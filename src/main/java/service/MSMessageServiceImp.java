package service;

import model.Request;
import model.Response;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * User: u6613739
 * Date: 2019/3/8
 * Time: 14:13
 * Description:
 */
public class MSMessageServiceImp implements MSMessageService
{
    @Override
    public void run() throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(12036);

        while(true)
        {
            Socket socket = serverSocket.accept();

            if (socket == null) {
                throw new IllegalArgumentException("socket can't be null.");
            }

            try {
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter out = new PrintWriter(outputStream);
                Request httpRequest = Request.parse2request(socket.getInputStream());
                try {
                    String result = "";
                    String httpRes = Response.buildResponse(httpRequest, result);
                    out.print(httpRes);
                } catch (Exception e) {
                    String httpRes = Response.buildResponse(httpRequest, e.toString());
                    out.print(httpRes);
                }
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }





}
