package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerServiceV2 {
    BeerDto getBeerById(UUID beerId);


    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(BeerServiceV2 beerService);
}
