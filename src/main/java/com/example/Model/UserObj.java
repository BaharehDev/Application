package com.example.Model;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@AllArgsConstructor
@Builder
public class UserObj {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String emailAdress;
    private String username;
    private String password;
    private String phone;

    /*@ElementCollection : to specify a collection of basic value types or embeddable objects as part of an entity class.
    It is typically used to represent a one-to-many or many-to-many relationship where the related objects are stored directly within the owning entity's table, rather than in a separate table.
    Specifying the target type: By default, JPA assumes the target type of the collection is a basic value type (e.g., String, Integer).
    If you want to use an embeddable object instead, you can specify the target class using the targetClass attribute:*/
    @ElementCollection(targetClass = CategoryType.class)
    @JoinTable(name = "categories_table", joinColumns = @JoinColumn(name = "user_id"))
    /*The @Enumerated annotation is used in Java Persistence API (JPA) to specify how an enumerated (enum) type should be persisted in the database.
    It is typically used to map the enum values to their corresponding database representations.
    A list of CategoryType of the entity class will be mapped to a database column, and the enum values will be persisted as strings*/
    @Enumerated(EnumType.STRING)
    private List<CategoryType> categoryTypes;

/*    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }*/
}
