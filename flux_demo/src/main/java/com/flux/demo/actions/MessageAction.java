package com.flux.demo.actions;

import com.flux.demo.model.MsgBean;

/**
 * @author 张全
 */

public class MessageAction extends Action<MessageAction.ActionTypes,MsgBean> {


    public MessageAction(ActionTypes actionTypes) {
        super(actionTypes);
    }

    public MessageAction(ActionTypes actionTypes, MsgBean msgBean) {
        super(actionTypes, msgBean);
    }

    public enum  ActionTypes{
        ADD,
        DELETE;
}
}
