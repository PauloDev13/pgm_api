package br.gov.rn.pgmapi.service;

import br.gov.rn.pgmapi.dto.ServidorRequestDTO;
import br.gov.rn.pgmapi.dto.ServidorResponseDTO;
import br.gov.rn.pgmapi.entity.Servidor;
import br.gov.rn.pgmapi.exception.BusinessException;
import br.gov.rn.pgmapi.exception.ResourceNotFoundException;
import br.gov.rn.pgmapi.mapper.ServidorMapper;
import br.gov.rn.pgmapi.repository.ServidorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ServidorService {
    private final ServidorRepository servidorRepository;
    private final ServidorMapper servidorMapper;

    @Transactional
    public ServidorResponseDTO create(ServidorRequestDTO dto) {
        if (servidorRepository.existsByCpf(dto.cpf())) {
            throw new BusinessException("CPF já cadastrado");
        }
        Servidor entity = servidorMapper.toEntity(dto);
        return servidorMapper.toDto(servidorRepository.save(entity));
    }

    @Transactional(readOnly = true)
    public Page<ServidorResponseDTO> findAll(Pageable pageable) {
        return servidorRepository.findAll(pageable).map(servidorMapper::toDto);
    }

    @Transactional(readOnly = true)
    public ServidorResponseDTO findById(Integer id) {
        return servidorRepository.findById(id)
                .map(servidorMapper::toDto)
                .orElseThrow(() -> new ResourceNotFoundException("Servidor não encontrado"));
    }

    @Transactional
    public ServidorResponseDTO update(Integer id, ServidorRequestDTO dto) {
        Servidor existing = servidorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Servidor não encontrado"));

        // Atualiza os dados via mapper (necessário configurar @MappingTarget no MapStruct se preferir)
        Servidor updatedInfo = servidorMapper.toEntity(dto);
        updatedInfo.setId(existing.getId());

        return servidorMapper.toDto(servidorRepository.save(updatedInfo));
    }

    @Transactional
    public void delete(Integer id) {
        if (!servidorRepository.existsById(id)) {
            throw new ResourceNotFoundException("Servidor não encontrado");
        }
        servidorRepository.deleteById(id);
    }
}
