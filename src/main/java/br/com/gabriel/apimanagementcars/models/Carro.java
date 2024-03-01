package br.com.gabriel.apimanagementcars.models;

import br.com.gabriel.apimanagementcars.utils.StatusCarEnum;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"chassi","placa"})})
public class Carro {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String chassi;

    private String name;

    private String manufacturer;

    private int year;

    private String color;

    private StatusCarEnum status;

    @NotNull
    private String placa;


}
