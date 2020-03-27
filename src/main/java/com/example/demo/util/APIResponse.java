package com.example.demo.util;

import lombok.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class APIResponse<T> {

  @Getter @Setter private boolean success;

  @Getter @Setter private T payload;

  @Getter @Setter private String meta;
}
