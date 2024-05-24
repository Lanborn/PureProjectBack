package com.projectm.project.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProjectMenuApply {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String icon;
    private String url;
    private String title;
    private String file_path;
    private String node;
    private Integer sort;
    private String params;
    private Integer values;

    private boolean is_inner;
    private boolean show_slider;
}
