package com.songmy.fastec.generators;

import com.songmy.annotations.PayEntryGenerator;
import com.songmy.latte.wechat.templates.WXPayEntryTemplate;

/**
 * @author mysong
 * created on: 2018/10/19 17:11
 * description:
 */
@PayEntryGenerator(
        packageName = "com.songmy.fastec",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
