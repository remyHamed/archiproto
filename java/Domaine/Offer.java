public class Offer {
    private UUID id;
    private String name;
    private BigDecimal price;
    private LocalDateTime expirationDate;

    // Constructeur, getters et setters
}

public interface OfferRepository {
    Offer save(Offer offer);
    Offer findById(UUID id);
    List<Offer> findAll();
}

public class OfferService {
    private OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public Offer addOffer(String name, BigDecimal price, LocalDateTime expirationDate) {
        Offer offer = new Offer(UUID.randomUUID(), name, price, expirationDate);
        return offerRepository.save(offer);
    }
}
