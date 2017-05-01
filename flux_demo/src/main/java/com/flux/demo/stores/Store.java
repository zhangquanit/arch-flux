package com.flux.demo.stores;

import com.flux.demo.actions.Action;

import org.greenrobot.eventbus.EventBus;

/**
 * @author 张全
 */

public abstract class Store {

    /**
     *  View添加和注销监听
     * @param view
     */
    public void register(final Object view){
        EventBus.getDefault().register(view);
    }
    public void unregister(final Object view){
        EventBus.getDefault().unregister(view);
    }

    /**
     * 发送事件更新View
     */
    void emitStoreChange() {
        EventBus.getDefault().post(changeEvent());
    }

    /**
     * 处理Dispatcher派发过来的事件
     * @param action
     */
   public abstract void onAction(Action action);

    public abstract StoreChangeEvent changeEvent();


    public class StoreChangeEvent {}
}
