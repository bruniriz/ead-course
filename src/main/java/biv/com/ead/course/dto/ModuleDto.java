package biv.com.ead.course.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModuleDto {

    @NotBlank
    private String title;
    @NotBlank
    private String description;
}
