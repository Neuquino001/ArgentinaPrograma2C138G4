 
package com.grupoutn.tpintegrador;

import javax.persistence.*;
import lombok.Data;
 
@Data
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    double id;
    String nombreServicio;
}
