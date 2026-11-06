package dev.everton.ApiCadastroDePessoas.Pessoas;

import dev.everton.ApiCadastroDePessoas.Profissoes.ProfissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_pessoas")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    @Column(unique = true)
    private String email;
    @ManyToOne // Uma pessoa pode ter uma profissão
    @JoinColumn(name = "profissoes_id") // Foreing key
    private ProfissoesModel profissoes;
}
