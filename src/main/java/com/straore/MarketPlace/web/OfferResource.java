package com.straore.MarketPlace.web;

import com.straore.MarketPlace.domain.Offer;
import com.straore.MarketPlace.repository.OfferRepository;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/offer")
public class OfferResource {
    private OfferRepository offerRepository;

    public OfferResource(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @GetMapping("/list")
    public List<Offer> listOffers() {
        List<Offer> offerList = offerRepository.findAll();
        return offerList;

    }

    @GetMapping("/id")
    public Optional<Offer> findOffer(@PathParam("id") Long id) {
        return offerRepository.findById(id);

    }

    @PostMapping("/add")
    public Long createOffer(@RequestBody Offer offer) {
        Offer createdOffer = offerRepository.save(offer);
        return createdOffer.id;

    }
}
