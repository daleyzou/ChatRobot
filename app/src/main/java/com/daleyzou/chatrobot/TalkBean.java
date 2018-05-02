package com.daleyzou.chatrobot;

/***
 * 提问和回答的对象封装
 */
public class TalkBean {
    public String content;

    public boolean isAsk;

    public int imageId;

    public TalkBean(String content, boolean isAsk, int imageId) {
        this.content = content;
        this.isAsk = isAsk;
        this.imageId = imageId;
    }
}
