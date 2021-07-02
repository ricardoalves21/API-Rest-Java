package com.zup.apirestexterna.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PostDTO {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
