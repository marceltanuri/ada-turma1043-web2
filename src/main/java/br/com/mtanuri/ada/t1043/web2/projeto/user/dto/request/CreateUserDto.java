package br.com.mtanuri.ada.t1043.web2.projeto.user.dto.request;

import br.com.mtanuri.ada.t1043.web2.projeto.address.dto.request.CreateAddressDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;


@Data
public class CreateUserDto {
    private @NotNull String name;
    private @NotNull @CPF String document;
    private @NotNull @Email String email;
    private @Valid @NotNull CreateAddressDto address;
}
