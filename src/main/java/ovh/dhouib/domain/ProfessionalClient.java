package ovh.dhouib.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class ProfessionalClient extends Client {

    private String companyName;
    private String siren;
    private String vatNumber;
    private Double annualRevenue;

    public ProfessionalClient(String id, String companyName, String siren, String vatNumber, Double annualRevenue) {
        super(id);
        this.companyName = companyName;
        this.siren = siren;
        this.vatNumber = vatNumber;
        this.annualRevenue = annualRevenue;
    }


    @Override
    public Double getHighPhonePrice() {
        return 10_000_000 < annualRevenue ? 1000d : 1150d;
    }

    @Override
    public Double getLowPhonePrice() {
        return 10_000_000 < annualRevenue  ? 550d : 600d;
    }

    @Override
    public Double getLaptopPrice() {
        return 10_000_000 < annualRevenue ? 900d : 1000d;
    }
}
