package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addPortfolio(@RequestParam User user_id, @RequestParam String portfolioName, @RequestParam String portfolioDescription, @RequestParam Integer investedValue, @RequestParam Integer currentValue, @RequestParam String creationDate) {
        Portfolio portfolio = new Portfolio();
        portfolio.setUser(user_id);
        portfolio.setPortfolioName(portfolioName);
        portfolio.setPortfolioDescription(portfolioDescription);
        portfolio.setInvestedValue(investedValue);
        portfolio.setCurrentValue(currentValue);
        portfolio.setCreationDate(creationDate);
        portfolioRepository.save(portfolio);
        return "Portfolio added";
    }

    @GetMapping(path="/get")
    public @ResponseBody Iterable<Portfolio> getAllPortfolio()  {
        return portfolioRepository.findAll();
    }

}
