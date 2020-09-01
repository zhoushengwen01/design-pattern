package com.composite;

/**
 * @desc : 组合实体
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}

