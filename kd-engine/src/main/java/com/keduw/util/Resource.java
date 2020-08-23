package com.keduw.util;

import java.io.InputStream;

public class Resource {

    /**
     * 读取配置文件信息
     * @param path
     * @return
     */
    public static InputStream getResourceAsStream(String path){
        InputStream resourceAsStream = Resource.class.getResourceAsStream(path);
        return resourceAsStream;
    }
}
