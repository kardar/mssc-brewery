package guru.springframework.msscbrewery.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Customer {

    private UUID id;

    private String name;
}
