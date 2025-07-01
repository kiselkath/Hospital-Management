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

/**
 * Entity representing a patient in the hospital.
 * <p>
 * Each patient is diagnosed and assigned to a specific doctor
 * (who is a member of the hospital staff).
 * Patients also have a bill amount representing their total hospital expenses.
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *     <li><b>id</b> - Auto-generated primary key.</li>
 *     <li><b>name</b> - Full name of the patient.</li>
 *     <li><b>diagnosis</b> - Description of the patient’s medical condition.</li>
 *     <li><b>billAmount</b> - Total amount billed to the patient (in euros).</li>
 *     <li><b>assignedDoctor</b> - Reference to the doctor responsible for this patient.</li>
 * </ul>
 *
 * This entity maps to the <b>patients</b> table and establishes a many-to-one
 * relationship with the <b>staff</b> table through the assigned doctor.
 *
 * @see Staff
 */

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