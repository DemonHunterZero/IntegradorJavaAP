package integador.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Incidente")

public class Incidente {
    @Id
    @Column(name = "idIncidente")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idIncidente;

    @ManyToOne
    @JoinColumn(name= "Operador_idOperador", referencedColumnName= "idOperador")
    private Operador operador;

    @ManyToOne
    @JoinColumn(name= "Servicios_idServicios", referencedColumnName= "idServicios")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name= "Clientes_idClientes", referencedColumnName= "idClientes")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name= "Tecnicos_idTecnicos", referencedColumnName= "idTecnicos")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name= "Tipo_Incidente_idTipo_Incidente", referencedColumnName= "idTipo_Incidente")
    private TipoIncidente tipoIncidente;


    @Column(name = "FechaInicial")
    private LocalDate fechaInicial;

    @Column(name = "FechaFinal")
    private LocalDate fechaResolucion;

    @Column(name = "Lugar")
    private String lugar;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Estado")
    private boolean estado;
}