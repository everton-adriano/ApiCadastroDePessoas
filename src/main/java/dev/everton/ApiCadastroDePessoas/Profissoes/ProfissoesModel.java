package dev.everton.ApiCadastroDePessoas.Profissoes;

import dev.everton.ApiCadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity // Diz que essa classe é uma entidade no banco de dados
@Table(name = "tb_profissoes")
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os argunmentos
@Data // Cria Getters e Setters

public class ProfissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String profissao;
    private String nivel;

    @OneToMany(mappedBy = "profissoes") // Uma profissao pode ter várias pessoas
    private List<PessoaModel> pessoas;
}
