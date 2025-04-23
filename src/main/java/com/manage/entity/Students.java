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
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studentId;

    private String name;

    private String sex;

    private Integer entranceAge;

    private Integer entranceYear;


}
