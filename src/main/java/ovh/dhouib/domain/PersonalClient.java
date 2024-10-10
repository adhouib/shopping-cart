package ovh.dhouib.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class PersonalClient extends Client {

    private String firstName;
    private String lastName;

    public PersonalClient(String id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public Double getHighPhonePrice() {
        return 1500d;
    }

    @Override
    public Double getLowPhonePrice() {
        return 800d;
    }

    @Override
    public Double getLaptopPrice() {
        return 1200d;
    }
}
