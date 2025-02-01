package org.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.BooleanJdbcType;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "world", name = "country_language")
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String language;

    @JdbcType(BooleanJdbcType.class)
    @Column(name = "is_official", columnDefinition = "BIT")
    private Boolean isOfficial;

    private BigDecimal percentage;
}
