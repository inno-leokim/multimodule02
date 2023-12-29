//package명을 enum -> enums로 수정. enum은 예약어이기 때문에 package명으로 부적절.
package com.brand13.modulecommon.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum CodeEnum {
    SUCCESS("0000", "SUCCESS"),
    UNKNOWN_ERROR("9999", "UNKNOWN_ERROR");

    private String code;
    private String message;
}
