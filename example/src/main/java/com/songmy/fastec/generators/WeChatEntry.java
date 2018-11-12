package com.songmy.fastec.generators;

import com.songmy.annotations.EntryGenerator;
import com.songmy.latte.wechat.templates.WXEntryTemplate;

/**
 * @author mysong
 * created on: 2018/10/19 17:11
 * description:
 */
@EntryGenerator(
        packageName = "com.songmy.fastec",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
