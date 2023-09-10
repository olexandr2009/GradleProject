package org.example;

import lombok.*;

import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class User {
    @Builder.Default
    String name = "no name";
    @Builder.Default
    String lastName = "no lastName";
}
