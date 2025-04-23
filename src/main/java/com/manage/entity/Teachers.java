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
public class Teachers implements Serializable {

    private static final long serialVersionUID = 1L;

    private String teacherId;

    private String name;


}
