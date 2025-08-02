package org.sda.builder;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EasyBuilderPerson {
    private String name, surname, email, address;
    private int age;


    public static void main(String[] args) {
        EasyBuilderPerson person = EasyBuilderPerson.builder()
                .name("Gledis")
                .address("Tirana")
                .age(22)
                .email("Test@gmail.com")
                .build();
    }
}
