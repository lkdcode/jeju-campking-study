package com.jeju_campking.campking.party.service;

import com.jeju_campking.campking.party.dto.request.PartyModifyRequestDTO;
import com.jeju_campking.campking.party.dto.request.PartySaveRequestDTO;
import com.jeju_campking.campking.party.dto.response.PartyAllListResponseDTO;
import com.jeju_campking.campking.party.repository.PartyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PartyService {

    private final PartyMapper partyMapper;

    public List<PartyAllListResponseDTO> findAllBySort(String type, String sort) {
        log.info("partyService/findAllBySort : {} , {}", type, sort);

        return partyMapper.findAllBySort(type, sort);
    }

    public boolean save(PartySaveRequestDTO dto) throws SQLException {
        log.info("partyService/save : {}", dto);

        boolean isSave = partyMapper.save(dto);


        if (!isSave) {
            log.warn("party/Service/save WARN ! : {}", dto);
            throw new SQLException();
        }

        return true;
    }

    public boolean deleteByNumber(Long partyNumber) throws SQLException {
        log.info("partyService/deleteByNumber : {}", partyNumber);

        boolean isDelete = partyMapper.deleteByNumber(partyNumber);

        if (!isDelete) {
            log.warn("party/Service/deleteByNumber WARN ! : {}", partyNumber);
            throw new SQLException();
        }

        return true;
    }

    public boolean modify(PartyModifyRequestDTO dto) throws SQLException {
        log.info("partyService/modify : {}", dto);

        boolean isModify = partyMapper.modify(dto);
        if (!isModify) {
            log.warn("party/Service/modify WARN ! : {}", dto);
            throw new SQLException();
        }

        return true;
    }
}
