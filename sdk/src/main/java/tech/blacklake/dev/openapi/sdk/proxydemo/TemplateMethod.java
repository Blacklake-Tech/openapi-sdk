package tech.blacklake.dev.openapi.sdk.proxydemo;

import tech.blacklake.dev.openapi.sdk.annotation.ApiPath;
import tech.blacklake.dev.openapi.sdk.proxydemo.data.*;

/**
 * @author cyc
 * @date 2022/05/16 13:29:55
 */
public interface TemplateMethod {
    @ApiPath("/material/open/v1/material/attribute/_create_or_update")
    BomResponseDTO materialAttributeCreateOrUpdate(BomRequestDTO requestDTO);

    @ApiPath("/med/open/v1/process_route/create_or_update")
    C processRouteCreateOrUpdate(D d);
}
