package com.po.services.impl;

import com.po.dtos.PO_DATA;
import com.po.repositories.PoDetailRepository;
import com.po.services.PoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PoServiceImpl implements PoService {

    private final PoDetailRepository poDetailRepository;

    //save po detail
    public void savePoDetail(List<PO_DATA> poDataList)
}
