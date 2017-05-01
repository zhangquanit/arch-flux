package com.flux.demo.stores;

import com.flux.demo.actions.Action;
import com.flux.demo.actions.MessageAction;

/**
 * @author 张全
 */

public class MessageStore extends Store {
    @Override
    public void onAction(Action action) {
        Object type = action.getType();
        switch (type) {
            case MessageAction.ActionTypes.ADD:

                break;
        }
    }

    @Override
    public StoreChangeEvent changeEvent() {
        return null;
    }
}
