package iyteyazilim.projects.haydos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reports {



    @GeneratedValue
    @Id
    private Long id  ;

    private Paws aboutPaw ;

    private String report  ;

    private Date  date ;

    private User user ;


 }
