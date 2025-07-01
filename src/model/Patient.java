package model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor

public class Patient {
    //Атрибуты: id, name, diagnosis, billAmount, assignedDoctor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String diagnosis;

    @Column(name = "bill_amount", nullable = false)
    private BigDecimal billAmount;

    // Связь с врачом (сотрудником, у которого role = doctor)
    @ManyToOne
    @JoinColumn(name = "assigned_doctor_id", nullable = false)
    private Staff assignedDoctor;
}