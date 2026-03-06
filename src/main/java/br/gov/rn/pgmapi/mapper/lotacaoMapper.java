package br.gov.rn.pgmapi.mapper;

import br.gov.rn.pgmapi.dto.LotacaoRequestDTO;
import br.gov.rn.pgmapi.dto.LotacaoResponseDTO;
import br.gov.rn.pgmapi.entity.Lotacao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface lotacaoMapper {
    Lotacao toEntity(LotacaoRequestDTO dto);
    LotacaoResponseDTO toDto(Lotacao entity);
    
}
