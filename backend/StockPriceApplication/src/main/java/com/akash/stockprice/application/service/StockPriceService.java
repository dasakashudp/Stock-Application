package com.akash.stockprice.application.service;

import java.text.ParseException;
import java.util.List;

import com.akash.stockprice.application.dto.CompanyCompareRequest;
import com.akash.stockprice.application.dto.SectorCompareRequest;
import com.akash.stockprice.application.dto.StockPriceDto;

public interface StockPriceService
{
    public List<StockPriceDto> findAll();
    public StockPriceDto findById(String id);
    public void deleteById(String id);
    public List<StockPriceDto> save(List<StockPriceDto> stockPriceDtos);
    public StockPriceDto update(StockPriceDto stockPriceDto);
    public List<StockPriceDto> getStockPricesForCompanyComparison(CompanyCompareRequest compareRequest)throws ParseException;
    public List<StockPriceDto> getStockPricesForSectorComparison(SectorCompareRequest compareRequest)throws ParseException;
}
