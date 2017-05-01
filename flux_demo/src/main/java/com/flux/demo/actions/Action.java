package com.flux.demo.actions;

/**
 * @author 张全
 */

public class Action<TYPE,DATA> {
    private  TYPE type; //定义了事件的类型。
    private  DATA data; //数据，装载了本次操作。

    public Action(TYPE type){
        this.type=type;
    }

    public Action(TYPE type, DATA data) {
        this.type = type;
        this.data = data;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public DATA getData() {
        return data;
    }

    public void setData(DATA data) {
        this.data = data;
    }
}
