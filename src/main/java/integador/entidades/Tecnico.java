package integador.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tecnicos")
public class Tecnico {

    @OneToMany
    private List<Incidente> indicente;

    @ManyToMany
    private List<TecEspecialidad> especialidades;


    @Id
    @Column(name= "idTecnicos")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTecnico;

    @Column(name ="Nombre_Apellido")
    private String nombreYApellidoTecnico;

    @Column(name = "DNI")
    private int dniTecnico;

    @Column(name = "Edad")
    private int edadTecnico;

    @Column(name = "Turno")
    private String turnoTecnico;

    @Column(name = "Disponibilidad")
    private boolean disponibilidad;


}
