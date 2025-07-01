package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "staff")
@Getter
@Setter
@NoArgsConstructor

/**
 * Entity representing a member of hospital staff.
 * <p>
 * This can include doctors, nurses, or administrative personnel.
 * Staff are grouped by department, and doctors may have patients assigned to them.
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *     <li><b>id</b> - Auto-generated primary key.</li>
 *     <li><b>name</b> - Full name of the staff member.</li>
 *     <li><b>role</b> - Role in the hospital (e.g., "doctor", "nurse", "admin").</li>
 *     <li><b>department</b> - The department the staff belongs to (e.g., Cardiology, ER).</li>
 * </ul>
 *
 * This entity maps to the <b>staff</b> table in the PostgreSQL database.
 *
 */

public class Staff {
    //Атрибуты: id, name, role, department
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String role;

    private String department;
}