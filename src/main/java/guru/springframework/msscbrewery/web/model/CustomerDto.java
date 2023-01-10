package guru.springframework.msscbrewery.web.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerDto {

    private UUID id;

    @NonNull
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

}
