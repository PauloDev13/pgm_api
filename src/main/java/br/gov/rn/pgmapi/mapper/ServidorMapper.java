package br.gov.rn.pgmapi.mapper;

import br.gov.rn.pgmapi.dto.ServidorRequestDTO;
import br.gov.rn.pgmapi.dto.ServidorResponseDTO;
import br.gov.rn.pgmapi.entity.Servidor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CargoMapper.class})
public interface ServidorMapper {
    @Mapping(target = "cargo.id", source = "cargoId")
    @Mapping(target = "setor.id", source = "setorId")
    @Mapping(target = "lotacao.id", source = "lotacaoId")
    @Mapping(target = "status.id", source = "statusId")
    @Mapping(target = "vinculo.id", source = "vinculoId")
    @Mapping(target = "id", ignore = true)
    Servidor toEntity(ServidorRequestDTO dto);

    ServidorResponseDTO toDto(Servidor entity);

}