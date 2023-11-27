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
@Table(name = "Tec_Especialidades")

public class TecEspecialidad {

    @ManyToMany (mappedBy = "especialidades")
    private List<Tecnico> tecnicos;

    @OneToOne(mappedBy = "incidenteEspecialidad")
    private TipoIncidente tipoIncidente;

    @Id
    @Column(name = "idTec_Especialidades")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTecEspecialidad;

    @Column(name = "Tipo/Nombre")
    private String nombreTipo;


}
