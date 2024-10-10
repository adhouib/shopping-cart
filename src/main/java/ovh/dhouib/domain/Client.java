package ovh.dhouib.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract sealed class Client permits PersonalClient, ProfessionalClient {
    protected String id;

    public abstract Double getHighPhonePrice();
    public abstract Double getLowPhonePrice();
    public abstract Double getLaptopPrice();
}
