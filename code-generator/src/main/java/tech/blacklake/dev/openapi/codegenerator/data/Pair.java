package tech.blacklake.dev.openapi.codegenerator.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cuiyichen
 * @date 2022/05/18 14:23:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pair<L, R> {
    private L left;
    private R right;
}
