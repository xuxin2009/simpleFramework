package org.simpleFramework.util;


import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.io.File;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package org.simpleFramework.util
 * @Description: TODO
 * @date Date : 2021年01月14日 14:14
 */

@Slf4j
public class ClassUtil {

    public static final String FILE_PROTOCOL = "file";

    /**
     * 获取包下类集合
     * @param packageName 包路径
     * @return 类集合
     */
    public static Set<Class<?>> extractPackageName(String packageName){
        //1. 获取到类的加载器
        ClassLoader classLoader = getClassLoader();
        //2. 通过类的加载器获取加载的资源信息
       URL url= classLoader.getResource(packageName.replace(".", "/"));

       //注意做非空判断,如果为空的话则直接返回并打印日志
       if(url == null)
       {
           log.warn("unable to retrieve anything from package " + packageName);
           return null;
       }
        Set<Class<?>> classSet = null;
        //3. 根据不同的资源类型，采用不同的方式获取资源的集合
        if(url.getProtocol() == FILE_PROTOCOL){
            classSet = new HashSet<>();
            //根据路径查找到当前目录下所有的文件（包括文件夹）
            File packageDirectory = new File(url.getPath());

            extractClassFile(classSet,packageDirectory,packageName );

        }

        return null;
    }

    /**
     *
     * @param classSet
     * @param packageDirectory
     * @param packageName
     */
    private static void extractClassFile(Set<Class<?>> classSet, File packageDirectory, String packageName) {


    }

    /**
     * 获取类加载器
     * @return 类加载器
     */
    private static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static void main(String[] args) {
        extractPackageName("com.sean");
    }

}
