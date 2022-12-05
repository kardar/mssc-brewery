package guru.springframework.msscbrewery.bootstrap;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.domain.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class BeerLoader implements CommandLineRunner {


    @Autowired
   private  BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       loadBeerObject();
    }

    private void loadBeerObject() {
        if (beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                            .beerName("Mango Jeans")
                            .beerStyle("IPA")
                            .qualityToBrew(200)
                            .minOnHand(13)
                            .upc(1232123L)
                            .price(new BigDecimal("12.34"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Maria Kaye")
                    .beerStyle("CPA")
                    .qualityToBrew(400)
                    .minOnHand(103)
                    .upc(1234232123L)
                    .price(new BigDecimal("23"))
                    .build());
        }
        System.out.println("Beer Repo count: "+ beerRepository.count());
    }
}
