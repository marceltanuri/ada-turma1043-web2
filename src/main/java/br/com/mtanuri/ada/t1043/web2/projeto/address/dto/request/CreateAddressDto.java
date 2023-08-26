package br.com.mtanuri.ada.t1043.web2.projeto.address.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Objects;

@Data
public class CreateAddressDto {
    private @NotNull String zipCode;
    private  @NotNull String street;
    private @NotNull String neighborhood;
    private @NotNull String city;
    private @NotNull @Length(max = 2, min = 2) String state;

}
