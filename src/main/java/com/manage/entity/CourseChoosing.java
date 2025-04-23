package com.manage.entity;

import java.math.BigDecimal;
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
public class CourseChoosing implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studentId;

    private String courseId;

    private String teacherId;

    private Integer chosenYear;

    private BigDecimal score;


}
