package com.youguu.open.rpc.client;

import com.youguu.open.rpc.client.impl.AntRpcServiceImpl;

/**
 * Created by qxd on 2015/11/30.
 */
public class AntRpcClientFactory {
    private static IAntRpcService antRpcService;


    public static IAntRpcService getTweetRpcService(){
        if (antRpcService!=null){
            return antRpcService;
        } else{
            synchronized (AntRpcClientFactory.class){
                if(antRpcService != null){
                    return antRpcService;
                }else{
                    antRpcService = new AntRpcServiceImpl();
                }
            }
        }
        return antRpcService;
    }
}