package cat.tecnocampus.notes2425.domain;

import java.util.List;
import jakarta.persistence.*;


@Entity
@Table(name = "Use_lab")
public record UserLab(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id,

        @Column(nullable = false, unique = true, length = 255)
        String username,

        @Column(nullable = false, unique = true, length = 255)
        String email) {
}
