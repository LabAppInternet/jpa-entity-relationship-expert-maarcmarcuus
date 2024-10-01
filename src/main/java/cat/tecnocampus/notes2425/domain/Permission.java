package cat.tecnocampus.notes2425.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "Permission")
public record Permission(

        @Id
        @ManyToOne
        @MapsId("userId")
        @JoinColumn(name = "user_id")
        UserLab owner,

        @Id
        @ManyToOne
        @MapsId("noteId")
        @JoinColumn(name = "note_id")
        Note note,

        @Column(name = "can_read", nullable = false)
        boolean canRead,

        @Column(name = "can_edit", nullable = false)
        boolean canEdit) {
}
