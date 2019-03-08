package com.straore.MarketPlace.repository;

import com.straore.MarketPlace.domain.Offer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(exported = false)
public interface OfferRepository extends PagingAndSortingRepository<Offer,Long> {

    List<Offer> findAll();
}
