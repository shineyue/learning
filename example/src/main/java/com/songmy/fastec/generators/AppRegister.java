package com.songmy.fastec.generators;

import com.songmy.annotations.AppRegisterGenerator;
import com.songmy.latte.wechat.templates.AppRegisterTemplate;

/**
 * @author mysong
 * created on: 2018/10/19 17:11
 * description:
 */
@AppRegisterGenerator(
        packageName = "com.songmy.fastec",
        appRegisterTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
