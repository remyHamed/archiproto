package interface.web;

import Application.OfferService;
import Domaine.Offer;

public class OfferController {
    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    public void addOffer(Offer offer) {
        offerService.addOffer(offer);
    }

    public void removeOffer(Offer offer) {
        offerService.removeOffer(offer);
    }

   



