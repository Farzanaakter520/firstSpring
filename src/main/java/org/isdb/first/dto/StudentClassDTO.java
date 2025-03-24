package org.isdb.first.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentClassDTO {
    private String name;
    private Integer classTeacherId;
    private Integer roomNumber;
    
}
