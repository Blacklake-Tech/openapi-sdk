package tech.blacklake.dev.openapi.sdk.event;

import tech.blacklake.dev.openapi.sdk.event.model.EventReq;
import tech.blacklake.dev.openapi.sdk.event.model.EventResp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletAdapter {

    private static final HttpTranslator HTTP_TRANSLATOR = new HttpTranslator();

    /**
     * 处理消息事件
     *
     * @param req
     * @param response
     * @param eventDispatcher
     * @throws Throwable
     */
    public void handleEvent(HttpServletRequest req, HttpServletResponse response,
                            EventDispatcher eventDispatcher) throws IOException {
        // 转换请求对象
        EventReq eventReq = HTTP_TRANSLATOR.translate(req);

        // 处理请求
        EventResp resp = eventDispatcher.handle(eventReq);

        // 回写结果
        HTTP_TRANSLATOR.write(response, resp);
    }
}