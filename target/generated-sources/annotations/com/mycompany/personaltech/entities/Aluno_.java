package com.mycompany.personaltech.entities;

import com.mycompany.personaltech.entities.Endereco;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-21T15:17:22")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile SingularAttribute<Aluno, String> senha;
    public static volatile SingularAttribute<Aluno, Endereco> endereco;
    public static volatile SingularAttribute<Aluno, String> cpf;
    public static volatile SingularAttribute<Aluno, String> nome;
    public static volatile SingularAttribute<Aluno, Long> id;
    public static volatile SingularAttribute<Aluno, String> sobrenome;
    public static volatile SingularAttribute<Aluno, String> login;
    public static volatile SingularAttribute<Aluno, String> sexo;
    public static volatile SingularAttribute<Aluno, Date> dataNascimento;
    public static volatile SingularAttribute<Aluno, String> email;

}