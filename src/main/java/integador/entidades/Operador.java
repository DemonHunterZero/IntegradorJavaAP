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
@Table(name = "Operador")

public class Operador {
    @Id
    @Column(name = "idOperador")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idOperador;

    @OneToMany
    private List<Incidente> incidente;


    @Column(name = "Nombre_Apellido")
    private String nombreYApellidoOperador;

    @Column(name = "Turno")
    private String turno;

    @Column(name = "DNI")
    private int dni;

    @Column(name = "CUIT")
    private int cuit;


}