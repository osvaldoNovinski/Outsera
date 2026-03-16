package com.github.osvaldo.outsera.pioresFilmesAPI.service;

import com.github.osvaldo.outsera.pioresFilmesAPI.dto.IntervaloDTO;
import com.github.osvaldo.outsera.pioresFilmesAPI.dto.ResultadoDTO;
import com.github.osvaldo.outsera.pioresFilmesAPI.model.Filme;
import com.github.osvaldo.outsera.pioresFilmesAPI.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public Map<String, List<Long>> trataProdutorPorAno(){

        List<Filme> vencedores = filmeRepository.findAll().stream().filter(f -> "yes".equalsIgnoreCase(f.getVencedor())).toList();

        Map<String, List<Long>> produtorPorAno = new HashMap<>();

        for (Filme filme : vencedores) {
            String produtor = filme.getProdutor();

            String[] produtores = produtor.split(",\\s*|\\band\\s+");

            for (String p : produtores) {
                if (!p.isEmpty()) {
                    p = p.replace(" ", "");
                    if (!produtorPorAno.containsKey(p)) {
                        produtorPorAno.put(p, new ArrayList<>());
                    }

                    produtorPorAno.get(p).add(filme.getAno());
                }
            }

        }

        return produtorPorAno;
    }

    public ResultadoDTO calculaIntervalo(){
        Long maiorIntervalo = Long.MIN_VALUE;
        Long menorIntervalo = Long.MAX_VALUE;

        ResultadoDTO resultadoDTO = new ResultadoDTO();

        Map<String, List<Long>> anosPorProdutor = trataProdutorPorAno();

        for(String produtor : anosPorProdutor.keySet()){
            List <Long> anos = anosPorProdutor.get(produtor);

            if (anos.size() < 2) continue;

            Collections.sort(anos);

            for (int i = 1; i < anos.size(); i++) {
                Long intervalo = anos.get(i) - anos.get(i - 1);
                IntervaloDTO dto = new IntervaloDTO(produtor, intervalo, anos.get(i - 1), anos.get(i));

                if (intervalo > maiorIntervalo) {
                    maiorIntervalo = intervalo;
                    resultadoDTO.setMaiorIntervalo(new ArrayList<>());
                    resultadoDTO.getMaiorIntervalo().add(dto);
                } else if (intervalo.equals(maiorIntervalo)) {
                    resultadoDTO.getMaiorIntervalo().add(dto);
                }

                if (intervalo < menorIntervalo) {
                    menorIntervalo = intervalo;
                    resultadoDTO.setMenorIntervalo(new ArrayList<>());
                    resultadoDTO.getMenorIntervalo().add(dto);
                } else if (intervalo.equals(menorIntervalo)) {
                    resultadoDTO.getMenorIntervalo().add(dto);
                }
            }

        }


        return resultadoDTO;
    }


}
