package com.manage.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yourname
 * @since 2025-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Courses implements Serializable {

    private static final long serialVersionUID = 1L;

    private String courseId;

    private String name;

    private String teacherId;

    private Integer credit;

    private Integer grade;

    private Integer canceledYear;


}
