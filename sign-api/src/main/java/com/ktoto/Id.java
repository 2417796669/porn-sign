package com.ktoto;

/**
 * @Description
 * @Author KToTo
 * @Date 2019/3/28 22:51
 **/
public class Id {
    /**
     * 1位，用来做拓展位或者扩容时的临时方案
     */
    int version;

    /**
     * 区分最大峰值型和最小粒度型
     */
    int type;

    /**
     * 2位，生成方式，用来区分三种发布模式：嵌入发布模式，中心服务器发布模式，REST发布模式
     */
    int genType;

    /**
     * 秒级时间
     */
    Long time;

    /**
     * 序列号
     */
    Long sequence;

    /**
     * 机器ID， 10位，可容纳1024个机器。如果使用嵌入发布模式，需注意
     */
    int mechineId;
}
