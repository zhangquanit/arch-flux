package com.flux.demo.dispatcher;

import com.flux.demo.actions.Action;
import com.flux.demo.stores.Store;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张全
 */
public class Dispatcher {
    private static Dispatcher instance;
    /**
     * 管理注册的Store，比如设置监听顺序，过滤监听等，这里先简单实现。
     */
    private final List<Store> stores = new ArrayList<>();

    private Dispatcher() {

    }

    public static Dispatcher getInstance() {
        if (null == instance) {
            synchronized (Dispatcher.class) {
                if (null == instance) {
                    instance = new Dispatcher();
                }
            }
        }
        return instance;
    }

    /**
     *  注册和销毁Store，以便给Store发送事件
     * @param store
     */
    public void register(final Store store) {
        stores.add(store);
    }
    public void unregister(final Store store){
        stores.remove(store);
    }

    /**
     * 发送事件给Store
     * @param action
     */
    public void dispatch(Action action){
        for (Store store : stores) {
            store.onAction(action);
        }
    }

}
