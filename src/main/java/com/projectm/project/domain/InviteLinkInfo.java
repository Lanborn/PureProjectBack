package com.projectm.project.domain;

import com.projectm.member.domain.Member;
import com.projectm.org.domain.Organization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InviteLinkInfo {
    private Integer id;
    private String code;
    private String create_by;
    private String invite_type;
    private String source_code;
    private String create_time;
    private String over_time;
    private String name;
    private Member member;
    private Organization organization;
    private Project projectInfo;
}
