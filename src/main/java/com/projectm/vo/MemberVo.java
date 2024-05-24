package com.projectm.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.projectm.vo
 * @description: 邀请用户-vo

 **/
@Builder
@Data
public class MemberVo {

    private String accountCode;
    private String avatar;
    private String name;
    private String email;
    private boolean joined;

}
