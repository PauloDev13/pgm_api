package br.gov.rn.pgmapi.mapper;

import br.gov.rn.pgmapi.dto.SetorRequestDTO;
import br.gov.rn.pgmapi.dto.SetorResponseDTO;
import br.gov.rn.pgmapi.entity.Setor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SetorMapper {
    Setor toEntity(SetorRequestDTO dto);
    SetorResponseDTO toDto(Setor entity);
    
}
