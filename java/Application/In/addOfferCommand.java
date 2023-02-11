public class AddOfferCommand {
    private String name;
    private BigDecimal price;
    private LocalDateTime expirationDate;

    // Constructeur, getters et setters
}

public class AddOfferCommandHandler {
    private OfferService offerService;

    public AddOfferCommandHandler(OfferService offerService) {
        this.offerService = offerService;
    }

    public Offer handle(AddOfferCommand command) {
        return offerService.addOffer(command.getName(), command.getPrice(), command.getExpirationDate());
    }
}
