package com.straore.MarketPlace.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offer {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotNull(message = "Who is the owner of this ad?")
    private String owner;

    @NotNull(message = "Please, inform a title for your ad.")
    private String title;

    @NotNull
    public String description;

    @Min(message = "Price cannot be negative", value = 0)
    public BigDecimal price;

}
