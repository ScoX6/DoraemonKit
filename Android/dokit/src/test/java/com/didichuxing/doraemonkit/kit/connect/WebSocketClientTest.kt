package com.didichuxing.doraemonkit.kit.connect

import com.didichuxing.doraemonkit.kit.connect.data.TextPackage
import com.didichuxing.doraemonkit.kit.connect.ws.OkHttpWebSocketSession
import com.didichuxing.doraemonkit.kit.connect.ws.OnWebSocketTextPackageListener
import com.didichuxing.doraemonkit.kit.connect.ws.WebSocketClient
import org.junit.Test


/**
 * didi Create on 2022/4/13 .
 *
 * Copyright (c) 2022/4/13 by didiglobal.com.
 *
 * @author <a href="realonlyone@126.com">zhangjun</a>
 * @version 1.0
 * @Date 2022/4/13 10:51 上午
 * @Description 用一句话说明文件功能
 */

class WebSocketClientTest {

    private val webSocketClient: WebSocketClient = WebSocketClient()


    @Test
    fun test(){
        webSocketClient.connect("ws://172.23.165.169:8000/proxy/multicontrol/ILJLQCCF")
        webSocketClient.onWebSocketTextPackageListenerSet.add(object :OnWebSocketTextPackageListener{
            override fun onReceiveTextPackage(webSocket: OkHttpWebSocketSession, textPackage: TextPackage) {

            }
        })

        Thread.currentThread().join()
    }
}
