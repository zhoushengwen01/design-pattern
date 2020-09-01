package com.composite;

/**
 * @desc : 组合实体客户端
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Client {
    private CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();

    public void printData() {
        for (String data : coarseGrainedObject.getData()) {
            System.out.println(data);
        }
    }

    public void setData(String data1, String data2) {
        coarseGrainedObject.setData(data1, data2);
    }
}
