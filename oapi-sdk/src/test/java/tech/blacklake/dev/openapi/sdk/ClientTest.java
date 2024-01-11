package tech.blacklake.dev.openapi.sdk;


import tech.blacklake.dev.holyfile.open.co.CustomObjectFileVO;
import tech.blacklake.dev.holyfile.open.co.FileCO;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.constants.enums.BaseUrlEnum;
import tech.blacklake.infra.boot.common.data.Result;

class ClientTest {

    private void test(){
        BlacklakeSdkClient client = BlacklakeSdkClient.newBuilder("appKey", "appSecret")
            .appType(AppTypeEnum.SELF_BUILT)
            .openBaseUrl(BaseUrlEnum.BLACKLAKE_OPENAPI_ALI_PROD)
            .logReqAtDebug(true)
            .build();
        FileCO fileCO = new FileCO(12);
        Result<CustomObjectFileVO> fileInfoById = client.file4CustomObjectOpenApi.getFileInfoById(fileCO);
    }
}