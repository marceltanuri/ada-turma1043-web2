package br.com.mtanuri.ada.t1043.web2.projeto.exception.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class ValidationErrorDto {
    private String error;
    private String field;

}
