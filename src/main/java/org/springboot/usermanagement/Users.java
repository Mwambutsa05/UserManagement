package org.springboot.usermanagement;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String firstName;
    private String lastName;
    private String role;
    private String email;
    private int number;
    @CreationTimestamp
    private Date create_at;
    @UpdateTimestamp
    private Date update_at;
}
