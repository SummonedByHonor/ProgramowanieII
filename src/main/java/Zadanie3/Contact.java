package Zadanie3;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Data
@NoArgsConstructor
@Builder
public class Contact {

    private String name;
    private String lastname;
    private String telephoneNumber;
    private String email;

}
