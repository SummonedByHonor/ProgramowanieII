package Zadanie3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {

    private String name;
    private String lastname;
    private String telephoneNumber;
    private String email;

}
