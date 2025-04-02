package com.example.accessingdatamysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path="/stocks")
public class StocksController {

    @Autowired
    private StocksRepository stocksRepository;

    @PostMapping(path = "/addStocks")
    public @ResponseBody String addStock(@RequestParam Portfolio portfolio_id, @RequestParam String name, @RequestParam Integer quantity, @RequestParam Integer currentPrice, @RequestParam Integer purchasePrice, @RequestParam Date purchaseDate, @RequestParam Date sellDate) {

        Stocks stocks = new Stocks();
        stocks.setPortfolio(portfolio_id);
        stocks.setName(name);
        stocks.setQuantity(quantity);
        stocks.setCurrentPrice(currentPrice);
        stocks.setPurchasePrice(purchasePrice);
        stocks.setPurchaseDate(purchaseDate);
        stocks.setSellDate(sellDate);
        stocksRepository.save(stocks);
        return "Stock Created";
    }

    @GetMapping(path = "/getStocks")
    public @ResponseBody Iterable<Stocks> getAllStocks() {
        return stocksRepository.findAll();
    }
}
